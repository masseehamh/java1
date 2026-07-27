package arrays;

import java.util.Scanner;

public class Arrays4 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a[]=new int[5];
        System.out.println("Enter the elements");
        for(int i=0;i<a.length;i++){
            a[i]=s.nextInt();
        }
        int min = a[0];
        int max = a[0];
        for(int i=0;i<a.length;i++){
            if (a[i]<min){
                min = a[i];
            }
            if (a[i]>max){
                max = a[i];
            }
        }
        System.out.println("Minimum is: "+min);
        System.out.println("Maximum is "+max);
    }
}
