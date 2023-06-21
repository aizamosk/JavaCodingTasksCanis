package Alexey.week_4;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SameLetters {

    /*Write a return method that check if a string is build out of the same letters as another string.
    Ex:  same("abc",  "cab"); -> true
    same("abc",  "abb"); -> false:*/

    public static boolean stringVerification (String str1, String str2) {

        str1 = str1.replace(" ", "").trim().toLowerCase();
        str2 = str2.replace(" ", "").trim().toLowerCase();

        char [] charArray1 = str1.toCharArray();
        char [] charArray2 = str2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        str1 = new String(charArray1);
        str2 = new String(charArray2);
        System.out.println("Below is sorted strings before comparison");
        System.out.println(str1 + "\n" + str2);
        return str1.equals(str2);

    }


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter first string to compare");
        String userInput1 = input.nextLine();
        System.out.println("Please enter second string to compare");
        String userInput2 = input.nextLine();
        System.out.println("" + stringVerification(userInput1, userInput2 ));    //  printing results by invoking method

    }
}