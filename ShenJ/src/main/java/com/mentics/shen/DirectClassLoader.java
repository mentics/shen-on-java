package com.mentics.shen;

import java.io.InputStream;
import java.net.URLClassLoader;
import java.util.Map;


public class DirectClassLoader extends URLClassLoader {
    private final Map<String, byte[]> direct;


    public DirectClassLoader(ClassLoader parent, Map<String, byte[]> classes) {
        super(((URLClassLoader) parent).getURLs(), parent);
        direct = classes;
    }

    @Override
    protected Class loadClass(String name, boolean resolve) throws ClassNotFoundException {
        Class<?> found;

        byte[] cls = this.direct.get(name);
        if (name != null && name.startsWith("ShenVectorToListh")) {
            System.out.println("found it");
        }

        if (cls != null) {
            // System.out.println("dcl match: "+direct.size());
            // System.err.println("================");
            // ClassReader cr = new ClassReader(cls);
            // cr.accept(new TraceClassVisitor(new PrintWriter(System.err)), 0);
            // System.err.println("================");

            // try {
            // FileOutputStream fos = new FileOutputStream("tmp/" + name + ".class");
            // fos.write(cls);
            // fos.close();
            // } catch (Exception e) {
            // // TODO Auto-generated catch block
            // e.printStackTrace();
            // }

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

    // public List<Object> loadImage(InputStream in) throws Exception {
    // Class<?> dcl = this.loadClass("com.mentics.shen.DirectClassLoader.class");
    // dcl.
    // return (List<Object>) .getMethod("doit", new Class[] { InputStream.class }).invoke(null,
    // in);
    // }
    //
    // public List<Object> doit(InputStream in) {
    // Kryo kryo = new Kryo();
    // Input input = new Input(in);
    // List<Object> read = new ArrayList<>();
    // read.add(kryo.readClassAndObject(input)); // classes
    // read.add(kryo.readClassAndObject(input)); // global props
    // read.add(kryo.readClassAndObject(input)); // functions
    // return read;
    // }
}