package compar;

import java.util.Iterator;
import java.util.List;

/**
 * 工具类，使用冒泡排序实现降序
 */
public class Utils {

    /**
     * 使用泛型实现集合排序
     */
    public static  <T extends  Comparable<T>> void genListSort(List<T> list){
        //1.把list集合转为数组
        //由于没有泛型数组，所以只能使用Object
        Object[] arr = list.toArray();
        //2.排序
        sort(arr);
        //3.改变容器中的值
        for (int i = 0; i <arr.length ; i++) {
            list.set(i,(T)arr[i]);
        }
    }
    /**
     * 使用泛型实现数组排序
     * @param arr
     */
    public static <T extends Comparable<T>> void genSort(T[] arr){
        int length = arr.length;
        for (int i = 0; i < length - 1; i++) {
            boolean flag = true;
            for (int j = 0; j < length - 1 - i; j++) {
                if (((Comparable)arr[j]).compareTo(arr[j+1]) < 0) {
                    T temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = false;
                }
            }
            if(flag)
                break;
        }
    }

    /**
     * 普通排序
     * @param arr
     */
    public static void sort(Object[] arr){
        int length = arr.length;
        for (int i = 0; i < length - 1; i++) {
            boolean flag = true;
            for (int j = 0; j < length - 1 - i; j++) {
                if (((Comparable)arr[j]).compareTo(arr[j+1]) < 0) {
                    Object temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = false;
                }
            }
            if(flag)
                break;
        }
    }
}
