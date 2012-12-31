package com.mentics.shenj.maint;

import static com.mentics.util.ReflectionUtil.*;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import com.mentics.shenj.cl.DirectClassLoader;
import com.mentics.shenj.inner.Context;


public class InstallPrimitives {
    public static void main(String[] args) throws Exception {
        String path = "shen-test.image";
        try (Input in = new Input(new FileInputStream(path))) {
            DirectClassLoader dcl = DirectClassLoader.loadFromImage(threadClassLoader(), in);
            Context.loadPrimitives();
            try (Output out = new Output(new FileOutputStream(path))) {
                dcl.saveImage(out);
            }
        }
    }
}
