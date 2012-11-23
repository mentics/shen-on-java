package com.mentics.shenj.cl;

import java.util.HashMap;
import java.util.Map;


public class SimpleClassLoader extends ClassLoader {
    // Instance Fields //

    private Map<String, byte[]> classes;
    private Map<String, Class<?>> loaded;


    // Constructors //

    public SimpleClassLoader(ClassLoader parent, Map<String, byte[]> classes) {
        super(parent);
        this.loaded = new HashMap<>();
        this.classes = classes;
    }


    // Public Methods //

    @Override
    protected Class<?> loadClass(String name, boolean resolve) throws ClassNotFoundException {
        Class<?> found = null;
        // if (name.indexOf('$') != -1 && name.endsWith("ConstructorAccess")) {
        // throw new ClassNotFoundException("ConstructorAccess thing is not supported.");
        // }
        // if (loaded == null) {
        // System.out.println("DCL id " + id + " used after closed");
        // }
        // Class<?> found = this.loaded.get(name);
        // if (found != null) {
        // return found;
        // }

        // System.out.println("DCL " + id + " loading: " + name + " num clases: " + classes.size());
        byte[] cls = this.classes.get(name);

        if (cls != null) {
            // System.out.println("Loading directly by "+id+": " + name);
            found = defineClass(name, cls, 0, cls.length);
            // loaded.put(name, found);
        } else {
            // System.out.println("Parent is loading it");
            return getParent().loadClass(name);
        }
        return found;
    }
}