package javatest;

public class Right {
    public static void main(String[] args) {
        int a = -3;
        System.out.println("数字a的二进制表示:"+Integer.toBinaryString(a));
        System.out.println("数字a的值为:"+a);
        int b = a >> 2;
        System.out.println("数字b的二进制表示:"+Integer.toBinaryString(b));
        System.out.println("数字b的值为:"+b);
        int c = a >>> 2;
        System.out.println("数字b的二进制表示:"+Integer.toBinaryString(c));
        System.out.println("数字c的值为:"+c);
        int d = 8;
        int e = d >>> 2;
        System.out.println("数字e的二进制表示:"+Integer.toBinaryString(e));
        System.out.println("数字b的值为:"+e);
    }
}
