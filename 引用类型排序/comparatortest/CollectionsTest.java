package comparatortest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 使用jdk自带的Collections自带的排序规则
 */
public class CollectionsTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("001");
        list.add("0001");
        list.add("00001");
        list.add("01");
        Collections.sort(list,new StringCom());
        System.out.println(list);
    }
}
