package Alexey.week_7;

import java.util.Arrays;
import java.util.Scanner;

public class Array_SortDescending {
    /*
    Write a return method that can sort an int array in descending order without using the sort method of the Arrays class
    Ex: int[] arr = {10,20,7, 8, 90};
    arr = Sort(arr); ==> {90, 20, 10, 8, 7};
     */

    public static int[] sortDescending (int[] ar1) {
        int currentMaximumNumber = ar1[0];
        int indexHolder = 0;
        int tempNumber = 0;
        for (int i = 0; i < ar1.length; i++) {
            currentMaximumNumber = ar1[i];
            for (int j = i; j < ar1.length; j++) {
                if (ar1[j] > currentMaximumNumber) {
                    currentMaximumNumber = ar1[j];
                    indexHolder = j;
                }
            }

            if (ar1[i] != currentMaximumNumber ) {
                tempNumber = ar1[i];
                ar1[i] = currentMaximumNumber;
                ar1[indexHolder] = tempNumber;
            }
        }
        return ar1;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter array size");
        int arraySize = input.nextInt();
        input.nextLine();

        int [] userArray = new int [arraySize];
        //int [] userArray = new int [] {67,4,45,7,12};
        for (int i = 0; i < arraySize; i++) {
            System.out.println("Please enter " + (i + 1) + " element of the array");
            userArray[i] = input.nextInt();
        }
        input.nextLine();
        System.out.println("Sorted array: " + Arrays.toString(sortDescending(userArray)));    // invoking method
    }

}
