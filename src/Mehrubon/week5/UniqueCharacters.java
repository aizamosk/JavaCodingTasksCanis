package Mehrubon.week5;

public class UniqueCharacters {
    public static void main(String[] args) {
        System.out.println(uniqueChars("fjkjhgfdhhjhjgjgj"));
    }
       /*
    Write a return  method that can find the unique characters from the String
    Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";
     */

    public static String uniqueChars(String str){
        String result = "";
        for (int i = str.length()-1; i >=0 ; i--) {
            char each = str.charAt(i);

            if(!result.contains(""+each)) {
                result += each;
            }
        }
        return result;
    }

}
