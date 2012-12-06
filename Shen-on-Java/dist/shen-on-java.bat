rem JDK_HOME must point to a JDK, not just a JRE
rem set JDK_HOME=C:/dev/java/jdk1.7.0_06
rem echo %JDK_HOME%
"%JDK_HOME%/bin/java" -Xss128m -XX:MaxPermSize=512m -Xmx512m -classpath lib/kryo-debug-2.20-all.jar;shen-on-java-0.6.0.jar com.mentics.shenj.REPL
