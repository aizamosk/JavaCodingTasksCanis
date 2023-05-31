package Alexey.week2;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Numbers -- Divisible by 3, 5, 15
 * Write a program that can print the numbers between 1 ~ 100 that can be divisible by 3, 5, and 15.
 * if the number can be divisible by 3, 5 and 15, then it should only be displayed in DivisibelBy15 section
 * if the number can be divisible by 3 but cannot be divisible by 15, then it should only be displayed in DivisibelBy3 section
 * if the number can be divisible by 5 but cannot be divisible by 15, then it should only be displayed in DivisibelBy5 section
 * ex:
 * OutPut:
 * Divisible By 15 15 30 45 60 75 90
 * Divisible By 5 5 10 20 25 35 40 50 55 65 70 80 85 95 100
 * Divisible By 3 3 6 9 12 18 21 24 27 33 36 39 42 48 51 54 57 63 66 69 72 78 81 84 87 93 96 99
 */
public class NumbersDivisibleBy_3_5_15 {

    public static String Division() {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the range starting from 1 to n");
        int counter = in.nextInt();
        in.nextLine(); // removing enter from scanner buffer

        String Divisible15 = "Divisible By 15: "; // creating 3 strings to store results
        String Divisible5 = "Divisible By 5: ";
        String Divisible3 = "Divisible By 3: ";

        for (int i = 1; i <= counter; i++) {    // running loop for the range of numbers

            if (i % 3 == 0 && i % 5 == 0 && i % 15 == 0) {  // first string condition all true
                Divisible15 += "" + i + " ";
            } else if (i % 3 != 0 && i % 5 == 0 && i % 15 != 0) {  // second string only for 5 condition
                Divisible5 += "" + i + " ";
            } else if (i % 3 == 0 && i % 5 != 0 && i % 15 != 0) {   // third string only for 3
                Divisible3 += ("" + i + " ");
            }
        }

        return Divisible15 = Divisible15.trim() + "\n" + Divisible5.trim() + "\n" + Divisible3.trim();  // Creating String for output by concatenating all three string together
    }

    public static void main(String[] args) {
        try {               //trying to catch issue with entry inside scanner
            System.out.println("" + Division());    //  printing results by invoking method
        } catch (InputMismatchException e) {
            System.out.println("Please use only numbers for a range");
        }
    }
}
