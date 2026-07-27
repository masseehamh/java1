package Strings;

import java.sql.SQLOutput;

public class test1 {
    public static void main(String[] args) {
        //Mutable--StringBuilder, StringBuffer
//        StringBuilder s=new StringBuilder("Java");
//        System.out.println(s);
//        StringBuffer s1=new StringBuffer("Python");
//        System.out.println(s1);
//        s1.append("language");
//        System.out.println(s1);
//        s1.insert(1,"abd");
//        System.out.println(s1);
//        s1.replace(1,5,"riya");
//        System.out.println(s1);
//        s1.reverse();
//        s1.delete(2,5);
//        System.out.println(s1);

        //Immutable --2 ways to create
        //1. Type -1 declaration
        String s1="Java";
        String s2="Java";
        System.out.println(s1==s2);

        //2. Type - 2 declaration
        String s3= new String("Python");
        String s4=new String("Python");
        System.out.println(s3==s4);


    }
}
