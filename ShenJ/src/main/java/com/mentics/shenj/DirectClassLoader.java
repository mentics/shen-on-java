package com.mentics.shenj;

import static com.mentics.shenj.ShenException.*;
import static com.mentics.util.ReflectionUtil.*;

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
import com.mentics.util.KryoUtil;
import com.mentics.util.ReflectionUtil;


public class DirectClassLoader extends ClassLoader implements JavaFileObjectSource {
    private static Kryo kryo = KryoUtil.newKryo();

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
        DirectClassLoader dcl = new DirectClassLoader(ReflectionUtil.threadClassLoader(),
                (Map<String, byte[]>) kryo.readClassAndObject(in));
        // System.out.println(dcl.classes);
        dcl.callContext("loadImage", new Class[] { Input.class }, new Object[] { in });
        return dcl;
    }

    public static DirectClassLoader createEmptyImage() {
        DirectClassLoader dcl = new DirectClassLoader(ReflectionUtil.threadClassLoader(), new HashMap<String, byte[]>());
        dcl.callContext("loadPrimitives", null, null);
        return dcl;
    }

    public static DirectClassLoader fromPropFile(File file) {
        DirectClassLoader dcl = new DirectClassLoader(threadClassLoader(), new HashMap<String, byte[]>());
        dcl.callContext("loadProps", new Class[] { File.class }, new Object[] { file });
        dcl.callContext("loadPrimitives", null, null);
        return dcl;
    }


    // Instance Fields //

    public final Map<String, byte[]> classes;

    private final Map<String, Class<?>> loaded;
    private final List<JavaFileObject> files;

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
        classes.putAll(newClasses);
        DirectClassLoader ret = null;
        try {
            ret = new DirectClassLoader(ReflectionUtil.threadClassLoader(), classes);
            Class<?> from = loadClass(Context.class.getName());
            Class<?> to = ret.loadClass(Context.class.getName());
            ReflectionUtil.copyStaticFieldValue(from, to, "globalProperties");
            ReflectionUtil.copyStaticFieldValue(from, to, "functions");
        } catch (Exception e) {
            rethrow(e);
        }
        return ret;
    }

    public static DirectClassLoader copyCompileContext() {
        DirectClassLoader ret = null;
        try {
            ret = new DirectClassLoader(ReflectionUtil.threadClassLoader(), new HashMap<>(
                    ShenjRuntime.compileContext.classes));
            Class<?> from = ShenjRuntime.compileContext.loadClass(Context.class.getName());
            Class<?> to = ret.loadClass(Context.class.getName());
            ReflectionUtil.cloneStaticFieldValue(from, to, "globalProperties");
            ReflectionUtil.cloneStaticFieldValue(from, to, "functions");
        } catch (Exception e) {
            rethrow(e);
        }
        return ret;
    }

    public void saveImage(Output out) {
        try {
            KryoUtil.writeObjects(kryo, out, classes);
            // System.out.println("wrote classes to image");
            Class<?> cls = loadClass(Context.class.getName());
            invokeStatic(cls, "saveImage", new Class[] { Output.class }, new Object[] { out });
        } catch (Exception e) {
            rethrow(e);
        }
    }

    public Object evalClass(String className) {
        try {
            Class<?> c = loadClass(Context.class.getName());
            return c.getMethod("runClass", new Class[] { String.class }).invoke(null, className);
        } catch (Exception e) {
            rethrow(e);
            return null; // unreachable code
        }
    }

    public Object run(String className) {
        try {
            Class<?> c = loadClass(className);
            Lambda l = (Lambda) getStaticField(c, "LAMBDA");
            return l.apply();
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
        // callContext("registerAll", new Class[] { Map.class }, new Object[] { toReg });
        for (String fqn : toReg.keySet()) {
            dcl.evalClass(fqn);
        }
        return dcl;
    }


    // Local Methods //

    @Override
    protected Class<?> loadClass(String name, boolean resolve) throws ClassNotFoundException {
        if (name.indexOf('$') != -1 && name.endsWith("ConstructorAccess")) {
            throw new ClassNotFoundException("ConstructorAccess thing is not supported.");
        }
        Class<?> found = this.loaded.get(name);
        if (found != null) {
            return found;
        }

        // Anything in the same package as Context is intended to be handled by this context class loader.
        if (name.startsWith(Context.class.getPackage().getName())) {
            try {
                byte[] bytes = ReflectionUtil.loadBytesForClass(getParent(), name);
                found = defineClass(name, bytes, 0, bytes.length);
                loaded.put(name, found);
                System.out.println("DCL " + id + " loading override: " + name);
            } catch (Exception e) {
                e.printStackTrace(System.out);
                rethrow(e);
            }
        } else {
            // System.out.println("DCL " + id + " loading: " + name + " num clases: " + classes.size());
            byte[] cls = this.classes.get(name);

            if (cls != null) {
                System.out.println("Loading directly by "+id+": " + name);
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
}