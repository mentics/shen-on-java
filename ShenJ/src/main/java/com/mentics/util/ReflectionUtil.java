package com.mentics.util;

import static com.mentics.shenj.ShenException.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;


/**
 * TODO: don't want to break access restrictions, but DCL needs to access Context stuff
 */
public class ReflectionUtil {

    public static Object getStaticField(Class<?> cls, String fieldName) throws Exception {
        Field f = cls.getDeclaredField(fieldName);
        f.setAccessible(true);
        return f.get(null);
    }

    public static void setStaticField(Class<?> cls, String fieldName, Object value) throws Exception {
        Field f = cls.getDeclaredField(fieldName);
        f.setAccessible(true);
        f.set(null, value);
    }

    public static void cloneStaticFieldValue(Class<?> from, Class<?> to, String fieldName) throws Exception {
        Object value = getStaticField(from, fieldName);
        Object clonedValue = value.getClass().getMethod("clone").invoke(value);
        System.out.println("cloned: " + clonedValue);
        setStaticField(to, fieldName, clonedValue);
    }

    public static void copyStaticFieldValue(Class<?> from, Class<?> to, String fieldName) throws Exception {
        setStaticField(to, fieldName, getStaticField(from, fieldName));
    }

    public static byte[] loadBytesForClass(Class<?> cls) throws IOException {
        return loadBytesForClass(cls.getClassLoader(), cls.getName());
    }

    public static byte[] loadBytesForClass(ClassLoader loader, String fqn) throws IOException {
        InputStream input = loader.getResourceAsStream(fqn.replace(".", "/") + ".class");
        if (input == null) {
            System.out.println("Could not load bytes for class: " + fqn);
        }
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        StringUtil.copy(input, output);
        return output.toByteArray();
    }

    public static InputStream openResource(String resource) {
        return ReflectionUtil.threadClassLoader().getResourceAsStream(resource);
    }

    public static ClassLoader threadClassLoader() {
        return Thread.currentThread().getContextClassLoader();
    }

    public static Object invokeStatic(Class<?> cls, String methodName, Class[] params, Object[] kl) {
        Object ret = null;
        try {
            Method m = cls.getDeclaredMethod(methodName, params);
            m.setAccessible(true);
            ret = m.invoke(null, kl);
        } catch (Exception e) {
            rethrow(e);
        }
        return ret;
    }
}
