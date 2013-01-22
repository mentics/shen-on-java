package shenj.platform;

import static com.mentics.shenj.Lang.*;
import static com.mentics.shenj.Nil.*;
import static com.mentics.shenj.ShenjRuntime.*;
import static com.mentics.shenj.ShenjUtil.*;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

import com.mentics.shenj.Cons;
import com.mentics.shenj.Lambda;
import com.mentics.shenj.Lambda2;
import com.mentics.shenj.ShenException;
import com.mentics.shenj.ShenjUtil;
import com.mentics.shenj.Symbol;
import com.mentics.shenj.inner.Context;
import com.mentics.util.StringUtil;


public class SubClassInfo {
    public static final Symbol SYMBOL = symbol("shenj.platform/sub-class-info");
    public static Lambda LAMBDA = new Lambda2() {
        public Object apply(final Object call, final Object theArgs) throws Exception {
            Object first = ShenjUtil.first(theArgs);
            Object[] constructorArgs = first == NIL ? EMPTY_OBJECT_ARRAY : ((Cons) first).toArray();
            Object second = ShenjUtil.second(theArgs);
            Object[] methodDefs = second == NIL ? EMPTY_OBJECT_ARRAY : ((Cons) second).toArray();

            String consArgsString = "";
            if (constructorArgs.length > 0) {
                consArgsString = ShenjUtil.makeConsArgString(call, constructorArgs);
            }

            String bodyString = methodStuff(call, methodDefs);

            return ShenjUtil.tuple(consArgsString, bodyString);
        }
    };


    public static String methodStuff(final Object call, Object[] methods) throws ClassNotFoundException {
        StringBuilder bodyString = new StringBuilder();
        for (int i = 0; i < methods.length; i++) {
            String name = stripQuotes(ShenjUtil.first(methods[i]).toString());
            // i+1 is the :
            String bodyCall = "((Lambda)" + second(methods[i]) + ")";
            String methodString = null;

            Class<?> c;
            try {
                c = Context.loadClass((String) call);
            } catch (ClassNotFoundException e) {
                c = Context.loadClass("java.lang." + call);
            }
            for (Method m : c.getMethods()) {
                if ((m.getModifiers() & Modifier.STATIC) != 0 || !name.equals(m.getName())) {
                    continue;
                }

                if (methodString != null) {
                    throw new ShenException("Ambiguous method " + name + " for sub-class " + call + "   "
                            + Arrays.toString(methods));
                }

                StringBuilder meth = new StringBuilder();
                meth.append(Modifier.toString(m.getModifiers()).replaceAll(" ?abstract", ""));
                meth.append(' ').append(m.getReturnType().getName());
                meth.append(' ').append(name).append('(');
                StringBuilder callString = new StringBuilder();
                if (m.getParameterTypes().length > 0) {
                    for (int j = 0; j < m.getParameterTypes().length; j++) {
                        meth.append(m.getParameterTypes()[j].getName()).append(" arg").append(j).append(',');
                        callString.append("arg").append(j).append(',');
                    }
                    // Remove extra ,
                    meth.setLength(meth.length() - 1);
                    callString.setLength(callString.length() - 1);
                }
                meth.append(")");
                if (m.getExceptionTypes().length > 0) {
                    meth.append(" throws ");
                    StringUtil.join(",", m.getExceptionTypes());
                }
                meth.append(" {\n try {\n");
                if (m.getReturnType() != Void.TYPE) {
                    meth.append("return ");
                }
                meth.append(bodyCall);
                meth.append(".apply(").append(callString).append(");\n");
                meth.append("} catch (Exception e) {\nShenException.rethrow(e);\n");
                if (m.getReturnType() != Void.TYPE) {
                    meth.append("return null; // unreachable\n");
                }
                meth.append("}\n}\n");
                methodString = meth.toString();
            }

            if (methodString == null) {
                throw new ShenException("Could not find method " + name + " for sub-class " + call + "   "
                        + Arrays.toString(methods));
            }

            bodyString.append(methodString);
        }
        return bodyString.toString();
    }


    private static String stripQuotes(String string) {
        if (string.charAt(0) == '"') {
            string = string.substring(1);
        }
        if (string.charAt(string.length() - 1) == '"') {
            string = string.substring(0, string.length()-1);
        }
        return string;
    }
}
