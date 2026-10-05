package Demo1;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Sample1 {
    public static void main(String[] args) {
        String s = "123 456 789";
        System.out.println(s.replaceFirst("", "-"));

        String s1 = "hello java";
        String x = "java";
        String y = "python";
        System.out.println(x + y);
        System.out.println(x.concat(y));

        String sr[] = {"java", "python", "C++"};
        System.out.println((String.join("-", sr)));
        System.out.println(s1.trim());

        String p2 = "2java";
        System.out.println(p2.matches("^[A-Z].x"));

        String p1 = "54768593";
        String p3 = "JAVA@1234";
        System.out.println(p3.matches(".*[^A-Z,a-z,0-9].x"));
        String p5 = "JAva123";
        System.out.println(p5.replaceAll("[*0-9]", ""));
        String p7 = "JAva125";
        System.out.println(p7.replaceAll("[^0-9]", ""));
        String p6 = "JAva@gmail.com";
        System.out.println(p6.replaceAll("gmail.com", "nitte.edu"));
        String password = "dhanlakshmi@125";
        System.out.println(password.matches(""));
        if(password.length() > 10 && password.matches(".*[^A-Z,a-z,0-9].*") && password.matches(".*[^A-Z,a-z,0-9].*"))
            ;
        {
            System.out.println("Strong password");
        } else {
            System.out.println("weak password");
        }
        String email = "java@gmail.com";
        String parts[]=email.split("@");
        String sr1 = Arrays.toString(email.split("@"));
        System.out.println(" " + sr1);
        if (sr1.length() > 2)
        {
            System.out.println("Invalid password");
        }
    }
}