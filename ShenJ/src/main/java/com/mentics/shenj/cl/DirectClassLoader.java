package com.mentics.shenj.cl;

import static com.mentics.shenj.ShenException.*;
import static com.mentics.util.KryoUtil.*;
import static com.mentics.util.ReflectionUtil.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.tools.JavaFileObject;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import com.mentics.shenj.JavaFileObjectImpl;
import com.mentics.shenj.JavaFileObjectSource;
import com.mentics.shenj.Lambda;
import com.mentics.shenj.Symbol;
import com.mentics.shenj.inner.Context;
import com.mentics.util.ReflectionUtil;


public class DirectClassLoader extends ClassLoader implements JavaFileObjectSource {
    // private static Kryo kryo = KryoUtil.newKryo();

    static int count = 0;


    static DirectClassLoader loadDefaultImage(ClassLoader parent) {
        try (Input in = new Input(ReflectionUtil.openResource("com/mentics/shenj/image/shenj-base.image"))) {
            return loadFromImage(parent, in);
        } catch (Exception e) {
            rethrow(e);
            return null; // unreachable code
        }
    }

    @SuppressWarnings("unchecked")
    static DirectClassLoader loadFromImage(ClassLoader parent, Input in) {
        Kryo kryo = newKryo();
        DirectClassLoader dcl = new DirectClassLoader(ReflectionUtil.threadClassLoader(),
                (Map<String, byte[]>) kryo.readClassAndObject(in));
        // System.out.println(dcl.classes);
        dcl.callContext("loadImage", new Class[] { Input.class }, new Object[] { in });
        return dcl;
    }

    public static DirectClassLoader createEmptyImage(ClassLoader parent) {
        return new DirectClassLoader(parent, new HashMap<String, byte[]>());
    }

    static DirectClassLoader fromPropFile(File file) {
        DirectClassLoader dcl = new DirectClassLoader(threadClassLoader(), new HashMap<String, byte[]>());
        dcl.callContext("loadProps", new Class[] { File.class }, new Object[] { file });
        dcl.callContext("loadPrimitives", null, null);
        return dcl;
    }


    // Instance Fields //

    private Map<String, byte[]> classes;
    private Map<String, Class<?>> loaded;
    private List<JavaFileObject> files;
    private boolean running = false;
    private boolean obselete = false;

    int id = count++;


    // Constructors //

    private DirectClassLoader(ClassLoader parent, Map<String, byte[]> classes) {
        super(parent);
        // System.out.println("created dcl " + id + ": " + toString());
        this.loaded = new HashMap<>();
        this.classes = classes;

        files = new ArrayList<>(classes.size());
        addToFiles(classes);
    }


    // Public Methods //

    @Override
    public Collection<JavaFileObject> files(String packageName) {
        // TODO: only for packageName
        if (getParent() instanceof DirectClassLoader) {
            List<JavaFileObject> result = new ArrayList<>();
            result.addAll(((DirectClassLoader) getParent()).files(packageName));
            result.addAll(files);
            return result;
        }
        return files;
    }

    public DirectClassLoader newWith(String className, Map<String, byte[]> newClasses) {
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
        } else {
            // putAll call must be after query and before copy
            // TODO: Need to do this for other cases?
            addToFiles(newClasses);
        }
        return this;
    }

    public void saveImage(Output out) {
        try {
            writeObjects(newKryo(), out, classes);
            // System.out.println("wrote classes to image");
            Class<?> cls = loadClass(Context.class.getName());
            invokeStatic(cls, "saveImage", new Class[] { Output.class }, new Object[] { out });
        } catch (Exception e) {
            rethrow(e);
        }
    }

    public Object runClass(String className) {
        try {
            running = true;
            Class<?> c = loadClass(Context.class.getName());
            Object result = c.getMethod("runClass", new Class[] { String.class }).invoke(null, className);
            if (obselete) {
                this.classes = null;
                this.loaded = null;
                this.files = null;
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

    public DirectClassLoader register(String fqn, Map<String, byte[]> toReg) {
        DirectClassLoader dcl = newWith(fqn, toReg);
        dcl.runClass(fqn);
        // callContext("registerAll", new Class[] { Map.class }, new Object[] { toReg });
        return dcl;
    }

    public Object apply(String className, Object arg0) {
        try {
            Class<?> c = loadClass(className);
            Lambda l = (Lambda) getStaticField(c, "LAMBDA");
            return l.apply(arg0);
        } catch (Exception e) {
            rethrow(e);
            return null; // unreachable code
        }
    }

    public Object apply(String className, Object arg0, Object arg1) {
        try {
            Class<?> c = loadClass(className);
            Lambda l = (Lambda) getStaticField(c, "LAMBDA");
            return l.apply(arg0, arg1);
        } catch (Exception e) {
            rethrow(e);
            return null; // unreachable code
        }
    }

    public Object apply(String className) {
        try {
            Class<?> c = loadClass(className);
            Lambda l = (Lambda) getStaticField(c, "LAMBDA");
            return l.apply();
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
                    this.files = null;
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
        if ("shen.gen.Cd".equals(name)) {
            System.out.println("Attempting to load cd in: " + this.id + "  :" + this.toString());
        }
        Class<?> findLoadedClass = findLoadedClass(name);
        if (findLoadedClass != null) {
            if ("shen.gen.Cd".equals(name)) {
                System.out.println("cd was already loaded: " + this.id + "  :" + this.toString());
            }
            return findLoadedClass;
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

        // Anything in the same package as Context is intended to be handled by this context class loader.
        if (name.startsWith(Context.class.getPackage().getName())) {
            try {
                byte[] bytes = loadBytesForClass(getParent(), name);
                found = defineClass(name, bytes, 0, bytes.length);
                loaded.put(name, found);
                // System.out.println("DCL " + id + " loading override: " + name);
            } catch (Exception e) {
                e.printStackTrace(System.out);
                rethrow(e);
            }
        } else {
            // System.out.println("DCL " + id + " loading: " + name + " num clases: " + classes.size());
            byte[] cls = this.classes.get(name);

            if (cls != null) {
                // System.out.println("Loading directly by "+id+": " + name);
                try {
                    found = defineClass(name, cls, 0, cls.length);
                } catch (Error re) {
                    throw re;
                }
                loaded.put(name, found);
            } else {
                // System.out.println("Parent is loading it");
                return getParent().loadClass(name);
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

    private void addToFiles(Map<String, byte[]> classes) {
        for (Entry<String, byte[]> entry : classes.entrySet()) {
            files.add(new JavaFileObjectImpl(entry.getKey(), JavaFileObject.Kind.CLASS, entry.getValue()));
        }
    }
}