package Aizat.week_5;

public class UniqueCharacters {
    /*
    Write a return  method that can find the unique characters from the String
    Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";
     */

    public static void main(String[] args) {
        uniqueCharacters();
    }
    public static void uniqueCharacters(){

        String str = "AAABBBCCCDEF";

        String unique = "";

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);

            if(str.indexOf(each) == str.lastIndexOf(each)  ){
                unique += each;
            }

        }


        System.out.println("Unique characters are: " +unique);



    }


}