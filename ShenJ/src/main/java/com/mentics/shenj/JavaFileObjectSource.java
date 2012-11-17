package com.mentics.shenj;

import java.util.Collection;

import javax.tools.JavaFileObject;

public interface JavaFileObjectSource {

    Collection<JavaFileObject> files(String packageName);

}
