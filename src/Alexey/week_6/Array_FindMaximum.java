package Alexey.week_6;

import java.util.Scanner;

public class Array_FindMaximum {
    /*
    Write a method that can find the maximum number from an int Array
    Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 99

     */

    public static int maximumArray (int[] ar1) {

        int maximumNumber = ar1[0];
        for (int i = 1; i < ar1.length; i++) {
            if (ar1[i] > maximumNumber ) {
                maximumNumber = ar1[i];
            }
        }

        return maximumNumber;
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

        System.out.println("Minimum number in given array is: " + maximumArray(userArray));    // invoking method
    }

}
