package javatest;

public class CharTest {
    static String s = "hello";
    static String t = "hello";
    static char c[] = {'h','e','l','l','o'};
    static String s1 = new String("helolo");

    public static void main(String[] args) {
        System.out.println(s.equals(t));
        System.out.println(t.equals(c));
        System.out.println(s == t);
        System.out.println(t.equals(new String("hello")));
        //相当于打印对象的内存地址
        System.out.println(s.hashCode());
        System.out.println(s1.hashCode());
    }
}
