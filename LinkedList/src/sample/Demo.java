package sample;

import java.util.LinkedList;
import java.util.Stack;

public class Demo {
    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<>();
        list.add(10);
        list.addFirst(200);
        list.addFirst(300);
        System.out.println(list);
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println(list.removeFirst());
        System.out.println(list.removeLast());

        Stack<Integer> s1 = new Stack<>();
        s1.push(100);
        System.out.println(s1);
        s1.push(200);
        s1.push(300);
        s1.push(400);
        System.out.println(s1);
        s1.pop();
        System.out.println(s1);
    }
}
