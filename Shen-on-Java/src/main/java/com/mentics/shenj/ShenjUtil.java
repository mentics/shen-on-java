package com.mentics.shenj;

import static com.mentics.shenj.ShenjRuntime.*;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;

import com.mentics.shenj.inner.Context;
import com.mentics.util.StringUtil;


public class ShenjUtil {
    public static final String SPLITTER = "symbol(\":\")";


    public static List<String[]> makeTypePairList(Object[] args) throws Exception {
        int length = args.length;
        List<String[]> ret = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            String val = (String) args[i];
            String type;
            if (i + 1 < length && SPLITTER.equals(args[i + 1])) {
                if (i + 2 >= length) {
                    throw new ShenException("Type expected after : for " + val + " in arg list " + args);
                }
                type = removeDotPkg(stripSymbolCall((String) args[i + 2]));
                i += 2;
            } else {
                type = "*";
            }
            ret.add(new String[] { val, type });
        }
        return ret;
    }

    public static Object[] tuple(Object one, Object two) {
        return new Object[] { symbol("shen.tuple"), one, two };
    }

    public static Object[] tuple(Object one, Object two, Object three) {
        return tuple(one, tuple(two, three));
    }

    public static String stripSymbolCall(String str) {
        return str.startsWith("symbol(") ? str.substring("symbol(\"".length(), str.length() - "\")".length()) : str;
    }

    public static String makeArgString(Class<?>[] types, List<String[]> argsWithTypes) throws Exception {
        if (types.length != argsWithTypes.size()) {
            return null;
        }
        if (types.length == 0) {
            return "";
        }

        final StringBuilder builder = new StringBuilder();

        for (int i = 0; i < types.length; i++) {
            String[] argWithType = argsWithTypes.get(i);
            if (!"*".equals(argWithType[1])) {
                // Do the types match?
                if (argWithType[1].equals(types[i].getName()) || argWithType[1].equals(types[i].getSimpleName())) {
                    builder.append("(" + argWithType[1] + ")" + argWithType[0]).append(", ");
                } else {
                    return null;
                }
            } else {
                String paramTypeName = types[i].getName();
                if (paramTypeName.equals("java.lang.Object")) {
                    builder.append(argWithType[0]).append(", ");
                } else {
                    builder.append("(" + paramTypeName + ")" + argWithType[0]).append(", ");
                }
            }
        }

        builder.setLength(builder.length() - 2);
        return builder.toString();
    }

    public static Object first(Object tuple) {
        return ((Object[]) tuple)[1];
    }

    public static Object second(Object tuple) {
        Object[] t0 = (Object[]) tuple;
        if (t0[2].getClass().isArray()) {
            Object[] t1 = (Object[]) t0[2];
            if (t1[0] == symbol("shen.tuple")) {
                return t1[1];
            } else {
                // The second item in the tuple is an array
                return t1;
            }
        } else {
            return ((Object[]) tuple)[2];
        }
    }

    /**
     * NOTE: 4-tuples will not work here!
     */
    public static Object third(Object tuple) {
        Object[] t0 = (Object[]) tuple;
        return ((Object[]) t0[2])[2];
    }

    public static String removeDotPkg(String s) {
        return s.startsWith("shenj.dot/") ? s.substring("shenj.dot/".length()) : s;
    }

    public static String makeConsArgString(final Object call, Object[] args) throws Exception, ClassNotFoundException {
        List<String[]> argsPairList = makeTypePairList(args);
    
        Class<?> cls;
        try {
            cls = Context.loadClass((String) call);
        } catch (ClassNotFoundException e) {
            cls = Context.loadClass("java.lang." + call);
        }
    
        String argString = null;
        for (Constructor<?> constructor : cls.getConstructors()) {
            Class<?>[] types = constructor.getParameterTypes();
            String newArgString = makeArgString(types, argsPairList);
            if (newArgString != null) {
                if (argString != null) {
                    throw new ShenException("Ambiguous constructors for signature " + call + " "
                            + StringUtil.toString(args));
                } else {
                    argString = newArgString;
                }
            }
        }
        if (argString != null) {
            return argString;
        } else {
            throw new ShenException("No constructor found for: " + call + ", " + args);
        }
    }
}
