package Daniela.week_9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class List_RemoveNameAhmed {
    /*
    Given a list of people names: "Ahmed", "John", Eric", "Ahmed", "Aaron".....
    Write a java operation to remove all the names named Ahmed
     */

    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed", "Aaron"));
        System.out.println(RemoveAhmedName(names));
    }


    public static List<String > RemoveAhmedName(List<String> names){
        Iterator<String> iterator = names.iterator();
                // Iterator from list type

        while(iterator.hasNext()) {// read all the " next " element
            if (iterator.next().equals("Ahmed")) {
                //iterator moving through the elements and return the value of the element and we can use remove
                iterator.remove();
            }
        }
            return names;
    }
}
