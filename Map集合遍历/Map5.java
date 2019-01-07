package javatest;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * 遍历Map集合的5种方法
 */
public class Map5 {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("001",1);
        map.put("002",2);
        map.put("003",3);
        map.put("004",4);
        //1.通过Map.keySet遍历key和value
        for (String string:map.keySet()
             ) {
            System.out.println("key:"+string+"value:"+map.get(string));
        }
        System.out.println("==========================");
        //2.通过Map.entrySet使用Iterator遍历key和value
        Iterator<Map.Entry<String,Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String,Integer> entry = iterator.next();
            System.out.println("key:"+entry.getKey()+"value:"+entry.getValue());
        }
        System.out.println("==========================");
        //3.通过Map.entrySet遍历key和value
        for (Map.Entry<String,Integer> entry:map.entrySet()
             ) {
            System.out.println("key:"+entry.getKey()+"value:"+entry.getValue());
        }
        System.out.println("==========================");
        //4.遍历Map集合中所有的key
        for (String string:map.keySet()
             ) {
            System.out.println(string);
        }
        System.out.println("==========================");
        //5.遍历Map集合中所有的value
        for (Integer i:map.values()
             ) {
            System.out.println(i);
        }
    }
}
