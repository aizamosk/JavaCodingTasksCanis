package Mehrubon.week_9;

import java.util.ArrayList;
import java.util.Arrays;

public class List_RemoveSomeValues {
    /*
    Given a list of Integers 1, 2, 3, 4, 5, 6, 101, 200, 300....etc. remove all values greater than 100.
     */
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 101, 200, 300, 500,20,10));
        ArrayList<Integer> numsResult = new ArrayList<>();

        for (Integer num : nums) {
            if (num<100){
                numsResult.add(num);
            }
        }
        nums=numsResult;
        System.out.println(nums);
    }
}
