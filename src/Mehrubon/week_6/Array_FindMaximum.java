package Mehrubon.week_6;

import java.util.Arrays;

public class Array_FindMaximum {
    /*
    Write a method that can find the maximum number from an int Array
    Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 99
     */
    public static void main(String[] args) {
        System.out.println(maxNum(new int[]{1,4,56,7,8,9}));
        System.out.println(maxNum2(new int[]{2,5,7,8,9,13,4,5,6,7}));
    }
    public static int maxNum(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int each : array) {
            if (each > max)
                max = each;
        }
            return max;
        }

        public static int maxNum2(int[] array){
        Arrays.sort(array);
        int max = array[array.length-1];
        return max;
        }
    }

