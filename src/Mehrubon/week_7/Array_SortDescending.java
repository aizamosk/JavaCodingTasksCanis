package Mehrubon.week_7;

import java.util.Arrays;

public class Array_SortDescending {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(descendingArr(new int[]{10,20,7, 8, 90})));

}
    /*
    Write a return method that can sort an int array in descending order without using the sort method of the Arrays class
    Ex: int[] arr = {10,20,7, 8, 90};
    arr = Sort(arr); ==> {90, 20, 10, 8, 7};
     */
    public static int[] descendingArr(int[] array){

        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array.length - 1; j++){
                if(array[j] < array[j + 1]){
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
}}
