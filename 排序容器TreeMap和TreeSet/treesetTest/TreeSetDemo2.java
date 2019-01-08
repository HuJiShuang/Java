package treesetTest;

import java.util.TreeSet;

public class TreeSetDemo2 {
    public static void main(String[] args) {
        Worker w1 = new Worker("垃圾回收员",12000);
        Worker w2 = new Worker("农民工",1500);
        Worker w3 = new Worker("程序员",500);
        TreeSet<Worker> treeSet = new TreeSet<>();
        treeSet.add(w1);
        treeSet.add(w2);
        treeSet.add(w3);
        System.out.println(treeSet);
    }
}
