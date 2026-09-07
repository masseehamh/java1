package sample;

import java.util.HashSet;
import java.util.TreeSet;

public class Demo1 {
    public static void main(String[] args) {
        HashSet<Integer> set1=new HashSet<>();
        set1.add(10);set1.add(20);set1.add(30);set1.add(40);set1.add(50);
        System.out.println(set1);
        set1.add(10);
        System.out.println(set1);
        HashSet<Integer> set2=new HashSet<>();
        set2.add(100);set2.add(200);set2.add(300);set2.add(400);set2.add(500);
        System.out.println(set2);
        set1.addAll(set2);
        System.out.println(set1);
        System.out.println(set1.containsAll(set2));
        set1.removeAll(set2);
        System.out.println(set1);

        TreeSet<Integer> s2=new TreeSet<>();
        s2.add(10);
        System.out.println(s2);
        s2.add(50);
        s2.add(20);
        s2.add(30);
        //s2.add(null);
        System.out.println(s2);
        System.out.println(s2.headSet(23));
        System.out.println(s2.tailSet(23));
        System.out.println(s2.subSet(10,20));
    }
}
