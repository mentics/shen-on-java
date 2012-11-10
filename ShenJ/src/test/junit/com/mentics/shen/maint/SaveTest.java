package com.mentics.shen.maint;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import shen.gen.Hash;
import shen.gen.ShenAsimple_patternZ;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import com.mentics.shen.Lambda;
import com.mentics.shen.Lambda1;
import com.mentics.shen.RuntimeContext;


public class SaveTest {
    static Kryo kryo = new Kryo();

    
    

    @Test
    public void testSave() throws Exception {
        RuntimeContext.registerLambda(ShenAsimple_patternZ.class.getDeclaredFields());
        Output out = new Output(new FileOutputStream("test.kryo"));
        kryo.writeObject(out, RuntimeContext.functions);
        out.close();
        Input in = new Input(new FileInputStream("test.kryo"));
        HashMap read1 = kryo.readObject(in, HashMap.class);
        System.out.println(read1);
    }

    @Test
    public void testSave2() throws Exception {
        Map<String, Lambda> m = new HashMap<>();
        for (int i=0; i<1000; i++) {
            m.put("test-key"+i, thing);
        }
        Output out = new Output(new FileOutputStream("test.kryo"));
        kryo.writeObject(out, m);
        out.close();
        Input in = new Input(new FileInputStream("test.kryo"));
        HashMap read1 = kryo.readObject(in, HashMap.class);
        System.out.println(read1);
    }


    static final Lambda thing = new Lambda1() {
        public Object apply(Object o) {
            return o;
        }
    };
}
