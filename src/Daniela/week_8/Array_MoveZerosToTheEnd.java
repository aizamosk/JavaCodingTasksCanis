package Daniela.week_8;

import java.util.Arrays;

public class Array_MoveZerosToTheEnd {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(arrayMoveZeros(1,0,2,0,3,0,4,0)));

    }
    public static int[] arrayMoveZeros(int... num){

        int[] newArray = new int [num.length];//making new array moving all the numbers that are not equal 0 , to the beginning
        int index = 0;
        for (int each :num) { // checking each num if it not equals zero
            if(each!=0){
                newArray[index++]= each;

            }

        }

        return newArray;
    }
    /*
    Write a method that can move all the zeros to last indexes of the array (Do Not Use Sort Method)
    input:  {1,0,2,0,3,0,4,0};
    output: [1, 2, 3, 4, 0, 0, 0, 0]
     */
}
