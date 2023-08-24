package Aizat.week_11;


import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

//Write a method that prints the frequency of each character from a String
public class MapFrequencyChars {
    public static void main(String[] args) {
        String frequency="aabbccdddddd";
        frequencyOfChars(frequency);
    }

   public static void frequencyOfChars(String str){
    Map<Character, Integer> map = new LinkedHashMap<>();
       for (Character each :str.toCharArray()){
           if(map.containsKey(each)){
               map.put(each,map.get(each)+1);
           }else{
               map.put(each,1);
           }
       }
       System.out.println(map);
   }
}




