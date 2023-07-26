package Mehrubon.week_9;

import java.util.Arrays;

public class Array_Concatenate2Arrays {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(concatenateTwoArrays(new int[]{1,2,3,4,5}, new int[]{5,6,7,8,9})));
    }


    public static int[] concatenateTwoArrays(int[] arr1, int[] arr2){
        int[] arr3 = new int[arr1.length + arr2.length]; //3d array can contain the elements of arr1 and arr2

        int i = 0;
        for (int each : arr1) {
            arr3[i] = each;
            i++;
        }

        for (int each : arr2) {
            arr3[i] = each;
            i++;
        }
        return arr3;

    }
   /*
    Write a return method that can concatenate two arrays
    */

}
