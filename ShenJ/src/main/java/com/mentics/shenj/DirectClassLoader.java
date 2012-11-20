package com.mentics.shenj;

import static com.mentics.shenj.ShenException.*;
import static com.mentics.util.KryoUtil.*;
import static com.mentics.util.ReflectionUtil.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
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
import com.mentics.shenj.inner.Context;
import com.mentics.util.ReflectionUtil;


public class DirectClassLoader extends ClassLoader implements JavaFileObjectSource {
    // private static Kryo kryo = KryoUtil.newKryo();

    static int count = 0;


    public static DirectClassLoader loadDefaultImage() {
        try (Input in = new Input(ReflectionUtil.openResource("com/mentics/shenj/image/shenj-base.image"))) {
            return loadFromImage(in);
        } catch (Exception e) {
            rethrow(e);
            return null; // unreachable code
        }
    }

    @SuppressWarnings("unchecked")
    public static DirectClassLoader loadFromImage(Input in) {
        Kryo kryo = newKryo();
        DirectClassLoader dcl = new DirectClassLoader(ReflectionUtil.threadClassLoader(),
                (Map<String, byte[]>) kryo.readClassAndObject(in));
        // System.out.println(dcl.classes);
        dcl.callContext("loadImage", new Class[] { Input.class }, new Object[] { in });
        return dcl;
    }

    public static DirectClassLoader createEmptyImage() {
        return new DirectClassLoader(ReflectionUtil.threadClassLoader(), new HashMap<String, byte[]>());
    }

    public static DirectClassLoader fromPropFile(File file) {
        DirectClassLoader dcl = new DirectClassLoader(threadClassLoader(), new HashMap<String, byte[]>());
        dcl.callContext("loadProps", new Class[] { File.class }, new Object[] { file });
        dcl.callContext("loadPrimitives", null, null);
        return dcl;
    }


    // Instance Fields //

    public Map<String, byte[]> classes;

    private Map<String, Class<?>> loaded;
    private List<JavaFileObject> files;

    private int id = count++;


    // Constructors //

    DirectClassLoader(ClassLoader parent, Map<String, byte[]> classes) {
        super(parent);
        // System.out.println("created dcl " + id + ": " + toString());
        this.loaded = new HashMap<>();
        this.classes = classes;

        files = new ArrayList<>(classes.size());
        for (Entry<String, byte[]> entry : classes.entrySet()) {
            files.add(new JavaFileObjectImpl(entry.getKey(), JavaFileObject.Kind.CLASS, entry.getValue()));
        }
    }

    // Public Methods //

    @Override
    public Collection<JavaFileObject> files(String packageName) {
        // TODO: only for packageName
        return files;
    }

    public DirectClassLoader newWith(Map<String, byte[]> newClasses) {
        boolean found = MapUtil.containsAny(classes, newClasses.keySet());
        // putAll call must be after query and before copy
        classes.putAll(newClasses);
        if (found) {
            // A class has been redefined, so
            System.out.println("Redefining class from: " + newClasses + " in DCL " + id);
            return copy(true);
        } else {
            return this;
        }
    }

    public DirectClassLoader copy(boolean replaceThis) {
        DirectClassLoader ret = null;
        try {
            ret = new DirectClassLoader(ReflectionUtil.threadClassLoader(), classes);
            Class<?> from = loadClass(Context.class.getName());
            Class<?> to = ret.loadClass(Context.class.getName());

            byte[] bytes = stateToBytes(from);

            try (Input in = new Input(new ByteArrayInputStream(bytes))) {
                Kryo k = newKryo();
//                System.out.println("trying to read with DCL id: " + id + ":" + this.toString() + ", cl: "
//                        + k.getClassLoader());
                k.setClassLoader(ret);
                @SuppressWarnings("unchecked")
                HashMap<Symbol, Object> props = k.readObject(in, HashMap.class);
                @SuppressWarnings("unchecked")
                HashMap<Symbol, Lambda> functions = k.readObject(in, HashMap.class);
                //k.setClassLoader(DirectClassLoader.class.getClassLoader());
                Context.installGlobalConstants(props);
                setStaticField(to, "globalProperties", props);
                setStaticField(to, "functions", functions);
            }

            if (replaceThis) {
                this.classes = null;
                this.files = null;
                this.loaded = null;
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
        //k.setClassLoader(DirectClassLoader.class.getClassLoader());
        Context.installGlobalConstants(props);
        return baos.toByteArray();
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
            Class<?> c = loadClass(Context.class.getName());
            return c.getMethod("runClass", new Class[] { String.class }).invoke(null, className);
        } catch (Exception e) {
            rethrow(e);
            return null; // unreachable code
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

    public DirectClassLoader registerAll(Map<String, byte[]> toReg) {
        DirectClassLoader dcl = newWith(toReg);
        dcl.callContext("loadPrimitives", null, null);
        // callContext("registerAll", new Class[] { Map.class }, new Object[] { toReg });
        for (String fqn : toReg.keySet()) {
            dcl.runClass(fqn);
        }
        return dcl;
    }


    // Local Methods //

    @Override
    protected Class<?> loadClass(String name, boolean resolve) throws ClassNotFoundException {
        if (name.indexOf('$') != -1 && name.endsWith("ConstructorAccess")) {
            throw new ClassNotFoundException("ConstructorAccess thing is not supported.");
        }
        if (loaded == null) {
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
                found = defineClass(name, cls, 0, cls.length);
                loaded.put(name, found);
            } else {
                // System.out.println("Parent is loading it");
                return getParent().loadClass(name);
            }
        }
        return found;
    }

    private Object callContext(String methodName, Class<?>[] params, Object[] args) {
        try {
            Class<?> cls = loadClass(Context.class.getName());
            return invokeStatic(cls, methodName, params, args);
        } catch (ClassNotFoundException e) {
            rethrow(e);
            return null; // unreachable code
        }
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

}