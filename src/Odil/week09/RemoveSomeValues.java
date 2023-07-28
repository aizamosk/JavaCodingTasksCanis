package Odil.week09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveSomeValues {
    /*
    Given a list of Integers 1, 2, 3, 4, 5, 6, 101, 200, 300....etc. remove all values greater than 100.
     */
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1,2,3,4,5,6,101,200,300));

        // Removing all values greater than 100
        List<Integer> result = removeGreaterThan100(numbers);

        // Printing the modified list

        System.out.println(result);

    }

    public static List<Integer> removeGreaterThan100(List<Integer> numbers) {
        List<Integer> result = new ArrayList<>();
        for (int num : numbers) {
            if (num <= 100) {
                result.add(num);
            }
        }
        return result;
    }

}
