package Odil.week09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveAhmed {

    public static void main(String[] args) {
        /*
    Given a list of people names: "Ahmed", "John", Eric", "Ahmed", "Aaron".....
Write a java operation to remove all the names named Ahmed
     */

        List<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Ahmed", "John", "Eric", "Ahmed", "Aaron"));

        // Removing all occurrences of "Ahmed"
        removeName(names, "Ahmed");

        // Printing the modified list
        for (String name : names) {
            System.out.print(name + " ");
        }
    }

    public static void removeName(List<String> names, String nameToRemove) {
        names.removeAll(List.of(nameToRemove));
    }

}
