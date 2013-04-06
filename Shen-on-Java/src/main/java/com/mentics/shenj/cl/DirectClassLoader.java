package com.mentics.shenj.cl;

import static com.mentics.shenj.ShenException.*;
import static com.mentics.util.KryoUtil.*;
import static com.mentics.util.ReflectionUtil.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import com.mentics.ecj.EclipseCompiler;
import com.mentics.shenj.CharSequenceCompilerException;
import com.mentics.shenj.Lambda;
import com.mentics.shenj.ShenException;
import com.mentics.shenj.Symbol;
import com.mentics.shenj.inner.Context;
import com.mentics.util.ReflectionUtil;
import com.mentics.util.StringUtil;


public class DirectClassLoader extends ClassLoader {// implements JavaFileObjectSource {
    // private static Kryo kryo = KryoUtil.newKryo();

    static int count = 0;


    public static DirectClassLoader loadDefaultImage(ClassLoader parent) {
        try (Input in = new Input(openResource("com/mentics/shenj/image/default.image"))) {
            return loadFromImage(parent, in);
        } catch (Exception e) {
            rethrow(e);
            return null; // unreachable code
        }
    }

    @SuppressWarnings("unchecked")
    public static DirectClassLoader loadFromImage(ClassLoader parent, Input in) {
        Kryo kryo = newKryo();
        DirectClassLoader dcl = new DirectClassLoader(threadClassLoader(),
                (Map<String, byte[]>) kryo.readClassAndObject(in));
        // System.out.println(dcl.classes);
        dcl.callContext("loadImage", new Class[] { Input.class }, new Object[] { in });
        return dcl;
    }

    public static DirectClassLoader createEmptyImage(ClassLoader parent) {
        DirectClassLoader dcl = new DirectClassLoader(parent, new HashMap<String, byte[]>());
        dcl.callContext("loadPrimitives", null, null);
        return dcl;
    }

    static DirectClassLoader fromPropFile(File file) {
        DirectClassLoader dcl = new DirectClassLoader(threadClassLoader(), new HashMap<String, byte[]>());
        dcl.callContext("loadProps", new Class[] { File.class }, new Object[] { file });
        dcl.callContext("loadPrimitives", null, null);
        return dcl;
    }


    // Instance Fields //

    private Map<String, byte[]> classes;
    // TODO: is this unnecessary since we call findLoadedClass anyway?
    private Map<String, Class<?>> loaded;
    // private Map<String, List<JavaFileObject>> files;
    private boolean running = false;
    private boolean obselete = false;

    int id = count++;


    // Constructors //

    private DirectClassLoader(ClassLoader parent, Map<String, byte[]> classes) {
        super(parent);
        // System.out.println("created dcl " + id + ": " + toString());
        this.loaded = new HashMap<>();
        this.classes = classes;

        // files = new HashMap<>();
        // addToFiles(classes);
    }


    // Public Methods //

    public DirectClassLoader newWith(String className, Map<String, byte[]> newClasses) {
        // System.out.println("Adding classes to dcl: " + newClasses);

        // for (Entry<String, byte[]> entry : newClasses.entrySet()) {
        // SimpleClassLoader cl = new SimpleClassLoader(getParent(), newClasses);
        // Class<?> c;
        // try {
        // c = cl.loadClass(entry.getKey());
        // if (!isStub(c)) {
        // this.classes.put(entry.getKey(), entry.getValue());
        // } else {
        // System.out.println("ignoring stub: " + entry.getKey());
        // }
        // } catch (ClassNotFoundException e) {
        // // TODO Auto-generated catch block
        // e.printStackTrace();
        // }
        // if (!NameEnv.stubsCreated.contains(entry.getKey())) {
        // this.classes.put(entry.getKey(), entry.getValue());
        // } else {
        // // System.out.println("ignoring stub: " + entry.getKey());
        // }
        // }
        // NameEnv.stubsCreated.clear();
        classes.putAll(newClasses);

        // boolean found = MapUtil.containsAny(loaded, newClasses.keySet());
        Class<?> alreadyLoadedClass = findLoadedClass(className);
        if (alreadyLoadedClass != null) {
            // A class has been redefined, so
            // System.out.println("Redefining class from: " + newClasses + " in DCL " + id);
            try {
                // String name = s.substring(0, s.lastIndexOf('$'));
                SimpleClassLoader cl = new SimpleClassLoader(this, newClasses);
                Class<?> c = cl.loadClass(className);
                try {
                    Lambda newLambda = (Lambda) getStaticField(c, "LAMBDA");
                    Field field = alreadyLoadedClass.getDeclaredField("LAMBDA");
                    field.setAccessible(true);
                    field.set(null, newLambda);
                    register(className);
                } catch (Exception e) {
                    // TODO: combine the run/LAMBDA thing?
                    try {
                        Lambda newLambda = (Lambda) getStaticField(c, "run");
                        Field field = alreadyLoadedClass.getDeclaredField("run");
                        field.setAccessible(true);
                        field.set(null, newLambda);
                    } catch (Exception e2) {
                        e.printStackTrace();
                    }
                }
            } catch (Exception e) {
                rethrow(e);
                return null; // unreachable code
            }
            // return copy(newClasses, true);
        }
        // addToFiles(newClasses);
        return this;
    }

    // private boolean isStub(Class<?> c) {
    // try {
    // c.getDeclaredField("STUB");
    // return true;
    // } catch (Exception e) {
    // return false;
    // }
    // }

    public void saveImage(Output out) {
        try {
            writeObjects(newKryo(), out, classes);
            // System.out.println("wrote classes to image");
            Class<?> cls = loadClass(Context.class.getName());
            invokeStatic(cls, "saveImageContextPart", new Class[] { Output.class }, new Object[] { out });
        } catch (Exception e) {
            rethrow(e);
        }
    }


    private Class<?> context;
    private Method contextRun;


    public Object runClass(String className) {
        try {
            running = true;
            if (contextRun == null) {
                if (context == null) {
                    context = loadClass(Context.class.getName());
                }
                contextRun = context.getMethod("runClass", new Class[] { String.class });
            }
            Object result = contextRun.invoke(null, className);
            if (obselete) {
                this.classes = null;
                this.loaded = null;
            }
            return result;
        } catch (Exception e) {
            rethrow(e);
            return null; // unreachable code
        } finally {
            running = false;
        }
    }


    @SuppressWarnings("unchecked")
    public Map<Symbol, Object> getGlobalProps() {
        Map<Symbol, Object> ret = null;
        try {
            ret = (Map<Symbol, Object>) getStaticField(loadClass(Context.class.getName()),
                    Context.GLOBAL_PROPERTIES_NAME);
        } catch (Exception e) {
            rethrow(e);
        }
        return ret;
    }

    @SuppressWarnings("unchecked")
    public Map<Symbol, Lambda> getFunctions() {
        Map<Symbol, Lambda> ret = null;
        try {
            ret = (Map<Symbol, Lambda>) getStaticField(loadClass(Context.class.getName()), Context.FUNCTIONS_NAME);
        } catch (Exception e) {
            rethrow(e);
        }
        return ret;
    }


    private Method register;


    public void register(String fqn) {
        try {
            if (register == null) {
                register = context.getMethod("register", String.class);
            }
            register.invoke(null, fqn);
        } catch (Exception e) {
            ShenException.rethrow(e);
        }
    }

    public Object apply(String className, Object... args) {
        try {
            Class<?> c = loadClass(className);
            Lambda l = (Lambda) getStaticField(c, "LAMBDA");
            switch (args.length) {
            case 0:
                return l.apply();
            case 1:
                return l.apply(args[0]);
            case 2:
                return l.apply(args[0], args[1]);
            case 3:
                return l.apply(args[0], args[1], args[2]);
            case 4:
                return l.apply(args[0], args[1], args[2], args[3]);
            default:
                throw new ShenException("apply called with more than implemented cases: " + Arrays.toString(args));
            }
        } catch (Exception e) {
            rethrow(e);
            return null; // unreachable code
        }
    }


    // Local Methods //

    DirectClassLoader copy(Map<String, byte[]> classesToAdd, boolean replaceThis) {
        DirectClassLoader ret = null;
        try {
            HashMap<String, byte[]> newClasses = new HashMap<>(classes);
            newClasses.putAll(classesToAdd);
            ret = new DirectClassLoader(ReflectionUtil.threadClassLoader(), newClasses);
            Class<?> from = loadClass(Context.class.getName());
            Class<?> to = ret.loadClass(Context.class.getName());

            byte[] bytes = stateToBytes(from);

            try (Input in = new Input(new ByteArrayInputStream(bytes))) {
                Kryo k = newKryo();
                // System.out.println("trying to read with DCL id: " + id + ":" + this.toString() + ", cl: "
                // + k.getClassLoader());
                k.setClassLoader(ret);
                @SuppressWarnings("unchecked")
                HashMap<Symbol, Object> props = k.readObject(in, HashMap.class);
                @SuppressWarnings("unchecked")
                HashMap<Symbol, Lambda> functions = k.readObject(in, HashMap.class);
                // k.setClassLoader(DirectClassLoader.class.getClassLoader());
                Context.installGlobalConstants(props);
                setStaticField(to, "globalProperties", props);
                setStaticField(to, "functions", functions);
            }

            if (replaceThis) {
                if (running) {
                    obselete = true;
                } else {
                    this.classes = null;
                    this.loaded = null;
                }
            }
        } catch (Exception e) {
            rethrow(e);
        }
        return ret;
    }

    private byte[] stateToBytes(Class<?> from) throws Exception {
        @SuppressWarnings("unchecked")
        Map<Symbol, Object> props = (Map<Symbol, Object>) getStaticField(from, "globalProperties");
        @SuppressWarnings("unchecked")
        Map<Symbol, Lambda> functions = (Map<Symbol, Lambda>) getStaticField(from, "functions");
        Context.clearGlobalConstants(props);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        Kryo k = newKryo();
        try (Output out = new Output(baos)) {
            k.setClassLoader(this);
            k.writeObject(out, props);
            k.writeObject(out, functions);
            out.close();
        }
        // k.setClassLoader(DirectClassLoader.class.getClassLoader());
        Context.installGlobalConstants(props);
        return baos.toByteArray();
    }

    @Override
    protected Class<?> loadClass(String name, boolean resolve) throws ClassNotFoundException {
        Class<?> findLoadedClass = findLoadedClass(name);
        if (findLoadedClass != null) {
            // System.out.println("Loading already loaded Class: " + name);
            return findLoadedClass;
        }
        if ("j".equals(name)) {
            System.out.println("loading Context");
        }
        if (name.indexOf('$') != -1 && name.endsWith("ConstructorAccess")) {
            throw new ClassNotFoundException("ConstructorAccess thing is not supported.");
        }
        if (classes == null) {
            System.out.println("DCL id " + id + " used after closed");
        }
        Class<?> found = this.loaded.get(name);
        if (found != null) {
            return found;
        }

        // TODO: change this to use a flag
        // if (name.startsWith("shenj.root")) {
        // try {
        // return getParent().loadClass(name);
        // }
        // }

        // Anything in the same package as Context is intended to be handled by this context class loader.
        if (name.startsWith(Context.class.getPackage().getName())) {
            found = copyFromParent(name);
        } else {
            // System.out.println("DCL " + id + " loading: " + name + " num clases: " + classes.size());
            byte[] cls = this.classes.get(name);

            if (cls != null) {
                // System.out.println("Loading directly by " + id + ": " + name + " len: " + cls.length);
                try {
                    found = defineClass(name, cls, 0, cls.length);
                } catch (Error re) {
                    throw re;
                }
                loaded.put(name, found);
            } else {
                if (name.startsWith("shen")) {
                    found = copyFromParent(name);
                } else {
                    // System.out.println("Parent is loading: " + name);
                    found = getParent().loadClass(name);
                }
            }
        }
        return found;
    }

    public Class<?> copyFromParent(String name) throws ClassFormatError {
        Class<?> found = null;
        try {
            byte[] bytes = loadBytesForClass(getParent(), name);
            found = defineClass(name, bytes, 0, bytes.length);
            loaded.put(name, found);
            // System.out.println("DCL " + id + " loading override: " + name);
        } catch (Exception e) {
            if (name.startsWith("com.mentics.shenj.inner.Primitives$")) {
                return null;
            } else {
                // e.printStackTrace(System.out);
                rethrow(e);
            }
        }
        return found;
    }

    Object callContext(String methodName, Class<?>[] params, Object[] args) {
        try {
            Class<?> cls = loadClass(Context.class.getName());
            return invokeStatic(cls, methodName, params, args);
        } catch (ClassNotFoundException e) {
            rethrow(e);
            return null; // unreachable code
        }
    }

    public boolean deleteClass(String className) {
        return classes.remove(className) != null;
    }

    public Object doEval(String srcDir, String className, String classContent) {
        String cn = (String) className;
        try {
            compile(srcDir, cn, (String) classContent);
            return runClass(cn);
        } catch (Exception e) {
            rethrow(e);
            return null; // unreachable code
        }
    }

    public void compile(String srcDir, String className, String classContent) throws CharSequenceCompilerException {
        if (!className.contains(".")) {
            throw new ShenException("No package for class: " + className);
        }

        if (srcDir != null) {
            StringUtil.writeToFile(classContent, new File(srcDir, className.replace('.', '/') + ".java"));
        }

        // return CLProvider.compileTask(this, srcDir, (String) className, (String) classContent);
        EclipseCompiler.env.dcl = this;
        Map<String, byte[]> classes = EclipseCompiler.compile(classContent, StringUtil.lastToken(".", className)
                + ".java");
        this.newWith(className, classes);

//        for (Entry<String, byte[]> entry : classes.entrySet()) {
//            if (srcDir != null) {
//                StringUtil.writeToFile(entry.getValue(), new File(srcDir, entry.getKey().replace('.', '/') + ".class"));
//            }
//        }

        // this.newWith(classes);
        // this.classes.putAll(classes);
    }

    public boolean removeShenFunctions() {
        boolean found = false;

        for (Iterator<String> iterator = classes.keySet().iterator(); iterator.hasNext();) {
            if (iterator.next().startsWith("shen")) {
                iterator.remove();
                found = true;
            }
        }
        for (Iterator<String> iterator = loaded.keySet().iterator(); iterator.hasNext();) {
            if (iterator.next().startsWith("shen")) {
                iterator.remove();
                found = true;
            }
        }

        return found;
    }

    public byte[] localClass(String fqn) {
        return this.classes.get(fqn);
    }

    public void clearImage() {
        this.classes.clear();
        this.loaded.clear();
    }
}