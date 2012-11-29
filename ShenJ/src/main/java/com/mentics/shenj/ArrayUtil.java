package com.mentics.shenj;

import java.net.URL;


public class ArrayUtil {
    public static URL[] add(URL[] urls, URL url) {
        URL[] newUrls = new URL[urls.length + 1];
        System.arraycopy(urls, 0, newUrls, 0, urls.length);
        newUrls[newUrls.length - 1] = url;
        return newUrls;
    }

    public static Object[] removeFirst(int num, Object[] args) {
        Object[] ret = new Object[args.length - num];
        for (int i = ret.length - 1; i >= 0; i--) {
            ret[i] = args[i + num];
        }
        return ret;
    }
}
