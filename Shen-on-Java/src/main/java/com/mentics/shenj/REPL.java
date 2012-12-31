package com.mentics.shenj;

import static com.mentics.util.ReflectionUtil.*;

import java.io.File;
import java.io.FileInputStream;

import com.esotericsoftware.kryo.io.Input;
import com.mentics.shenj.cl.DirectClassLoader;


public class REPL {
    public static void main(String[] args) throws Exception {
        DirectClassLoader topDCL;
        if (args.length > 0) {
            File f = new File(args[0]);
            if (f.exists()) {
                // ShenjRuntime.loadImage(new File(args[0]));
                try (Input in = new Input(new FileInputStream(args[0]))) {
                    topDCL = DirectClassLoader.loadFromImage(threadClassLoader(), in);
                }
            } else {
                // ShenjRuntime.loadDefaultImage();
                topDCL = DirectClassLoader.loadDefaultImage(threadClassLoader());
            }
        } else {
            // ShenjRuntime.loadDefaultImage();
            topDCL = DirectClassLoader.loadDefaultImage(threadClassLoader());
        }
        // ShenjRuntime.topLevel.apply("shenj.root.ShenShen");
        DirectClassLoader dcl = topDCL;
        while (true) {
            try {
                dcl.apply("shenj.root.ShenShen");
            } catch (SwitchError se) {
                System.out.println("switch " + (se.useTop ? "to top" : "to other"));
                dcl = se.useTop ? topDCL : se.dcl;
            } catch (ExitError e) {
                System.exit(0);
            }
        }
    }
}
