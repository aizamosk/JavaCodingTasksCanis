package yavuz.week_4;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicates {
    /*Write a return method that can remove the duplicated values from String
        Ex:  removeDup("AAABBBCCC")  ==> ABC*/
    public static void main(String[] args) {
       removeDuplicate();

    }


    public static void removeDuplicate(){
        String str = "jfhjfhjdhjfhjfh";
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (result.contains("" + str.charAt(i))) {//adding "" we are converting it to a string if the character is already contained in new string  then skip it
                continue;
            }
            result += str.charAt(i);
        }
        System.out.println(result);


    }








}