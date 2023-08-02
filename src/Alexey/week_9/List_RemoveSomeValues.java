package Alexey.week_9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class List_RemoveSomeValues {
    /*
    Given a list of Integers 1, 2, 3, 4, 5, 6, 101, 200, 300....etc. remove all values greater than 100.
     */

        public static void filterList (List<Integer> sourceList) {
            // Iterate through the original list and filter out values greater than 100
            List<Integer> filteredList = new ArrayList<>();
            for (Integer num : sourceList) {
                if (num <= 100) {
                    filteredList.add(num);
                }
            }

            // Print the filtered list
            System.out.println(filteredList);
        }


        public static void main(String[] args) {
            // Given list of integers
            List<Integer> integerList = Arrays.asList(1, 5, 56, 67, 32, 78, 90, 435, 21);

            // Add more integers to the list if needed
            filterList(integerList);
        }
    }
