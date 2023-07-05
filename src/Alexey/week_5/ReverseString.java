package Alexey.week_5;

import java.util.Scanner;

public class ReverseString {
    /*
    Write a return method that can reverse  String
    Ex: Reverse("ABCD"); ==> DCBA
     */

    public static void reverseString(String str) {

        int i = str.length();
        int j = 0;
        char [] left = str.toCharArray();
        char [] right = str.toCharArray();
        for ( i = str.length(); i != j ; i--) {
            left[j] = right [i];
            left[i] = right [j];
            j++;
        }
        System.out.println(left);
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter string to be reversed");
        String userInput = input.nextLine();
        reverseString(userInput);    // invoking method
    }

}
