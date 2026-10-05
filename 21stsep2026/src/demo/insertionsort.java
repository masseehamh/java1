package demo;

import java.util.Arrays;

public class insertionsort {
    public static void main(String[] args) {
        int arr[]={5,4,3,2,1};
        int i,j;
        int key;
        for(i=1;i<arr.length;i++){
            key=arr[i];
            for(j=i-1;j>=0;j--){
                if(arr[j]>key)
                {
                    arr[j+1]=arr[j];
                }

            }arr[j+1]=key;

        }
        for(i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }


}
