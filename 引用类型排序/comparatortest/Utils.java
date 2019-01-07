package comparatortest;

import java.util.Comparator;
import java.util.List;

/**
 * 工具类，使用冒泡排序实现降序
 */
public class Utils {
    /**
     * 根据数组元素的长度进行排序
     * @param arr
     * @param comparator
     */
    public static void sort(Object[] arr, Comparator comparator) {
        int length = arr.length;
        for (int i = 0; i < length - 1; i++) {
            boolean flag = true;
            for (int j = 0; j < length - 1 - i; j++) {
                if (comparator.compare(arr[j], arr[j + 1]) > 0) {
                    Object temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = false;
                }
            }
            if (flag)
                break;
        }
    }
    /**
     * 对集合中的元素的长度进行排序
     */
    public static <T> void listsort(List<T> list,Comparator<T> comparator){
        //1.将list集合转为数组
        Object[] arr = list.toArray();
        //2.进行排序
        sort(arr,comparator);
        //3.改变list集合中的值
        for (int i = 0; i <arr.length ; i++) {
            list.set(i,(T)arr[i]);
        }
    }
}
