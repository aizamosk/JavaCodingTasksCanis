package Daniela.week_10;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Map_sortByValues {

    public static void main(String[] args) {
        Map<String,Integer> map = Map.of("b", 2,"a", 3, "c", 9,"p",6, "l", 5
        );
        System.out.println("Initial map " + map);
        System.out.println("Sorted map" + sortMapByValues(map));

    }
    /*

    Write a method that can sort the Map by values.
     */
    public static Map<String, Integer> sortMapByValues(Map<String,Integer> map){
        List<Map.Entry<String,Integer>> entries = new ArrayList<>(map.entrySet());
        for (int i = 0; i < entries.size(); i++) {
            for (int j = 0; j < entries.size()-1; j++) {
                if(entries.get(j).getValue()> entries.get(j+1).getValue()){
                    Map.Entry<String,Integer>temp = entries.get(j);
                    entries.set(j,entries.get(j+1));
                    entries.set(j+1,temp);
                }

            }

        }
        Map<String,Integer> sorted = new LinkedHashMap<>();
        for (Map.Entry<String,Integer> each:entries) {
            sorted.put(each.getKey(), each.getValue());

        }

        return sorted;
    }




}
