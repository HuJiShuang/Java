package allListTest;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 使用Collections的实现只读控制
 */
public class OnlyRead {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("aaa",111);
        map.put("bbb",222);
        Map<String, Integer> map1 = Collections.unmodifiableMap(map);
        //由于设置了只读设置，所以不能对map1进行操作，但是对原有map进行操作无影响
        //map1.put("ccc",333);
        System.out.println(map1.size());
        //设置为只能包含一个元素的容器
        List<String> strings = Collections.singletonList(new String());
        strings.add("aaa");
    }
}

