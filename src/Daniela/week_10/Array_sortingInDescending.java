package Daniela.week_10;

import java.util.Arrays;

public class Array_sortingInDescending {
    /*

    Write a method that can sort the ArrayList in Descending order without using the sort method.
     */
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortingInDescending(5, 6, 9, 1, 2, 3, 10)));
    }

    public static int[] sortingInDescending(int... arr) {

        for (int i = 0; i < arr.length; i++) {//
            for (int j = 0; j < arr.length - 1; j++) {// sorting to compare each number
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];// creating temp variable for swapping
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;


                }
            }

        }
        return arr;
    }

}
