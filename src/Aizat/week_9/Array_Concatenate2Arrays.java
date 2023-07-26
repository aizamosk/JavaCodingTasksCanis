package Aizat.week_9;

import java.util.Arrays;

public class Array_Concatenate2Arrays {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(concatenate2Arrays(new int[]{4,5,6,7,8}, new int[]{1,2,3,4,9})));
    }
   /*
    Write a return method that can concatenate two arrays
    */

    public static int[] concatenate2Arrays(int[] arr1,int[] arr2){

        int[] arr3= new int[arr1.length+arr2.length];

        int i= 0;
        for(int each:arr1){
            arr3[i] = each;
            i++;
        }
        for (int each :arr2) {
            arr3[i]=each;
            i++;
        }
        return arr3;
    }
}
