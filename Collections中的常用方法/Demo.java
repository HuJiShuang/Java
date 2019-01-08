package collectionsTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *练习Collections集合中的常用方法
 */
public class Demo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);
        /**
         * 反转list集合中的元素
         */
        Collections.reverse(list);
        System.out.println(list);
        /**
         * 模拟洗牌
         */
        List<Integer> list1 = new ArrayList<>();
        for (int i = 1; i <=54 ; i++) {
            list1.add(i);
        }
        Collections.shuffle(list1);
        System.out.println(list1);
    }
}
