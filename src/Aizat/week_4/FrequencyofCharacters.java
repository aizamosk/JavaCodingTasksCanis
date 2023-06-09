package Aizat.week_4;

import java.util.Scanner;

public class FrequencyofCharacters {
    /*Write a return method that can find the frequency of characters
    Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2*/

public static void FrequencyOfCharacterMethod(){

    String stValue= "AAABBCDD";
    char ch = stValue. charAt(0);

    int frequencyOfChar = 0;

    for (int i = 0; i < stValue.length(); i++) {
        char eachChar = stValue.charAt(i);

        if(eachChar ==ch){
            frequencyOfChar++;

        }

    }
}


    public static void main(String[] args) {
        FrequencyOfCharacterMethod();
    }

    }



