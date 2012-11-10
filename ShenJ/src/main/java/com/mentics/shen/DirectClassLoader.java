package com.mentics.shen;

import java.io.File;
import java.io.InputStream;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.tools.JavaFileObject;


public class DirectClassLoader extends URLClassLoader implements JavaFileObjectSource {
    private final Map<String, byte[]> direct;
    private final List<JavaFileObject> files;


    public DirectClassLoader(ClassLoader parent, Map<String, byte[]> classes) throws Exception {
        super(ArrayUtil.add(((URLClassLoader) parent).getURLs(), new File("target/classes").toURI().toURL()), parent);
        direct = classes;
        files = new ArrayList<>(direct.size());
        for (Entry<String, byte[]> entry : direct.entrySet()) {
            files.add(new JavaFileObjectImpl(entry.getKey(), JavaFileObject.Kind.CLASS, entry.getValue()));
        }
    }

    @Override
    protected Class loadClass(String name, boolean resolve) throws ClassNotFoundException {
        Class<?> found;

//        System.out.println("DCL Loading: " + name);

        byte[] cls = this.direct.get(name);
        if (name != null && name.startsWith("ShenVectorToListh")) {
            System.out.println("found it");
        }

        if (cls != null) {
            found = defineClass(name, cls, 0, cls.length);
        } else {
            // System.out.println("dcl miss: "+direct.size());
            if (true) {
                if (name.startsWith("shen.gen")) {
                    Class<?> c = findClass(name);
                    if (c != null) {
                        resolveClass(c);
                        return c;
                    }
                    return getParent().loadClass(name);
                }
                return getParent().loadClass(name);
            }
            try {
                // found = super.loadClass(name, false);
                // URL findResource = findResource(name.replace('.', '/'));
                // InputStream in = findResource.openStream();
                super.loadClass(name, false);
                InputStream in = getResourceAsStream(name);
                byte[] buff = new byte[10000000];
                int num = in.read(buff);
                // byte[] shorten = new byte[num];
                // System.arraycopy(buff, 0, shorten, 0, num);
                found = defineClass(name, buff, 0, num);

                System.out.println(name + " cl: " + found.getClassLoader());
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        return found;
    }

    @Override
    public Collection<JavaFileObject> files(String packageName) {
        // TODO: only for packageName
        return files;
    }
}