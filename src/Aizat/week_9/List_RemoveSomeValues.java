package Aizat.week_9;

import java.util.ArrayList;
import java.util.Arrays;

public class List_RemoveSomeValues {
    /*
    Given a list of Integers 1, 2, 3, 4, 5, 6, 101, 200, 300....etc. remove all values greater than 100.
     */
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 101, 200, 300, 500,20,10));
        ArrayList<Integer> numbersResult = new ArrayList<>();

        for (Integer num : numbers) {
            if (num<100){
                numbersResult.add(num);
            }
        }
        numbers=numbersResult;
        System.out.println(numbers);
    }
}

