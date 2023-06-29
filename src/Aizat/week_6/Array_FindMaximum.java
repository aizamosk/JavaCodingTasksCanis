package Aizat.week_6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Array_FindMaximum {
    /*
       Write a method that can find the maximum number from an int Array
       Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 99

        */
    public static void main(String[] args) {
    maxNumber();
    }
public static void maxNumber(){
      int[] anArray = {99, 12, 23, 32, 44, 57, 6};
    int max = anArray[0];
    for(int i=0; i <anArray.length; i++){
        if(anArray[i]>max){
            max = anArray[i];
        }
    }
    System.out.println(max);
}

    }

