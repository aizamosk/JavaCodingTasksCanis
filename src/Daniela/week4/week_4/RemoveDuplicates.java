package Daniela.week4.week_4;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
    /*Write a return method that can remove the duplicated values from String
        Ex:  removeDup("AAABBBCCC")  ==> ABC*/
    public static void main(String[] args) {
        /*
        String str = "AAABBBCCC";
        String result ="";
        for (int i = 0; i < str.length(); i++) {
            if(!result.contains("" +str.charAt(i))){
                result += "" + str.charAt(i);
            }
            System.out.println(result);
        }
        */
        System.out.println(removeDublic("AAABBBCCC"));
    }


        public static String removeDublic(String str){
        StringBuilder sb = new StringBuilder();
        Set<Character> seen= new HashSet<>();
        for(char c: str.toCharArray()){
        if(!seen.contains(c)){
        sb.append(c);
        seen.add(c);
        }
        }
        return sb.toString();

        }


    }
