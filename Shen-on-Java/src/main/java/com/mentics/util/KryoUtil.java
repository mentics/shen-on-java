package com.mentics.util;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;


public class KryoUtil {
    public static List<Object> readObjects(Kryo kryo, InputStream in, Class<?>... classes) {
        // Input is just a wrapper around in, so no need to close
        Input input = new Input(in);
        List<Object> result = new ArrayList<>();
        for (Class<?> c : classes) {
            try {
                result.add(kryo.readClassAndObject(input));
            } catch (Exception e) {
                e.printStackTrace();
                result.add(e.getMessage());
            }
        }
        return result;
    }

    public static void writeObjects(Kryo kryo, Output output, Object... objects) {
        for (Object o : objects) {
            kryo.writeClassAndObject(output, o);
        }
        // Don't flush in finally because then it would probably throw a different exception and hide the original one.
        output.flush();
    }

    public static Kryo newKryo() {
        Kryo k = new Kryo();
        k.register(int.class, 1030);
        return k;
    }
}
