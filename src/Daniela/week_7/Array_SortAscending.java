package Daniela.week_7;

import java.util.Arrays;

public class Array_SortAscending {

    /*Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays

    class
    Ex: int[] arr = {10, 9, 8, 7};
    arr = Sort(arr); ==>{ 7, 8, 9, 10};

     */
    public static void main(String[] args) {
        System.out.println(Arrays.toString(ArrAscending(10, 9, 8, 7 )));
    }
    public static int[] ArrAscending(int... arr){
        for (int i = 0; i < arr.length; i++) {// iterating through array
         for( int j = 0; j<arr.length-1;j++){// using nested loop to compare numbers to each other
             if(arr[j]>arr[j+1]){// (j+1) is next number that is compared with previous number
                   int temp=arr[j];// temporary variable
                   arr[j] = arr[j+1];//swap
                   arr[j+1]=temp;
             }
         }
        }
        return arr;

    }
}
