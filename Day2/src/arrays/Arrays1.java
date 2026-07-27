package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays1 {
    public static void main(String[] args) {
        //int[] a ={10,20,32,40,52};
        Scanner s = new Scanner(System.in);
        //int a[]= new int[5];
        String a[]=new String[5];
        System.out.println("Enter the array elements:");
        for(int i =0;i<a.length;i++)
        {
            //a[i]=s.nextInt();
            a[i]=s.next();
        }
        System.out.println(Arrays.toString(a));
    }
}
