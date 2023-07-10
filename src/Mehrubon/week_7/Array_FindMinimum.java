package Mehrubon.week_7;

import java.util.Arrays;

public class Array_FindMinimum {
    public static void main(String[] args) {
        System.out.println(returnMin(new int[]{3,4,5,7,6,1,3,0,6}));
        System.out.println(returnMin1(new int[]{45,6,7,8,9,90,54}));
    }
    /*
    Write a method that can find the minimum number from an int Array
    Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 6
     */
    public static int returnMin(int[] array){
        Arrays.sort(array);
        int minimum = array[0];
        return minimum;
    }



    public static int returnMin1(int[] array) {
    int min = Integer.MAX_VALUE;
        for (int each : array) {
            if(each<min){
                min = each;
            }
        }
        return min;
    }

}
