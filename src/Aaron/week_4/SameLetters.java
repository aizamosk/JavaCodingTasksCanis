package Aaron.week_4;

import java.util.Arrays;
import java.util.TreeSet;

// import static Aaron.week_4.RemoveDuplicates.removeDup;

public class SameLetters {
}
    /*Write a return method that check if a string is build out of the same letters as another string.
    Ex:  same("abc",  "cab"); -> true
    same("abc",  "abb"); -> false:
    public static boolean same(String a, String b) {
        char[] ch1 = a.toCharArray();
        char[] ch2 = b.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        String a1="", a2="";
        for(char each: ch1)
            a1 +=each;
        for(char each: ch2)
            a2 +=each;
        String a1removed= removeDup(a1);
        String a2removed= removeDup(a2);
        return  a1removed.equals(a2removed) ;

       // return Arrays.equals(ch1, ch2);
    }
    public static boolean Same2(String str1, String str2) {
        str1 = new TreeSet<String>(Arrays.asList( str1.split("") ) ).toString( );
        str2 = new TreeSet<String>(Arrays.asList( str2.split("") ) ).toString( );
        return  str1.equals(str2);
    }

    public static void main(String[] args) {
        System.out.println(same("abc", "caabb"));
        System.out.println(Same2("abc", "caabb"));
    }
}
*/