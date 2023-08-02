package Alexey.week_10;

import java.util.*;

public class Map_sortByValues {
    /*

    Write a method that can sort the Map by values.
     */
    // Method to sort a Map by values in ascending order
    public static <K, V extends Comparable<? super V>> Map<K, V> sortByValuesAscending(Map<K, V> map) {
        return map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(LinkedHashMap::new, (m, e) -> m.put(e.getKey(), e.getValue()), LinkedHashMap::putAll);
    }

    // Method to sort a Map by values in descending order
    public static <K, V extends Comparable<? super V>> Map<K, V> sortByValuesDescending(Map<K, V> map) {
        return map.entrySet()
                .stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .collect(LinkedHashMap::new, (m, e) -> m.put(e.getKey(), e.getValue()), LinkedHashMap::putAll);
    }

    public static void main(String[] args) {
        Map<String, Integer> unsortedMap = new HashMap<>();
        unsortedMap.put("Apple", 5);
        unsortedMap.put("Banana", 2);
        unsortedMap.put("Orange", 8);
        unsortedMap.put("Grapes", 3);

        System.out.println("Unsorted Map: " + unsortedMap);

        Map<String, Integer> sortedAscending = sortByValuesAscending(unsortedMap);
        System.out.println("Sorted Map (Ascending): " + sortedAscending);

        Map<String, Integer> sortedDescending = sortByValuesDescending(unsortedMap);
        System.out.println("Sorted Map (Descending): " + sortedDescending);
    }

}
