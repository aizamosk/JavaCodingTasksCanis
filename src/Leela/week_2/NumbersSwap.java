package Leela.week_2;

import java.util.ArrayList;

/**
 *  Numbers -- Swap Numbers
 * Swap two variable values without using a third variable
 */
public class NumbersSwap {

    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 20;


        System.out.println(num1);
        System.out.println(num2);

        System.out.println("Before swapping : num1 = " + num1 + " and num2 = " + num2);


        num1 = num1 + num2;  //10 + 20 = 30
        num2 = num1 - num2;  // 30 - 20 = 10

        num1 = num1 - num2;  //30 - 10 = 20

        System.out.println(num1);
        System.out.println(num2);

        System.out.println("After swapping : num1 = " + num1 + " and num2 = " + num2);













    }


}
