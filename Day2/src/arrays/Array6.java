package arrays;

import java.sql.SQLOutput;

public class Array6 {
    public static void main(String[] args) {
        int sum=0;
        int a[][]={
                {10,20,30},
                {30,40,50},
                {70,10,20}
        };
        for(int j=0;j<a[0].length;j++){
            for(int i=0;i<a.length;i++){
                sum = sum+ a[i][j];
            }
            System.out.println("Sum of "+" Column "+j+" is "+sum);
        }
    }
}
