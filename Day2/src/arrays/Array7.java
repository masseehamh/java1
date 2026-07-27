package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Array7 {
    public static void main(String[] args) {
        int a[][]= {
                {10,20,30},
                {20,30,40},
                {40,50,60}
        };
        int rows=a.length;
        int columns=a[0].length;
        int b[][]= new int[columns][rows];
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++)
            {
                b[j][i]=a[i][j];
            }
        }
        System.out.println(Arrays.deepToString(b));
    }
}
