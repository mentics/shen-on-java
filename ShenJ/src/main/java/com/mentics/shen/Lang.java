package com.mentics.shen;

import static com.mentics.shen.RuntimeContext.*;
import static java.util.Calendar.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.management.ManagementFactory;
import java.lang.management.ThreadMXBean;
import java.util.Calendar;
import java.util.GregorianCalendar;


public class Lang {
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
        if (x0 instanceof Number && x1 instanceof Number) {
            return ((Number) x0).doubleValue() == ((Number) x1).doubleValue();
        } else {
            boolean test = x0 != null ? x0.equals(x1) : x1 == null;
            if (test) {
                return true;
            } else {
                return ((x0 != null && x1 != null) && (x0 instanceof Boolean || x1 instanceof Boolean))
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

    public static Object open(Object type, Object location, Object direction) {
        if ("file".equals(type.toString())) {
            String dir = direction.toString();
            File f = new File((String) RuntimeContext.globalProperties.get(symbol("*home-directory*")),
                    (String) location);
            if ("in".equals(dir)) {
                try {
                    return new FileInputStream(f);
                } catch (FileNotFoundException e) {
                    throw new RuntimeException(e);
                }
            } else if ("out".equals(dir)) {
                try {
                    return new FileOutputStream(f);
                } catch (FileNotFoundException e) {
                    throw new RuntimeException(e);
                }
            } else {
                throw new RuntimeException("Invalid stream direction passed to first parameter of open: " + dir);
            }
        } else {
            throw new RuntimeException("Invalid stream type passed to first parameter of open: " + type);
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
}
