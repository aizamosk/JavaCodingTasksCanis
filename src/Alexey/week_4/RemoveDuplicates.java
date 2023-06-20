package Alexey.week_4;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class RemoveDuplicates {
    /*Write a return method that can remove the duplicated values from String
        Ex:  removeDup("AAABBBCCC")  ==> ABC*/
    public static String duplicateRemoval (String str1) {

        LinkedHashSet <String> duplicateRemoval = new LinkedHashSet<>();  // Creating LinkedHashSet to store String elements and remove duplicate as we add elements
        String endResult = ""; // String to store our end results
        for(int i = 0; i < str1.length(); i++) {     // loop to add letters from the string as elements to our Set
            duplicateRemoval.add(str1.substring(i, i+1));
        }

        for  (String setElement : duplicateRemoval) { // loop to extract each element as the letter of the Set to the final string
            endResult += setElement;
        }

        return  endResult;
    }


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter string to remove duplicates");
        String userInput = input.nextLine();
        System.out.println(duplicateRemoval(userInput));;    //  printing results by invoking method

    }
}