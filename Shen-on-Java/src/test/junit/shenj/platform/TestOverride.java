package shenj.platform;

class TestOverride {
    public static void bar(String one, int two, Object three) {
    }

    public static int bar(int one, Object two, String three) {
        return one;
    }

    public static String bar(Object one, String two, int three) {
        return "two";
    }
    
    
    public TestOverride(String one, int two, Object three) {
    }

    public TestOverride(int one, Object two, String three) {
    }

    public TestOverride(Object one, String two, int three) {
    }

    public void foo(String one, int two, Object three) {
    }

    public int foo(int one, Object two, String three) {
        return one;
    }

    public String foo(Object one, String two, int three) {
        return "two";
    }
}