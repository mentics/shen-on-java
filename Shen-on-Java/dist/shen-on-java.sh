#!/bin/sh

# JDK_HOME=/usr/lib/jvm/java-7-oracle
# export JDK_HOME

"$JDK_HOME/bin/java" -Xss128m -XX:MaxPermSize=512m -Xmx512m -classpath lib/kryo-debug-2.20-all.jar:shen-on-java.jar com.mentics.shenj.REPL $1
