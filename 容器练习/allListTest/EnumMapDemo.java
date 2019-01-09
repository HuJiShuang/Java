package allListTest;

import java.util.EnumMap;

/**
 * EnumMap要求key为枚举
 */
public class EnumMapDemo {
    public static void main(String[] args) {
    //构造EnumMap比较特殊，要求key为枚举类，参数为枚举类.class
        EnumMap<Season,String> map = new EnumMap<Season, String>(Season.class);
        map.put(Season.Spring,"春困");
        map.put(Season.Summer,"夏无力");
        map.put(Season.Autumn,"秋乏");
        map.put(Season.Winter,"冬眠");
        System.out.println(map);
    }
}
enum Season{
    Spring,Summer,Autumn,Winter
}
