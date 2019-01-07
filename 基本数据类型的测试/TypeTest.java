package javatest;

public class TypeTest {
    public static void main(String[] args) {
        long test = 012;
        float f = -412;
        //int ohter = (int)true;
        double d = 0x12345678;
        //byte的存储范围是-128-127
        byte b = -128;
        System.out.println(d);
        boolean result = false;
        //int类型无法转换为boolean类型
        //result = 1;
    }
}

