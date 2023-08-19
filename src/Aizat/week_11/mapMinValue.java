package Aizat.week_11;


import java.util.*;

//Write a method that can return the minimum value from a map (DO NOT use sort method)
public class mapMinValue {

    public static void main(String[] args) {
        Map<String,Integer> testing = new HashMap<>();
        testing.put("Romey",1);
        testing.put("Arsenii", 15);
        testing.put("Auggie", 2);

        System.out.println( "The youngest person is  " +minValue(testing)+" year old");
    }


    public static int minValue(Map<String,Integer> map){
        SortedSet<Integer> sortMap = new TreeSet<>(map.values());

        return sortMap.first();
    }

}
