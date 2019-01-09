package allListTest;

import java.util.WeakHashMap;

/**
 * WeakHashMap中的键key为弱引用，收集器在回收键key后会自动删除key-value
 */
public class WeakHashMapDemo {
    public static void main(String[] args) {
        WeakHashMap<String,String> map = new WeakHashMap<>();
        map.put("hjs","good");
        map.put("北京","你好");
        map.put(new String("111"),"111");
        map.put(new String("222"),"222");
        System.gc();
        //强制回收没有没用引用的对象，不可缺少
        System.runFinalization();
        System.out.println(map.size());
    }

}
