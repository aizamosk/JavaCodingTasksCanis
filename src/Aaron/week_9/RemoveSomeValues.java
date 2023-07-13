package Aaron.week_9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveSomeValues {
    public static void main(String[] args) {
//Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.

        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 101, 200, 300));
        ArrayList<Integer> list2 = new ArrayList<>();
        for (int each : list1)
            if (each < 100)
                list2.add(each);
        list1 = list2;
        System.out.println(list1);

        System.out.println(remove2(new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 101, 200, 300))));
    }
        //solution2
        public static List<Integer> remove2(List<Integer> list){
            list.removeIf(number -> number > 100);
            return list;
        }

}
