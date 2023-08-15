package Leela.week_9;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Concatenate2Arrays {

    public static void merge2Arrays(){
        merge2Arrays();
    }

    public static void main(String[] args) {

        int [] arr1 = {1, 2, 3, 4};  //length = 4
        int [] arr2 = {5, 6, 7};  //length = 3

        int[] arr3 = new int[arr1.length + arr2.length];  //4 + 3 = 7

        for (int i = 0; i < arr1.length; i++) {

            arr3[i] = arr1[i];  //{1, 2, 3, 4} first array assigned.
        }

        for (int i = 0; i < arr2.length; i++) {

            arr3[i + arr1.length] = arr2[i]; // {1, 2, 3, 4} + arr2{5, 6, 7} = {1, 2, 3, 4, 5, 6, 7}
        }

        System.out.println(Arrays.toString(arr3));


    }
   /*
    Write a return method that can concatenate two arrays
    */

}
