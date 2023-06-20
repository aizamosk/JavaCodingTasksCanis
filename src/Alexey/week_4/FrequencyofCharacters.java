package Alexey.week_4;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class FrequencyofCharacters {
    /*Write a return method that can find the frequency of characters
    Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2*/

    public static void characterCounter (String str){

        LinkedHashSet<String> duplicateRemoval = new LinkedHashSet<>(); // Creating LinkedHashSet to store String elements and remove duplicate as we add elements

        for(int i = 0; i < str.length(); i++) {     // loop to add letters from the string as elements to our Set
            duplicateRemoval.add(str.substring(i, i+1));
        }

        for  (String setElement : duplicateRemoval) { // loop to compare each unique letter with each letter in the string and count duplicates
            int counter = 0; // counter for duplicates that resets with each new element
            for (int i = 0; i < str.length(); i++){ // for loop to compare Set String element with letters from the original string
                if (setElement.equals(str.substring(i, i+1))) {
                    counter += 1;
                }
            }
            System.out.print(setElement + counter); // printing result it requested format
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter string to remove duplicates");
        String userInput = input.nextLine();
        characterCounter(userInput);    // invoking method

    }

}

