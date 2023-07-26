package Mehrubon.week_8;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Array_MoveZerosToTheEnd {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(Array_MoveZeros(new int[]{1,2,54,6,0,8,0,8,6,5,0,5})));
    }
    /*
    Write a method that can move all the zeros to last indexes of the array (Do Not Use Sort Method)
    input:  {1,0,2,0,3,0,4,0};
    output: [1, 2, 3, 4, 0, 0, 0, 0]
     */


    public static int[] Array_MoveZeros(int[] array){
        int[] arrays = new int[array.length];
        int index = 0;

        for (int each : array) {
            if(each != 0){
                arrays[index++] = each;
            }
        }
        return arrays;
    }
}
