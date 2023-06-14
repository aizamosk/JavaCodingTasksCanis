package Mehrubon.week4;

import java.util.Arrays;

public class SameLetters {
    public static void main(String[] args) {
        System.out.println(sameLetter("abc", "cab"));
    }
        /*Write a return method that check if a string is build out of the same letters as another string.
    Ex:  same("abc",  "cab"); -> true
    same("abc",  "abb"); -> false:*/
    public static boolean sameLetter(String str1, String str2){
        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();
        Arrays.sort(chars1);
        Arrays.sort(chars2);
        String a1="", a2="";
        for(char each: chars1)
            a1 +=each;
        for(char each: chars2)
            a2 +=each;
        return  a1.equals(a2) ;
    }
}
