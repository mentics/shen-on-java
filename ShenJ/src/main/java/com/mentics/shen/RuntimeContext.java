package com.mentics.shen;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;


public class RuntimeContext {
    public static Kryo kryo = new Kryo();
    static {
        kryo.register(int.class, 1030);
    }

    public static Map<Symbol, Object> globalProperties = new HashMap<>();
    public static Map<String, Symbol> symbols = new HashMap<>();
    public static Map<Symbol, Lambda> functions = new HashMap<>();
    public static Map<String, byte[]> classes = new HashMap<String, byte[]>();

    public static final String GEN_SOURCE_DIRECTORY = "*gen-source-directory*";
    public static final Symbol SRC_DIR_SYM = symbol(GEN_SOURCE_DIRECTORY);


    public static void installGlobalConstants() {
        globalProperties.put(symbol("*stoutput*"), System.out);
        globalProperties.put(symbol("*stinput*"), System.in);
        globalProperties.put(symbol("*language*"), "Java");
        globalProperties.put(symbol("*port*"), "0.2-SNAPSHOT");
        globalProperties.put(symbol("*porters*"), "Joel Shellman");
    }

    public static void clearGlobalConstants() {
        globalProperties.remove(symbol("*stoutput*"));
        globalProperties.remove(symbol("*stinput*"));
    }

    public static Object doEval(final Object className, final Object classContent) throws Exception,
            CharSequenceCompilerException, ClassNotFoundException {
        globalProperties.put(RuntimeContext.SRC_DIR_SYM, "java/shen/gen/");
        DirectClassLoader newLoader = newLoader();
        CharSequenceCompiler compiler = new CharSequenceCompiler(newLoader, null);
        Map<String, byte[]> newClasses = EvalStuff.compileTask(
                (String) globalProperties.get(RuntimeContext.SRC_DIR_SYM), (String) className, (String) classContent,
                compiler);

        classes.putAll(newClasses);
        return runClass(newLoader().loadClass("shen.gen." + className));
    }

    public static DirectClassLoader newLoader() throws Exception {
        return new DirectClassLoader(Thread.currentThread().getContextClassLoader(), classes);
    }


    // Constructors //

    public RuntimeContext() {
        installGlobalConstants();
    }


    // Public Methods //

    public static Symbol symbol(String name) {
        Symbol s = symbols.get(name);
        if (s == null) {
            s = new Symbol(name);
            symbols.put(name, s);
        }
        return s;
    }

    public static Lambda symbolDispatch(Symbol symbol) {
        Lambda ret = functions.get(symbol);
        if (ret != null) {
            throw new ShenException("Could not find function for symbol: " + symbol);
        }
        return ret;
    }

    public static Lambda dispatch(Object obj) {
        Lambda ret;
        if (obj instanceof Lambda) {
            ret = (Lambda) obj;
        } else if (obj instanceof Symbol) {
            ret = functions.get(obj);
            if (ret == null) {
                throw new ShenException("Could not find function: " + obj);
            }
        } else {
            throw new ShenException("Attempted to dispatch on invalid object: " + obj);
        }
        return ret;
    }

    public static Lambda javaDispatch(String s) {
        return handleJavaCall(s);
    }

    private static Lambda handleJavaCall(final String label) {
        // TODO: Limitation: can't do partial application on java calls?
        if (label.endsWith(".")) {
            final String name = label.substring(0, label.length() - 1);
            return new VarLambda() {
                public Object apply(Object[] args) throws Exception {
                    Class c = RuntimeContext.newLoader().loadClass(name);
                    Constructor[] consts = c.getConstructors();
                    for (Constructor con : consts) {
                        Class[] params = con.getParameterTypes();
                        if (params.length == args.length) {
                            boolean compat = true;
                            for (int i = 0; i < params.length; i++) {
                                if (!params[i].isInstance(args[i])) {
                                    compat = false;
                                    break;
                                }
                            }
                            if (compat) {
                                return con.newInstance(args);
                            }
                        }
                    }
                    throw new ShenException("Could not find constructor for: " + name + "(" + Arrays.toString(args)
                            + ")");
                }
            };
        } else if (label.startsWith(".")) {
            final String methodName = label.substring(1);
            return new VarLambda() {
                public Object apply(Object[] args) throws Exception {
                    Object receiver = args[0];
                    Object[] javaArgs = new Object[args.length - 1];
                    for (int i = 1; i < args.length; i++) {
                        javaArgs[i - 1] = args[i];
                    }
                    Class c = receiver.getClass();
                    Method[] methods = c.getMethods();
                    for (Method method : methods) {
                        if (methodName.equals(method.getName())) {
                            Class[] params = method.getParameterTypes();
                            if (params.length == javaArgs.length) {
                                boolean compat = true;
                                for (int i = 0; i < params.length; i++) {
                                    if (!wrapperize(params[i]).isInstance(javaArgs[i])) {
                                        compat = false;
                                        break;
                                    }
                                }
                                if (compat) {
                                    return method.invoke(receiver, javaArgs);
                                }
                            }
                        }
                    }
                    throw new ShenException("Could not find method for: " + args[0] + "." + methodName + "("
                            + Arrays.toString(javaArgs) + ")");
                }

                private Class wrapperize(Class c) {
                    if (c.isPrimitive()) {
                        if (c == int.class) {
                            return Integer.class;
                        } else if (c == boolean.class) {
                            return Boolean.class;
                        }
                        // TODO: rest
                    }
                    return c;
                }
            };
        }
        return null;
    }

    public static void saveImage(FileOutputStream out) {
        clearGlobalConstants();
        // UpdateImage.writeObjects(out, globalProperties, functions, classes);
        RuntimeContext.writeObjects(out, classes, globalProperties, functions);
        installGlobalConstants();
        // System.out.println("Saved props to image: " + RuntimeContext.globalProperties);
    }

    public static void loadImage(InputStream in) {
        // System.out.println("************* LOAD IMAGE CALLED *******************");
        Input input = new Input(in);
        try {
            classes = (Map<String, byte[]>) kryo.readClassAndObject(input);
            DirectClassLoader loader = new DirectClassLoader(Thread.currentThread().getContextClassLoader(), classes);
            kryo.setClassLoader(loader);
            globalProperties = (Map<Symbol, Object>) kryo.readClassAndObject(input);
            functions = (Map<Symbol, Lambda>) kryo.readClassAndObject(input);
            installGlobalConstants();
            // System.out.println("num classes: "+RuntimeContext.classes.size());
            // System.out.println("Loaded props from image: " + RuntimeContext.globalProperties);
            // System.out.println("functions: "+RuntimeContext.functions);
        } catch (Exception e) {
            throw new ShenException(e);
        } finally {
            input.close();
        }
    }

    private static Object runClass(Class c) {
        Object result = null;
        try {
            result = registerLambda(c.getDeclaredFields());
            Method[] methods = c.getDeclaredMethods();
            for (Method method : methods) {
                String name = method.getName();
                if ("run".equals(name)) {
                    result = method.invoke(null);
                    break;
                }
            }
        } catch (Exception e) {
            ShenException.rethrow(e);
        }
        return result;
    }

    public static Symbol registerLambda(Field[] fields) throws IllegalAccessException {
        Field lambda = null;
        Field symbol = null;
        for (Field field : fields) {
            String name = field.getName();
            if ("LAMBDA".equals(name)) {
                lambda = field;
            } else if ("SYMBOL".equals(name)) {
                symbol = field;
            }
        }
        if (symbol != null) {
            Symbol sym = (Symbol) symbol.get(null);
            RuntimeContext.functions.put(sym, (Lambda) lambda.get(null));
            return sym;
        }
        return null;
    }

    public static void writeObjects(OutputStream out, Object... objects) {
        Output output = null;
        try {
            output = new Output(out);
            for (Object o : objects) {
                kryo.writeClassAndObject(output, o);
            }
        } finally {
            if (output != null) {
                output.close();
            }
        }
    }

    public static List<Object> readObjects(InputStream in, Class... classes) {
        List<Object> result = new ArrayList<>();
        Input input = null;
        try {
            input = new Input(in);
            for (Class c : classes) {
                try {
                    result.add(kryo.readClassAndObject(input));
                } catch (Exception e) {
                    e.printStackTrace();
                    result.add(e.getMessage());
                }
            }
        } finally {
            if (input != null) {
                input.close();
            }
        }
        return result;
    }
}
