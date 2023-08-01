package Daniela.week_6;

public class Array_FindMaximum {
    /*
    Write a method that can find the maximum number from an int Array
    Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 99

     */
    public static void main(String[] args) {
        System.out.println(maxArrayNum(new int[]{99, 12, 23, 32, 44, 57, 6}));

    }

    static int maxArrayNum(int[] num) {
        int max = num[0];
        for (int i = 1; i < num.length; i++) { // i: 1, 2, 3, 4...

            if (num[i] > max) { // compares the element of the array with current maximum number
                max = num[i]; // replace the current maximum number
            }

        }

        return max;
    }
}