package com.mentics.shen;

import java.util.Collection;

import javax.tools.JavaFileObject;

public interface JavaFileObjectSource {

    Collection<JavaFileObject> files(String packageName);

}
