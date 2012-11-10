package com.mentics.shen.maint;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.io.Input;
import com.mentics.shen.RuntimeContext;
import com.mentics.shen.Symbol;


public class SaveGlobalProps {
    public static void main2(String[] args) throws Exception {
        Input in = new Input(new FileInputStream("shenj-base.image"));
        new Kryo().readClassAndObject(in);
        RuntimeContext.globalProperties = (Map<Symbol, Object>) new Kryo().readClassAndObject(in);
        // RuntimeContext.clearGlobalConstants();
        // UpdateImage.readObjects(new FileInputStream("global-props.kryo"), HashMap.class);
        // in.close();
        // UpdateImage.writeObjects(new FileOutputStream("global-props.kryo"), RuntimeContext.globalProperties);
        System.out.println(RuntimeContext.globalProperties);
    }

    public static void main(String[] args) throws Exception {
        // RuntimeContext.globalProperties = new Kryo().readObject(new Input(Thread.currentThread()
        // .getContextClassLoader().getResourceAsStream("shenj/platform/image/shen-test.image")), HashMap.class);
        // RuntimeContext.globalProperties = (Map<Symbol, Object>) new Kryo().readClassAndObject(new Input(
        // new FileInputStream("C:\\dev\\Shen\\Shen-6.1\\Platforms\\CLisp\\shen-test.image")));

        List<Object> l = RuntimeContext.readObjects(new FileInputStream(
                "C:\\dev\\Shen\\Shen-6.1\\Platforms\\CLisp\\shen-test.image"), HashMap.class, HashMap.class);


        System.out.println(l.get(0));
        System.out.println(l.get(1));
        RuntimeContext.globalProperties = (Map<Symbol, Object>) l.get(1);
        RuntimeContext.clearGlobalConstants();
        RuntimeContext.writeObjects(new FileOutputStream("global-props.kryo"), RuntimeContext.globalProperties);
    }

    // public static void main(String[] args) throws Exception {
    // RuntimeContext.loadImage(Thread.currentThread().getContextClassLoader()
    // .getResourceAsStream("shenj/platform/image/shenj-base.image"));
    // RuntimeContext.clearGlobalConstants();
    // UpdateImage.writeObjects(new FileOutputStream("global-props.kryo"), RuntimeContext.globalProperties);
    // }
}
