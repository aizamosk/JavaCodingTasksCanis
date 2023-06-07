package Alexey.week3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PrimeNumber {
    /*
    Write a method that can check if a number is prime or not.
     */
    public static String primeSearch () {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the range starting from 2 to n to find all prime numbers");
        double counter = in.nextDouble();
        in.nextLine(); // removing enter from scanner buffer
        String primeNumbersList = "";
        boolean primeStatus = true;
        if (counter < 2) {
            System.out.println("Please enter number more than 1");
        } else {
            for (double i = 2; i < counter; i++) {  //
                for (double j = 2; j < i; j++) {
                    if (i % j == 0) {
                        primeStatus = false;
                    }
                }
                if (primeStatus != false) {
                    primeNumbersList += (i + ", ");
                }
                primeStatus = true;
            }
        }

        return primeNumbersList;
    }

    public static void main(String[] args) {
        try {               //trying to catch issue with entry inside scanner
            System.out.println("Following are prime numbers inside given range \n" + primeSearch());    //  printing results by invoking method
        } catch (InputMismatchException e) {
            System.out.println("Please use only numbers for a range");
        }
    }
}
