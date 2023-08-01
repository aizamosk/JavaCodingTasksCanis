package Aaron.week_10;

import java.util.ArrayList;
import java.util.Arrays;

//Write a method that can sort the ArrayList in descending order without using the sort method
public class arrayListSortDesc {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>(Arrays.asList("Cydeo", "B25", "Java", "Selenium", "Sad"));
        SortingArrayListDesc(list);

    }
    public static void SortingArrayListDesc(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (list.get(i).charAt(0) > list.get(j).charAt(0)) {
                    String temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
        System.out.println(list);
    }
}
