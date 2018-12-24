package javatest;

public class NumberMath {
    public static void main(String[] args) {
        Integer x = 10;
        int a = x.intValue();
        double b = x.doubleValue();
        float c = x.floatValue();
        byte d = x.byteValue();
        long e = x.longValue();
        short f = x.shortValue();
        //测试xxxValue()方法
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        //测试valueOf()方法
        System.out.println("测试valueOf()方法");
        System.out.println(Integer.valueOf("8"));
        System.out.println(Double.valueOf("9"));
        System.out.println(Float.valueOf("10"));
        System.out.println(Byte.valueOf("11"));
        System.out.println(Long.valueOf("12"));
        System.out.println(Short.valueOf("13"));
        //随机数练习
        System.out.println(Math.random());
        System.out.println(Math.random());
    }
}
