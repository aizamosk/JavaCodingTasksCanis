package Aizat.week_4;

import java.util.Arrays;
import java.util.Scanner;

public class SameLetters {
    /*Write a return method that check if a string is build out of the same letters as another string.
    Ex:  same("abc",  "cab"); -> true
    same("abc",  "abb"); -> false:*/
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the anagram word");
        String str = input.nextLine();

        System.out.println("Enter the anagram word");
        String str1 = input.nextLine();


        char c1[] = str.toCharArray();
        char c2[] = str1.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);
        for (int i = 0; i < c1.length; i++) {
            if (c1[i] != c2[i]) {
                System.out.println("Given words are not anagram");
                System.exit(0);
            } else {
                System.out.println("Is anagram word");
            }
        }
    }
}







