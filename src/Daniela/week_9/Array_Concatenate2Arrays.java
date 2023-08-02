package Daniela.week_9;

import java.util.Arrays;

public class Array_Concatenate2Arrays {
    /*
     Write a return method that can concatenate two arrays
     */
    public static void main(String[] args) {
        int [] arr1 = {3, 6, 7};
        int [] arr2 = {3, 6, 7, 9, 5, 7};
        System.out.println(Arrays.toString(concat2Arrays(arr1, arr2)));

    }


    public static int[] concat2Arrays(int[] arr1, int[] arr2) {

        int[] newArray = new int[arr1.length + arr2.length];

        // i - add to the new array and read from the arr1
        //h-  variable to read the elements from arr2

        for (int i = 0, h = 0; i < newArray.length; i++) {
            if (i < arr1.length) {
                newArray[i] = arr1[i];// taking the value of arr1 and adding to the new newArray and will happen
                // as long as "i" is less than the length of the arr1
            } else {
                newArray[i] = arr2[h++];// read the value and put in newArray and continue to next value

            }
        }
            return newArray;
        }

    }

