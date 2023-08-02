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
        boolean sortChecker = false;
        for (int i = 0; i < ar1.length; i++) {
            for (int j = i; j < ar1.length; j++) { // second loop finds minimum number and move it to the front
                if (ar1[j] < ar1[i]) {
                    int tempNumber = 0;
                    tempNumber = ar1[i];
                    ar1[i] = ar1[j];
                    ar1[j] = tempNumber;
                    sortChecker = true;           // number movement detected, array ahs to be sorted all the way
                }
            }
            if (sortChecker == false) {break;} //array is already sorted, no numbers movement was detected at the first run
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
        //int [] userArray = {1,2,3,5,2,7,1,-5,10,65,4,0,1,2,3};
        System.out.println("Sorted array: " + Arrays.toString(sortAscending(userArray)));    // invoking method
    }
}

