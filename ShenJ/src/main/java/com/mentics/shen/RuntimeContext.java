package com.mentics.shen;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import shen.gen.Fst;
import shen.gen.ParsedKlToJava;
import shen.gen.Second;
import shen.gen.ToJavaUnit;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.io.Input;


public class RuntimeContext {
    public static Kryo kryo = new Kryo();
    static {
        kryo.register(int.class, 1030);
    }

    public static final String TEMP_DIR = System.getProperty("java.io.tmpdir");

    public static Map<Symbol, Object> globalProperties = new HashMap<>();
    public static Map<String, Symbol> symbols = new HashMap<>();
    public static Map<Symbol, Lambda> functions = new HashMap<>();

    public static Map<String, byte[]> classes = new HashMap<String, byte[]>();


    public static void installGlobalConstants() {
        globalProperties.put(symbol("*stoutput*"), System.out);
        globalProperties.put(symbol("*stinput*"), System.in);
        globalProperties.put(symbol("*language*"), "Java");
        globalProperties.put(symbol("*port*"), "0.1");
        globalProperties.put(symbol("*porters*"), "Joel Shellman");
    }

    public static void clearGlobalConstants() {
        globalProperties.remove(symbol("*stoutput*"));
        globalProperties.remove(symbol("*stinput*"));
    }

    public static Object evalKl(Object ast) throws Exception {
        // TODO: we need to compile in a temporary location so it doesn't get "stuck" on the classpath
        // Right now we're deleting it. Maybe that's sufficient.
        // System.out.println(ast);
        final Object javaInfo = ParsedKlToJava.LAMBDA.apply(ast);

        final Object f4045 = Fst.LAMBDA.apply(javaInfo);
        final Object f4046 = Second.LAMBDA.apply(javaInfo);
        final Object unit4044 = ToJavaUnit.LAMBDA.apply(f4045, f4046);
        final Object className = Fst.LAMBDA.apply(unit4044);
        final Object classContent = Second.LAMBDA.apply(unit4044);

        globalProperties.put(UpdateImage.SRC_DIR_SYM, "src/main/shen/gen/");
        globalProperties.put(UpdateImage.COMPILE_DIR_SYM, "target/classes/");

        Map<String, byte[]> newClasses = UpdateImage.compile((String) className, (String) classContent);
        // TODO: classes.putAll(newClasses);
        return runClass(loadClass("shen.gen." + className));
        // return null;
    }

    public static Class loadClass(String name) throws Exception {
        return new DirectClassLoader(Thread.currentThread().getContextClassLoader(), classes).loadClass(name);
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
        return functions.get(symbol);
    }

    public static Lambda dispatch(Object obj) {
        if (obj instanceof Lambda) {
            return (Lambda) obj;
        } else if (obj instanceof Symbol) {
            return functions.get(obj);
        } else {
            throw new ShenException("Attempted to dispatch on invalid object: " + obj);
        }
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
                    Class c = RuntimeContext.loadClass(name);
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
        UpdateImage.writeObjects(out, classes, globalProperties, functions);
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

    public static Object runClass(Class c) {
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
}
