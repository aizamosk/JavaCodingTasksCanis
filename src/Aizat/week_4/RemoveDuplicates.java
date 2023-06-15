package Aizat.week_4;

import java.util.Scanner;

public class RemoveDuplicates {
    /*Write a return method that can remove the duplicated values from String
        Ex:  removeDup("AAABBBCCC")  ==> ABC*/
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Enter the text:");
        String str = input.nextLine();


        String result = "";

        for (int i = 0; i < str.length(); i++) {

            char each = str.charAt(i);

            if( ! result.contains( ""+ each)  ){
                result += each;
            }

        }


        System.out.println(result);



    }



    }

