package Daniela.week_9;

import java.util.ArrayList;
import java.util.Arrays;

public class List_RemoveSomeValues {
    /*
    Given a list of Integers 1, 2, 3, 4, 5, 6, 101, 200, 300....etc. remove all values greater than 100.


     */
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 101, 200, 300, 500,20,10));
        ArrayList<Integer> newList = new ArrayList<>();

        for (Integer num : list) {
            if (num<100){
                newList.add(num); // for each number smaller than 100 from my list  add to a newList
            }
        }
        list=newList;
        System.out.println(list);
    }
}
