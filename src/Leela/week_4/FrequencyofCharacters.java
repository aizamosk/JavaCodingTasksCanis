package Leela.week_4;

import java.util.Scanner;

public class FrequencyofCharacters {

    /*Write a return method that can find the frequency of characters
    Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2*/


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String str = input.next();
        char ch = input.next().charAt(0);

        int frequency = 0;

        for (int i = 0; i <str.length(); i++) {
            char eachChar = str.charAt(i);
            if(eachChar == ch){
                frequency++;
            }
        }
        System.out.println(frequency);

        input.close();
    }

}



