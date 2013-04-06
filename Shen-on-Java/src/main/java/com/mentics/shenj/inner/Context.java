package com.mentics.shenj.inner;

import static com.mentics.shenj.ShenException.*;
import static com.mentics.shenj.ShenjRuntime.*;
import static com.mentics.util.KryoUtil.*;
import static com.mentics.util.ReflectionUtil.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import shenj.platform.CallInfoSymbolToJavaCallInfo;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import com.mentics.shenj.Label;
import com.mentics.shenj.Lambda;
import com.mentics.shenj.Lambda2;
import com.mentics.shenj.Nil;
import com.mentics.shenj.ShenException;
import com.mentics.shenj.ShenjRuntime;
import com.mentics.shenj.ShenjUtil;
import com.mentics.shenj.Symbol;
import com.mentics.shenj.VarLambda;
import com.mentics.shenj.cl.DirectClassLoader;
import com.mentics.util.KryoUtil;
import com.mentics.util.ReflectionUtil;
import com.mentics.util.StringUtil;


public class Context {
    public static class SpecialHashMap<K, V> extends HashMap<K, V> {
        public Object require(Object key) {
            Object val = super.get(key);
            if (val == null) {
                throw new ShenException("No value for " + key);
            } else {
                return val;
            }
        }
    }


    private static final ClassLoader CC = Context.class.getClassLoader();


    public static final String GLOBAL_PROPERTIES_NAME = "globalProperties";
    public static SpecialHashMap<Symbol, Object> globalProperties;
    static {
        globalProperties = new SpecialHashMap<>();
        installGlobalConstants(globalProperties);
    }

    public static final String FUNCTIONS_NAME = "functions";
    public static Map<Symbol, Lambda> functions = new HashMap<>();


    public static void installGlobalConstants(Map<Symbol, Object> props) {
        props.put(ShenjRuntime.symbol("*stoutput*"), System.out);
        props.put(ShenjRuntime.symbol("*stinput*"), System.in);
        props.put(ShenjRuntime.symbol("*language*"), "Java");
        props.put(ShenjRuntime.symbol("*implementation*"), "Shen on Java");
        props.put(ShenjRuntime.symbol("*release*"), System.getProperty("java.version"));
        props.put(ShenjRuntime.symbol("*port*"), "0.8.0");
        props.put(ShenjRuntime.symbol("*porters*"), "Joel Shellman");
        // if (globalProperties.get(ShenjRuntime.SRC_DIR_SYM) == null) {
        // globalProperties.put(ShenjRuntime.SRC_DIR_SYM, "java/generated/");
        // }
    }

    public static void clearGlobalConstants(Map<Symbol, Object> props) {
        props.remove(ShenjRuntime.symbol("*stoutput*"));
        props.remove(ShenjRuntime.symbol("*stinput*"));
    }

    public static void register(String className) {
        try {
            Class<?> c = loadClass(className);
            registerLambda(c.getDeclaredFields());
        } catch (Exception e) {
            ShenException.rethrow(e);
        }
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
            // System.out.println("Registering: "+sym+" in "+System.identityHashCode(functions));
            functions.put(sym, (Lambda) lambda.get(null));
            return sym;
        }
        return null;
    }

    @SuppressWarnings("unchecked")
    static void loadImage(Input input) throws Exception {
        Kryo kryo = newKryo();
        kryo.setClassLoader(CC);
        globalProperties = (SpecialHashMap<Symbol, Object>) kryo.readClassAndObject(input);
        SpecialHashMap<Symbol, Object> props = new SpecialHashMap<>();
        props.putAll(globalProperties);
        globalProperties = props;
        functions = (Map<Symbol, Lambda>) kryo.readClassAndObject(input);
        installGlobalConstants(globalProperties);
        globalProperties.put(symbol("shen-*history*"), Nil.NIL);
        // globalProperties.put(symbol("*home-directory*"), Nil.NIL);
        // kryo.setClassLoader(DirectClassLoader.class.getClassLoader());
        // if (CC == DirectClassLoader.class.getClassLoader()) {
        // throw new Error("Context and DCL same classloader");
        // }
    }

    public static void saveImage(Output out) {
        DirectClassLoader dcl = (DirectClassLoader) CC;
        dcl.saveImage(out);
    }

    public static void saveImageContextPart(Output out) {
        Kryo kryo = newKryo();
        kryo.setClassLoader(CC);
        clearGlobalConstants(globalProperties);
        KryoUtil.writeObjects(kryo, out, globalProperties, functions);
        // System.out.println("saved globalProperties and functions to image");
        installGlobalConstants(globalProperties);
        // kryo.setClassLoader(DirectClassLoader.class.getClassLoader());
    }

    public static Object runClass(String className) {
        Object result = null;
        try {
            Class<?> c = CC.loadClass(className);
            result = registerLambda(c.getDeclaredFields());
            Lambda lam = null;
            try {
                lam = (Lambda) getStaticField(c, "run");
            } catch (NoSuchFieldException e) {
                // ignore no field, but anything else pass through
            }
            if (lam != null) {
                result = lam.apply();
            }
            // Method[] methods = c.getDeclaredMethods();
            // for (Method method : methods) {
            // String name = method.getName();
            // if ("run".equals(name)) {
            // result = method.invoke(null);
            // break;
            // }
            // }
        } catch (Exception e) {
            rethrow(e);
        }
        return result;
    }

    public static Object callClass(String className, Object... args) throws Exception {
        Class<?> c = CC.loadClass(className);
        Lambda l = (Lambda) ReflectionUtil.getStaticField(c, "LAMBDA");
        Class<?>[] params = new Class[args.length];
        Arrays.fill(params, Object.class);
        Method m = l.getClass().getMethod("apply", params);
        m.setAccessible(true);
        return m.invoke(l, args);
    }

    public static Lambda symbolDispatch(Symbol symbol) {
        Lambda ret = functions.get(symbol);
        if (ret != null) {
            throw new ShenException("Could not find function for symbol: " + symbol);
        }
        return ret;
    }


    public static Lambda orcc = new Lambda2() {
        @Override
        public Object apply(final Object o1, final Object o2) {
            return (Boolean) o1 || (Boolean) o2;
        }
    };

    public static Lambda andcc = new Lambda2() {
        @Override
        public Object apply(final Object o1, final Object o2) {
            return (Boolean) o1 && (Boolean) o2;
        }
    };


    public static Lambda dispatch(Object obj) throws Exception {
        Lambda ret;
        if (obj instanceof Lambda) {
            ret = (Lambda) obj;
        } else if (obj instanceof Symbol) {
            ret = functions.get(obj);
            if (ret == null) {
                if ("or".equals(obj.toString())) {
                    return orcc;
                }
                if ("and".equals(obj.toString())) {
                    return andcc;
                }

                Object javaCallInfo = CallInfoSymbolToJavaCallInfo.LAMBDA.apply(obj);
                String packageName = (String) ShenjUtil.first(javaCallInfo);
                String className = (String) ShenjUtil.second(javaCallInfo);

                try {
                    Class c = loadClass(packageName + "." + className);
                    // TODO: use field/method from call info
                    Lambda lam = (Lambda) c.getField("LAMBDA").get(null);
                    functions.put((Symbol) obj, lam);
                    // System.out.println("cache miss: "+obj.toString());
                    return lam;
                } catch (Exception e) {
                    // e.printStackTrace();
                    throw new ShenException("Could not find function: " + obj);
                }
            } else {
                // System.out.println("cache hit: "+obj.toString());
            }
        } else {
            throw new ShenException("Attempted to dispatch on invalid object: " + obj);
        }
        return ret;
    }

    public static Lambda javaDispatch(String s) {
        return Context.handleJavaCall(s);
    }

    static Lambda handleJavaCall(final String label) {
        // TODO: Limitation: can't do partial application on java calls?
        if (label.endsWith(".")) {
            final String name = label.substring(0, label.length() - 1);
            return new VarLambda() {
                public Object apply(Object[] args) throws Exception {
                    return newInstance(name, args);
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
                    Class<?> c = receiver.getClass();
                    Method[] methods = c.getMethods();
                    for (Method method : methods) {
                        if (methodName.equals(method.getName())) {
                            Class<?>[] params = method.getParameterTypes();
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

                private Class<?> wrapperize(Class<?> c) {
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

    public static Object open(Object type, Object loc, Object direction) {
        if ("file".equals(type.toString())) {
            String dir = direction.toString();
            String location = (String) loc;
            File f = new File(location);
            if (!f.isAbsolute()) {
                String parent = (String) globalProperties.get(symbol("*home-directory*"));
                if (parent.length() != 0) {
                    f = new File(parent, (String) location);
                }
            }
            try {
                if ("in".equals(dir)) {
                    return new FileInputStream(f);
                } else if ("out".equals(dir)) {
                    return new FileOutputStream(f);
                } else {
                    throw new ShenException("Invalid stream direction passed to first parameter of open: " + dir);
                }
            } catch (Exception e) {
                rethrow(e);
                return null; // unreachable code
            }
        } else {
            throw new ShenException("Invalid stream type passed to first parameter of open: " + type);
        }
    }

    public static void loadPrimitives() {
        try {
            for (final Field f : Primitives.class.getFields()) {
                if (Lambda.class.isAssignableFrom(f.getType())) {
                    final Label annotation = f.getAnnotation(Label.class);
                    String label = annotation != null ? label = annotation.value() : f.getName();
                    functions.put(symbol(label), (Lambda) f.get(null));
                    // System.out.println("put: " + ASMUtil.fromIdentifier(f.getName()) + ", " + (Lambda) f.get(null));
                }
            }
        } catch (final IllegalAccessException e) {
            throw new Error(e);
        }
    }

    @SuppressWarnings("unchecked")
    static Map<Symbol, Object> loadProps(File file) {
        Kryo kryo = newKryo();
        kryo.setClassLoader(CC);
        try (Input in = new Input(new FileInputStream(file))) {
            globalProperties = (SpecialHashMap<Symbol, Object>) readObjects(kryo, in, HashMap.class).get(0);
        } catch (Exception e) {
            rethrow(e);
        }
        // kryo.setClassLoader(DirectClassLoader.class.getClassLoader());
        return globalProperties;
    }

    public static Object newInstance(final String name, Object[] args) {
        try {
            Class<?> c = CC.loadClass(name);
            Constructor<?>[] consts = c.getConstructors();
            for (Constructor<?> con : consts) {
                Class<?>[] params = con.getParameterTypes();
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
        } catch (Exception e) {
            rethrow(e);
        }
        throw new ShenException("Could not find constructor for: " + name + "(" + Arrays.toString(args) + ")");
    }

    public static Class<?> loadClass(String className) throws ClassNotFoundException {
        return CC.loadClass(className);
    }

    public static Object apply(String name, Object... args) {
        return ((DirectClassLoader) CC).apply(name, args);
    }

    public static Object doEval(Object className, Object classContent) {
        String srcDir = string(globalProperties.get(GEN_SOURCE_DIRECTORY_SYM));
        String cn = (String) className;
        String content = (String) classContent;

        Object only = globalProperties.get(GENERATE_JAVA_ONLY_SYM);
        if (!cn.contains("ToEval") && only != null && (only instanceof Boolean) && (boolean) only) {
            // TODO: remove duplication between this and in CLProvider.compileTask
            if (srcDir != null) {
                StringUtil.writeToFile(content, new File(srcDir, cn.replace('.', '/') + ".java"));
            }
            return "|not evaluated|";
        } else {
            return ((DirectClassLoader) CC).doEval(srcDir, cn, content);
        }
    }

    // static void registerAll(Map<String, byte[]> toReg) {
    // for (byte[] bytes : toReg.values()) {
    // Class<?> cls = CC.loadClass();
    // registerLambda(cls.getFields());
    // }
    // }

    public static boolean clearImage() {
        functions.clear();
        ((DirectClassLoader) CC).clearImage();
        loadPrimitives();
        return true;
    }

    public static boolean removeShenFunctions() {
        boolean found = false;
        for (Iterator<Symbol> iterator = functions.keySet().iterator(); iterator.hasNext();) {
            if (iterator.next().toString().startsWith("shen")) {
                iterator.remove();
                found = true;
            }
        }
        found |= ((DirectClassLoader) CC).removeShenFunctions();
        return found;
        // boolean v1 = Context.functions.remove(symbol) != null;
        // boolean v2 = ((DirectClassLoader) CC).deleteClass(symbol);
        // return v1 || v2;
    }
}
