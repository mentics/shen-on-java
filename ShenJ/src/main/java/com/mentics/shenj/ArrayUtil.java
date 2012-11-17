package com.mentics.shenj;

import java.net.URL;


public class ArrayUtil {
    public static URL[] add(URL[] urls, URL url) {
        URL[] newUrls = new URL[urls.length + 1];
        System.arraycopy(urls, 0, newUrls, 0, urls.length);
        newUrls[newUrls.length - 1] = url;
        return newUrls;
    }
}
