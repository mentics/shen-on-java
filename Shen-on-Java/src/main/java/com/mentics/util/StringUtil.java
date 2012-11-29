package com.mentics.util;

import static com.mentics.shenj.ShenException.*;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Writer;
import java.util.Arrays;

import com.mentics.shenj.ShenException;


public class StringUtil {
    public static final String TEMP_DIR = System.getProperty("java.io.tmpdir");


    public static String removeLastToken(final String delim, final String name) {
        final int index = name.lastIndexOf(delim);
        if (index != -1) {
            return name.substring(0, index);
        } else {
            return name;
        }
    }

    public static boolean isBlank(final String text) {
        return (text == null) || text.length() == 0;
    }

    public static String lastToken(final String delim, final String str) {
        return !isBlank(str) ? str.substring(str.lastIndexOf(delim) + 1) : "";
    }

    public static void writeFully(String path, String code) {
        Writer out = null;
        try {
            out = new FileWriter(path);
            out.write(code);
        } catch (IOException e) {
            throw new ShenException(e);
        } finally {
            try {
                out.close();
            } catch (Exception e) {
                // ignore
            }
        }
    }

    public static long copy(InputStream from, OutputStream to) throws IOException {
        byte[] buf = new byte[0x1000];
        long total = 0;
        while (true) {
            int r = from.read(buf);
            if (r == -1) {
                break;
            }
            to.write(buf, 0, r);
            total += r;
        }
        return total;
    }

    public static void writeToFile(String content, File file) {
        Writer out = null;
        try {
            file.getParentFile().mkdirs();
            out = new FileWriter(file);
            out.write(content);
        } catch (IOException e) {
            throw new ShenException(e);
        } finally {
            try {
                out.close();
            } catch (Exception e) {
                // ignore
            }
        }
    }

    public static String readFully(File file) {
        try (FileReader reader = new FileReader(file)) {
            char[] buffer = new char[(int) file.length()];
            reader.read(buffer);
            return new String(buffer);
        } catch (Exception e) {
            rethrow(e);
            return null; // unreachable code
        }
    }

    public static String toString(Object o) {
        if (o != null && o.getClass().isArray()) {
            // TODO: handle primitives
            return Arrays.toString((Object[]) o);
        } else {
            return o == null ? "null" : o.toString();
        }
    }
    
    public static String join(String delim, Object[] arr) {
        if (arr.length > 0) {
            StringBuilder builder = new StringBuilder();
            builder.append(arr[0]);
            for (int i = 1; i < arr.length; i++) {
                builder.append(' ');
                builder.append(arr[i]);
            }
            return builder.toString();
        } else {
            return "";
        }
    }
}
