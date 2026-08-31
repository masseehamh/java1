package exceptionalhandling;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;

public class demo3 {
    public static void main(String[] args) {
        employee e1 = new employee(1, 35, "ram");
        employee e2 = new employee(2, 40, "sham");

        ArrayList<employee> list1 = new ArrayList<>();
        list1.add(e1);
        list1.add(e2);
        list1.add(new employee(3, 25, "sita"));

        for (employee e : list1) {
            System.out.println(e.getId() + " " + e.getName() + " " + e.getAge());
        }

        ArrayList<product> list2 = new ArrayList<>();
        product p2 = new product(302, 500, "keyboard");
        list2.add(new product(301, 300, "wireless mouse"));
        list2.add(p2);
        list2.add(new product(303, 2500, "usha fans"));

        for (product p : list2) {
            System.out.println(p.getId() + " " + p.getPrice() + " " + p.getName());
        }

        ArrayList<Object> list3 = new ArrayList<>();
        list3.add(e1);
        list3.add(p2);
        for (Object o : list3) {
            System.out.println(o);
        }

        ArrayList<String> list4 = new ArrayList<>();
        list4.add("Apple");
        list4.add("Orange");
        list4.add("Banana");
        list4.add("Cherry");
        list4.add("Strawberry");
        list4.add("Apple");
        System.out.println(list4);

        //using for loop
        System.out.println("using for loop");
        for (int i = 0; i < list4.size(); i++) {
            System.out.println(list4.get(i));
        }

        //using for each loop
        System.out.println("using for each loop");
        for(String s:list4)
        {
            System.out.println(s);
        }

        //using iterator interface
        System.out.println("using iterator");
        Iterator<String> x=list4.iterator();
        while(x.hasNext()){
            System.out.println(x.next());
        }
        //List Iterator Interface
        System.out.println("Using List Iterator");
        ListIterator<String> x1=list4.listIterator();
        while(x1.hasNext())
        {
            System.out.println(x1.next());
        }
        System.out.println("reverse order");
        while(x1.hasPrevious())
        {
            System.out.println(x1.previous());
        }

        String s1= "masseeha";
        char[] a=s1.toCharArray();
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        Arrays.equals()
    }
}
