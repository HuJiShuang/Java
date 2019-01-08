package treesetTest;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        Person p1 = new Person("您",100);
        Person p2 = new Person("刘德华",1000);
        Person p3 = new Person("梁朝伟",1200);
        Person p4 = new Person("我",50);
        TreeSet<Person> treeSet = new TreeSet<>(new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return -(p1.getHandsome()-p2.getHandsome());
            }
        });
        treeSet.add(p1);
        treeSet.add(p2);
        treeSet.add(p3);
        treeSet.add(p4);
        System.out.println(treeSet);
    }
}
