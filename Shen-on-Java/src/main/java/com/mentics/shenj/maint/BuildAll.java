package com.mentics.shenj.maint;

import static com.mentics.shenj.Cons.*;
import static com.mentics.shenj.ShenjRuntime.*;
import static com.mentics.shenj.cl.DirectClassLoader.*;

import java.util.ArrayList;
import java.util.List;

import com.mentics.shenj.Cons;
import com.mentics.shenj.Lambda1;
import com.mentics.shenj.Symbol;
import com.mentics.shenj.cl.DirectClassLoader;
import com.mentics.util.ReflectionUtil;


public class BuildAll {
    public static void main(String[] args) throws Exception {
        final Symbol defun = symbol("defun");
        final DirectClassLoader dcl = loadDefaultImage(ReflectionUtil.threadClassLoader());

        dcl.apply("shenj.platform.InstallPrimitives");
        dcl.apply("shenj.platform.InstallBuiltins");
        
        Object o = dcl.apply("shenj.root.EvalKl", makeCons(symbol("run-without-macros"), makeCons(symbol("freeze"), makeCons(symbol("read-file"), "kl/core.kl"))));
        Cons val = (Cons) o;

        dcl.apply("shenj.root.EvalKl", makeCons(symbol("set"), symbol("shenj.platform/*java-source-directory*"), "C:/dev/git-local/shenj/Shen-on-Java/java/core/"));
        dcl.apply("shenj.root.EvalKl", makeCons(symbol("set"), symbol("shenj.platform/*show-eval*"), true));

        final List<Cons> toProcessLater = new ArrayList<>();
        
        val.forEach(new Lambda1() {
            @Override
            public Object apply(Object x) throws Exception {
                if (x instanceof Cons) {
                    Cons cons = (Cons) x;
                    if (cons.head != null && cons.head == defun) {
                        // process
                        dcl.apply("shenj.root.EvalKl", cons);
                    } else {
                        // hold for later processing
                        toProcessLater.add(cons);
                    }
                }
                return null;
            }
        });
    }
}
