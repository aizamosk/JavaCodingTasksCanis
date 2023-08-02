package Mehrubon.week_10;

import java.util.ArrayList;
import java.util.Arrays;

public class Array_sortingInAscending {
    /*

    Write a method that can sort the ArrayList in Ascending order without using the sort method.
     */

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(3,12,4,5,65,78,98,2));
        sortingArrListAsc(arrayList);

        ArrayList<String> words = new ArrayList<>(Arrays.asList("Apple", "Pineapple", "Banana", "Peach"));
        sortingArrListAscString(words);

    }

    public static void sortingArrListAsc(ArrayList<Integer> nums){
        for (int i = 0; i < nums.size(); i++) {
            for (int j = 0; j < nums.size(); j++){
                if (nums.get(i)<nums.get(j)){
                    Integer temp = nums.get(i);
                    nums.set(i, nums.get(j));
                    nums.set(j, temp);
                }
            }

        }
        System.out.println(nums);
    }


    public static void sortingArrListAscString(ArrayList<String> words){
        for (int i = 0; i < words.size(); i++) {
            for (int j = 0; j < words.size(); j++){
                if (words.get(i).charAt(0)<words.get(j).charAt(0)){
                    String temp = words.get(i);
                    words.set(i, words.get(j));
                    words.set(j, temp);
                }
            }

        }
        System.out.println(words);
    }
}
