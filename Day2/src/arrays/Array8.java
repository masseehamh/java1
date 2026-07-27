package arrays;

import java.util.Scanner;

public class Array8 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int rev=0;
        System.out.println("Enter the number to reverse");
        int num=s.nextInt();
        int pal=num;
        while(num!=0) {
            int digit = num % 10;
            //sum = sum + digit;
            rev= (rev*10)+digit;
            num=num/10;


        }
        if(rev==pal) {
            System.out.println("It is a palindrome");
        }
        else{
            System.out.println("It is not a palindrome");
        }
    }
}
