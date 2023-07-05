package Alexey.week_7;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Array_FindMinimum {
    /*
    Write a method that can find the minimum number from an int Array
    Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 6
     */

    public static int minimumArray (int[] ar1) {

        int minimumNumber = ar1[0];
        for (int i = 1; i < ar1.length; i++) {
            if (ar1[i] < minimumNumber ) {
                minimumNumber = ar1[i];
            }
        }

        return minimumNumber;

    }

    public static void main(String[] args) {

        int arraySize = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter array size");
        arraySize = input.nextInt();

        int [] userArray = new int [arraySize];
        for (int i = 0; i < arraySize; i++) {
            System.out.println("Please enter " + (i + 1) + " element of the array");
            userArray[i] = input.nextInt();
        }

        System.out.println("Minimum number in given array is: " + minimumArray(userArray));    // invoking method
    }
}