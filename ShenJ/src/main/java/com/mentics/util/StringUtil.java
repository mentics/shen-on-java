package com.mentics.util;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Writer;

import com.mentics.shen.ShenException;


public class StringUtil {

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

    public static byte[] loadBytesForClass(ClassLoader loader, String fqn) throws IOException {
        InputStream input = loader.getResourceAsStream(fqn.replace(".", "/") + ".class");
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        copy(input, output);
        return output.toByteArray();
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

    public static final String TEMP_DIR = System.getProperty("java.io.tmpdir");
}
