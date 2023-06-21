package maggie;

import java.util.ArrayList;

public class RemoveDuplicates {


    public static String removeDuplicates(String str) {

        String result = ""; // place holder for return statement
        for (int i = 0; i < str.length(); i++) { //loops through entire string to access each element
            if( result.contains( ""+str.charAt(i) )){ // if the character is already contained in new string
                continue; // skip it
            }
            result += str.charAt(i); // otherwise add it to the string
        }

        return result;
    }
}
/*
Write a return method that can remove the duplicated values from the String
  Ex: removeDup("AAABBBCCC") ==> ABC
 */