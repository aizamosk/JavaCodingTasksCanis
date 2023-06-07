package Alexey.week3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ReverseNegativeNumber {
    /*
    Write a return method that can reverse digits of a negative number and return it as int
input: -35  output: -53
     */

    public static String numberReverseFunction() {

        //Scanner part to get number from the user
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter number you want to revere");
        int num = in.nextInt();
        in.nextLine(); // removing enter from scanner buffer

        //checking if number is negative and if not exiting this method
        if (num > 0) {
            System.out.println("Please enter negative number");
            return "";
        }

        //casting number to String
        String castNumber = String.valueOf(num);
        String targetString = "-";

        //Reverse logic for String
        for (int length = castNumber.length(); length > 1; length--) {
            targetString += castNumber.substring(length -1, length);
        }
        return targetString;
    }

    public static void main(String[] args) {
        try {                                                    //trying to catch issue with entry inside scanner
            System.out.println("" + numberReverseFunction());    //  printing results by invoking method
        } catch (InputMismatchException e) {
            System.out.println("Please use only numbers for a range");
        }
    }
}


