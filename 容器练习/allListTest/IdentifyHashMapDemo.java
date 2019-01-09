package allListTest;

import java.util.IdentityHashMap;

/**
 * IdentifyHashMapDemo键比较是以地址去重，而不是hashcode和equals
 */
public class IdentifyHashMapDemo {
    public static void main(String[] args) {
        IdentityHashMap<String,String> map = new IdentityHashMap<>();
        map.put("a","a1");
        map.put("a","a2");
        System.out.println(map.size());//会输出1，因为都是常量，它们的地址相同
        map.put(new String("a"),"a3");
        System.out.println(map.size());//会输出2
    }
}
