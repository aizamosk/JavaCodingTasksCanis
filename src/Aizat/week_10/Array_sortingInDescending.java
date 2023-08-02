package Aizat.week_10;

import java.util.Arrays;

public class Array_sortingInDescending {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortDescending(10, 9, 8, 7,8,5)));
    }

     /*

    Write a method that can sort the ArrayList in Descending order without using the sort method.
     */


    public static int[] sortDescending(int... arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[i];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

}
    /*

    Write a method that can sort the ArrayList in Descending order without using the sort method.
     */

