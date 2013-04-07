#!/bin/sh
java -Xss128m -XX:MaxPermSize=512m -Xmx512m -classpath lib/kryo-debug-2.20-all.jar:lib/ecj-4.2.1.jar:shen-on-java.jar com.mentics.shenj.REPL $1
