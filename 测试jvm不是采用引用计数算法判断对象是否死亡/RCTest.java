package jvm;

public class RCTest {

    public Object instance;
    private static final  int _1MB = 1024 * 1024;
    /**
     * 这个成员属性的唯一意义就是占点内存，以便在GC日志中能看清是否被回收过
     */
    private byte[] bigSize = new byte[2 * _1MB];

    public static void main(String[] args) {
        RCTest a = new RCTest();
        RCTest b = new RCTest();

        a.instance = b;
        b.instance = a;

        a = null;
        b = null;

        System.gc();
    }
}
