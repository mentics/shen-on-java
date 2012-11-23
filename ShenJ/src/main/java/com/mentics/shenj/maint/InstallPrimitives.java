package com.mentics.shenj.maint;

import static com.mentics.shenj.ShenjRuntime.*;
import static com.mentics.util.StringUtil.*;

import java.io.File;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;

import com.esotericsoftware.kryo.io.Output;
import com.mentics.shenj.Lang;
import com.mentics.shenj.ShenException;
import com.mentics.shenj.ShenjRuntime;


public class InstallPrimitives {
    public static void main(String[] args) throws Exception {
        String path = "shen-test.image";
        loadImage(new File(path));
        ShenjRuntime.getCurrentContext().loadPrimitives();
        try (Output out = new Output(new FileOutputStream(path))) {
            getCurrentContext().saveImage(out);
        }
    }
}
