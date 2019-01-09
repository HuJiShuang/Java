package allListTest;

import java.util.Enumeration;
import java.util.Vector;

/**
 * 测试Enumeration迭代器
 */
public class EnumerationDemo {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        vector.add(1);
        vector.add(2);
        vector.add(3);
        //
        Enumeration<Integer> elements = vector.elements();
        while (elements.hasMoreElements())
            System.out.println(elements.nextElement());
    }
}
