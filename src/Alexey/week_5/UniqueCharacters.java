package Alexey.week_5;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class UniqueCharacters {
    /*
    Write a return  method that can find the unique characters from the String
    Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";
     */

    public static void characterCounter (String str) {

        LinkedHashSet<String> duplicateRemoval = new LinkedHashSet<>(); // Creating LinkedHashSet to store String elements and remove duplicate as we add elements

        for (int i = 0; i < str.length(); i++) {     // loop to add letters from the string as elements to our Set

            duplicateRemoval.add(str.substring(i, i + 1));

        }
        String endResult = "";
        for (String setElement : duplicateRemoval) { // loop to compare each unique letter with each letter in the string and count duplicates
            int counter = 0; // counter for duplicates that resets with each new element
            for (int i = 0; i < str.length(); i++) { // for loop to compare Set String element with letters from the original string
                if (setElement.equals(str.substring(i, i + 1))) {
                    counter += 1;
                }
            }
            if (counter == 1) { //Checking if element is unique and then adding unique to the final String
                endResult += setElement;
            }
        }
        System.out.print(endResult); // printing final String with all unique elements from original String
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter string to find unique elements");
        String userInput = input.nextLine();
        input.close();
        characterCounter(userInput);    // invoking method

    }
}
