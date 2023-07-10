package Leela.week_5;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class UniqueCharacters {

    public static void main(String[] args) {
        uniqueCharacter();
    }

        public static void uniqueCharacter() {


            String str = "AAABBBCCCDEF";

            Map<Character, Integer> map = new LinkedHashMap<>();

            for (String each : str.split("")) {
                int frequency = Collections.frequency(Arrays.asList(str.split("")), each);

                if (frequency == 1)

                    map.put(each.charAt(0), frequency);
            }
            System.out.println(map);
        }
    /*
    Write a return  method that can find the unique characters from the String
    Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";
     */
    }
