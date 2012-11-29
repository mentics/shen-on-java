package com.mentics.shenj;

import static com.mentics.util.ReflectionUtil.*;

import java.util.HashMap;
import java.util.Map;


public class TestCL {
    static class DCL extends ClassLoader {
        String name;
        private HashMap<String, byte[]> classes;


        DCL(String name, ClassLoader parent, Map<String, byte[]> classes) {
            super(parent);
            this.name = name;
            this.classes = new HashMap<>(classes);
        }

        @Override
        protected Class<?> loadClass(String className, boolean resolve) {
            if (className.contains("ValueHolder")) {
                System.out.println(name + " loading " + className);
            }
            Class<?> findLoadedClass = findLoadedClass(className);
            if (findLoadedClass != null) {
                if (className.contains("ValueHolder")) {
                    System.out.println(name + " found already loaded " + className);
                }
                return findLoadedClass;
            }
            try {
                byte[] bytes = classes.get(className);
                if (bytes != null) {
                    if (className.contains("ValueHolder")) {
                        System.out.println(name + " defined " + className);
                    }
                    return defineClass(className, bytes, 0, bytes.length);
                } else {
                    if (className.contains("ValueHolder")) {
                        System.out.println(name + " delegated to parent for " + className);
                    }
                    return getParent().loadClass(className);
                }
            } catch (Throwable t) {
                t.printStackTrace();
            }
            return null;
        }

        public void setClasses(HashMap<String, byte[]> classes) {
            this.classes = classes;
        }
    }


    public static void main(String[] args) throws Exception {
        Map<String, byte[]> classes = new HashMap<>();
        String className = ValueHolder.class.getName();
        classes.put(className, loadBytesForClass(ValueHolder.class));
        DCL parent = new DCL("parent", threadClassLoader(), classes);
        DCL child = new DCL("child", parent, new HashMap<String, byte[]>());

        Class<?> childLoad1 = child.loadClass(className);
        setStaticField(childLoad1, "value", "parent");
        System.out.println("childLoad1: " + getStaticField(childLoad1, "value"));

        child.setClasses(new HashMap<String, byte[]>(classes));

        Class<?> childLoad2 = child.loadClass(className);
        setStaticField(childLoad2, "value", "child");
        System.out.println("childLoad2: " + getStaticField(childLoad2, "value"));

        System.out.println("parentEnd: " + getStaticField(parent.loadClass(className), "value"));
    }
}


class ValueHolder {
    public static String value;
}