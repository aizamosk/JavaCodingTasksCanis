package Aizat.week_8;

import java.util.Arrays;

public class Array_MoveZerosToTheEnd {
    /*
    Write a method that can move all the zeros to last indexes of the array (Do Not Use Sort Method)
    input:  {1,0,2,0,3,0,4,0};
    output: [1, 2, 3, 4, 0, 0, 0, 0]
     */
    public static void main(String[] args) {

        int[] ex = {4,0,2,8,3,9,0,0};


        zeroToEnd(ex);


    }
    public static void zeroToEnd(int[] ex){

        int[] result = new int[ex.length];
        int count = 0;
        for (int i = 0; i < ex.length; i++) {

            if (ex[i] != 0){
                result[count++]=ex[i];
            }

        }
        System.out.println(Arrays.toString(result));

    }
}
