package Alexey.week_7;

import java.util.Arrays;
import java.util.Scanner;

public class Array_SortAscending {

    /*Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays

    class
    Ex: int[] arr = {10, 9, 8, 7};
    arr = Sort(arr); ==>{ 7, 8, 9, 10};

     */

    public static int[] sortAscending (int[] ar1) {
        int curremtMinimumNumber = ar1[0];
        int indexHolder = 0;
        int tempNumber = 0;
        for (int i = 0; i < ar1.length; i++) {
            curremtMinimumNumber = ar1[i];
            for (int j = i; j < ar1.length; j++) {
                if (ar1[j] < curremtMinimumNumber) {
                    curremtMinimumNumber = ar1[j];
                    indexHolder = j;
                }
            }

            if (ar1[i] != curremtMinimumNumber ) {
                tempNumber = ar1[i];
                ar1[i] = curremtMinimumNumber;
                ar1[indexHolder] = tempNumber;
            }
        }
        return ar1;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter array size");
        int arraySize = input.nextInt();

        int [] userArray = new int [arraySize];
        for (int i = 0; i < arraySize; i++) {
            System.out.println("Please enter " + (i + 1) + " element of the array");
            userArray[i] = input.nextInt();
        }

        System.out.println("Sorted array: " + Arrays.toString(sortAscending(userArray)));    // invoking method
    }
}
