package com.mentics.shenj;

import static com.mentics.util.ReflectionUtil.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import com.mentics.shenj.cl.DirectClassLoader;
import com.mentics.util.StringUtil;


public class UpdateImage {
    public static void main(String[] args) throws Exception {
        File imageFile = new File(args[0]);
        String className = args[1];
        File file = new File(args[2]);

        DirectClassLoader topDCL = null;
        if (imageFile.exists()) {
            try (Input in = new Input(new FileInputStream(imageFile))) {
                topDCL = DirectClassLoader.loadFromImage(threadClassLoader(), in);
            }
        } else {
            topDCL = DirectClassLoader.loadDefaultImage(threadClassLoader());
        }

        String classContent = StringUtil.readFully(file);
        Object result = topDCL.doEval(null, className, classContent);
        try (Output out = new Output(new FileOutputStream(imageFile))) {
            topDCL.saveImage(out);
            // System.out.println("saved image: " + imageFile);
        }

        System.out.print(StringUtil.toString(result));
    }
}
