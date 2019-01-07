package compar;

import java.util.Arrays;
import java.util.Date;

/**
 * 日期数组排序
 */
public class Demo1 {
    public static void main(String[] args) {
        Date[] arr = new Date[3];
        arr[0] = new Date();
        //当前时间的前一个小时
        arr[1] = new Date(System.currentTimeMillis()-1000*60*60);
        //当前时间的后一个小时
        arr[2] = new Date(System.currentTimeMillis()+1000*60*60);
        Utils.sort(arr);//降序
        System.out.println(Arrays.toString(arr));
    }
}
