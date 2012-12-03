rem JDK_HOME must point to a JDK, not just a JRE
set JDK_HOME=C:/dev/java/jdk1.7.0_06
echo %JDK_HOME%
"%JDK_HOME%/bin/java" -classpath lib/kryo-debug-2.20-all.jar;shen-on-java-0.5.jar com.mentics.shenj.REPL
