package comparatortest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 对数组元素的长度进行排序
 */
public class Demo {
    public static void main(String[] args) {
        String[] arr = {"a", "de", "abc", "abcd"};
        Utils.sort(arr,new StringCom());
        System.out.println(Arrays.toString(arr));
        System.out.println("========list集合的排序==========");
        List<String> list = new ArrayList<>();
        list.add("001");
        list.add("0001");
        list.add("00001");
        list.add("01");
        Utils.listsort(list,new StringCom());
        System.out.println(list);
    }
}
