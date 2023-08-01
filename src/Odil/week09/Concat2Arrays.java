package Odil.week09;

import java.util.Arrays;

public class Concat2Arrays {

    public static int[] concatenateArrays(int[] array1, int[] array2) {
        /*
Write a return method that can concatenate two arrays
 */
        int length1 = array1.length;
        int length2 = array2.length;
        int[] result = new int[length1 + length2];

        // Copy elements from the first array
        for (int i = 0; i < length1; i++) {
            result[i] = array1[i];
        }

        // Copy elements from the second array
        for (int i = 0; i < length2; i++) {
            result[length1 + i] = array2[i];
        }

        return result;
    }

    // Example usage
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};
        int[] concatenatedArray = concatenateArrays(array1, array2);

        System.out.println(Arrays.toString(concatenatedArray));

        // Printing the concatenated array
//        for (int num : concatenatedArray) {
//            System.out.print(num + " ");
//        }
    }

}
