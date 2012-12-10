package com.mentics.shenj;

import static com.mentics.shenj.ShenjRuntime.*;
import static java.util.Calendar.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.management.ManagementFactory;
import java.lang.management.ThreadMXBean;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;


public class Lang {
    public static final Object[] EMPTY_OBJECT_ARRAY = new Object[0];


    public static String errorToString(Object error) {
        if (error instanceof Throwable) {
            StringWriter s = new StringWriter();
            ((Throwable) error).printStackTrace(new PrintWriter(s));
            String ret = s.toString();
            try {
                s.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            return ret;
        } else {
            return error.toString();
        }
    }

    public static boolean equals(Object x0, Object x1) {
        if (x0 == x1) {
            return true;
        }
        if ((x0 != null && x1 == null) || (x0 == null && x1 != null)) {
            return false;
        }

        if (x0 instanceof Double && x1 instanceof Double) {
            return (double)x0 == (double)x1;
        } else {
            if (x0 != null && x0.getClass().isArray()) {
                if (x1 != null && x1.getClass().isArray()) {
                    Object[] arr0 = (Object[]) x0;
                    Object[] arr1 = (Object[]) x1;
                    if (arr0.length == arr1.length) {
                        for (int i = 0; i < arr0.length; i++) {
                            if (!Lang.equals(arr0[i], arr1[i])) {
                                return false;
                            }
                        }
                        return true;
                    }
                }
                return false;
            }
            if (x0.equals(x1)) {
                return true;
            } else {
                return (x0 instanceof Boolean || x1 instanceof Boolean)
                        && symbol(x0.toString()).equals(symbol(x1.toString()));
            }
        }
    }

    public static Object getTime(Object arg) {
        String type = arg.toString();
        switch (type) {
        case "real":
            long time = System.nanoTime();
            return (double) time / 10E9;
        case "run":
            ThreadMXBean bean = ManagementFactory.getThreadMXBean();
            if (bean.isCurrentThreadCpuTimeSupported()) {
                return bean.getCurrentThreadCpuTime() / 1000000000.0;
            } else {
                throw new RuntimeException("CPU run time not supported.");
            }
        case "date":
            // year, month, day, hour, minute and second.
            Calendar c = GregorianCalendar.getInstance();
            return Cons.makeCons(c.get(YEAR), c.get(MONTH), c.get(DAY_OF_MONTH), c.get(HOUR_OF_DAY), c.get(MINUTE),
                    c.get(SECOND));
        default:
            throw new RuntimeException("Invalid parameter to get-time.");
        }
    }

    public static int methodParamCount(String code, String functionString) {
        int paramCount = 0;
        int level = 0;
        if (code.indexOf(functionString) == -1) {
            return -1;
        }
        int pos = code.indexOf(functionString) + functionString.length();
        for (int i = pos; i < code.length(); i++) {
            char c = code.charAt(i);
            switch (c) {
            case '(':
                level++;
                break;
            case ')':
                level--;
                if (level == 0) {
                    return paramCount;
                }
                break;
            case ',':
                if (level == 1) {
                    paramCount++;
                }
                break;
            default:
                if (paramCount == 0 && !Character.isWhitespace(c)) {
                    paramCount = 1;
                }
            }
        }
        throw new ShenException("Missing end paranthesis determining arity of function " + functionString);
    }

    public static <A, B> Map<A, B> mapOf(A key, B value) {
        Map<A, B> m = new HashMap<>();
        m.put(key, value);
        return m;
    }
}
