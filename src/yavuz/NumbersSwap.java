package yavuz;

import java.util.Scanner;

/**
 *  Numbers -- Swap Numbers
 * Swap two variable values without using a third variable
 */
public class NumbersSwap {
    public static void main(String[] args) {

       int x=10;
       int y=20;
        System.out.println("x is "+x);
        System.out.println("y is "+y);
        //swapping operation
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("x is "+x);
        System.out.println("y is "+y);

    }
}
