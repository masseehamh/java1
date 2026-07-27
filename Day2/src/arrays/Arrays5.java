package arrays;

import java.util.Scanner;

public class Arrays5 {
    public static void main(String[] args) {
        //Scanner s = new Scanner(System.in);
        int sum=0;
        int a[][] = {
                {20,30,10},
                {10,20,30},
                {60,70,80}
        };
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                sum = sum+a[i][j];
            }
            System.out.println("Sum of "+"row "+i+ " is "+sum);
        }
    }
}


