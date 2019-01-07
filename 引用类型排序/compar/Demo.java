package compar;

import java.util.Arrays;

/**
 * 字符串数组排序
 */
public class Demo {
    public static void main(String[] args) {
        String[] arr = {"a", "def", "abc", "abcd"};
        Utils.genSort(arr);//使用泛型工具类进行排序
        System.out.println(Arrays.toString(arr));
    }
}