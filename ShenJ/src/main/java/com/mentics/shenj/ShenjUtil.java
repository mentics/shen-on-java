package com.mentics.shenj;

import static com.mentics.shenj.ShenjRuntime.*;

import java.util.ArrayList;
import java.util.List;


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
                type = stripSymbolCall((String) args[i + 2]);
                i += 2;
            } else {
                type = "*";
            }
            ret.add(new String[] { val, type });
        }
        return ret;
    }

    public static Object[] tuple(Object one, Object two) {
        return new Object[] { symbol("shen-tuple"), one, two };
    }

    public static String stripSymbolCall(String str) {
        return str.substring("symbol(\"".length(), str.length() - "\")".length());
    }

    public static String makeArgString(Class<?>[] types, List<String[]> argsWithTypes) throws Exception {
        if (types.length != argsWithTypes.size()) {
            return null;
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
}
