package Mehrubon.week_7;

import java.util.Arrays;

public class Array_SortAscending {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(ascendingArr(new int[]{8,9,7,0,9,8})));
    }

    /*Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays

    class
    Ex: int[] arr = {10, 9, 8, 7};
    arr = Sort(arr); ==>{ 7, 8, 9, 10};

     */

    public static int[] ascendingArr(int[] array){

        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array.length - 1; j++){
                if(array[j] > array[j + 1]){
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        return array;
        }
    }

