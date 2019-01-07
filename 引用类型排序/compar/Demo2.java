package compar;

import java.util.ArrayList;
import java.util.List;

public class Demo2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList();
        list.add("a");
        list.add("def");
        list.add("abc");
        list.add("abcd");
        Utils.genListSort(list);
        System.out.println(list);
    }
}
