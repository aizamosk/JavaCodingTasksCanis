package Aaron.Week_11;

import java.util.HashMap;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

//Write a method that can return the minimum value from a map (DO NOT use sort method)
public class mapMinValue {
    public static void main(String[] args) {
        Map<String, Integer> test= new HashMap<>();
        test.put("Aaron", 11);
        test.put("Baron", 5);
        test.put("Cydeo", 27);
        test.put("Canada", 100);
        System.out.println(minValue(test));
    }


    public  static  int  minValue( Map<String,Integer> map  ) {
        SortedSet<Integer> sm = new TreeSet<>(map.values());
        return sm.first( );
    }
}
