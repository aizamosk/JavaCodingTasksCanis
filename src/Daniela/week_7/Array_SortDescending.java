package Daniela.week_7;

import java.util.Arrays;

public class Array_SortDescending {
    /*
    Write a return method that can sort an int array in descending order without using the sort method of the Arrays class
    Ex: int[] arr = {10,20,7, 8, 90};
    arr = Sort(arr); ==> {90, 20, 10, 8, 7};
     */
    public static void main(String[] args) {

        System.out.println(Arrays.toString(ArrDes(10,20,7, 8, 90)));

    }

    public static int[] ArrDes(int... arr){
        for (int i = 0; i < arr.length; i++) {// iterating through array
            for( int j =0; j<arr.length-1;j++){// using nested loop to compare numbers to each other
                if (arr[j] < arr[j+1]) {// (j+1) is next number that is compared with previous number
                    int data= arr[j];// temporary variable
                    arr[j] = arr[j+1];//swap
                    arr[j+1]= data;
                }
            }

        }
        return arr;
    }
}
