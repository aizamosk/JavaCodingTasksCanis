package Odil.week10;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListSortAscending {
    /*
Write a method that can sort the ArrayList in Ascending order without using the sort method.
     */

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(5,2,9,1,5));

        System.out.println("Before sorting: " + list);
        arrayListSortASC(list);
        System.out.println("After sorting: " + list);
    }

    public static void arrayListSortASC(ArrayList<Integer> list) {
        int n = list.size();

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (list.get(j) > list.get(j + 1)) {
                    // Swap elements at j and j+1
                    int temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
    }

}
