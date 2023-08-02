package Aizat.week_10;

import java.util.Arrays;

public class Array_sortingInAscending {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortAscending(3,4,5,2,7,9,8)));
    }
    /*

    Write a method that can sort the ArrayList in Ascending order without using the sort method.
     */

    public static int[] sortAscending(int... arr){
        for(int i = 0; i<arr.length; i++){
            for (int j= 0; j<arr.length-1; j++){
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
                //System.out.println(Arrays.toString(arr));
            }
        }
        return arr;

    }
}

