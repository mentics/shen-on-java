package com.mentics.shenj;

import java.io.File;
import java.io.FileOutputStream;

import com.esotericsoftware.kryo.io.Output;
import com.mentics.util.StringUtil;


public class UpdateImage {
    public static void main(String[] args) throws Exception {
        File imageFile = new File(args[0]);
        String className = args[1];
        File file = new File(args[2]);

        if (imageFile.exists()) {
            ShenjRuntime.loadImage(imageFile);
        } else {
            ShenjRuntime.newEmpty();
        }

        String classContent = StringUtil.readFully(file);
        Object result = ShenjRuntime.doEval(className, classContent);
        try (Output out = new Output(new FileOutputStream(imageFile))) {
            ShenjRuntime.evalContext.saveImage(out);
            // System.out.println("saved image: " + imageFile);
        }

        System.out.print(result);
    }
}
