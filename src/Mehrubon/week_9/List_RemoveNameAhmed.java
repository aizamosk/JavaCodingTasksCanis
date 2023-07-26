package Mehrubon.week_9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class List_RemoveNameAhmed {
    public static void main(String[] args) {


    /*
    Given a list of people names: "Ahmed", "John", Eric", "Ahmed", "Aaron".....
    Write a java operation to remove all the names named Ahmed
     */


        ArrayList<String> names = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed", "Aaron"));
        names.removeAll(List.of("Ahmed"));

        System.out.println(names);
    }
    }

