package Daniela.week5.week_5;

public class UniqueCharacters {
    /*
    Write a return  method that can find the unique characters from the String
    Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";


     */
    public static void main(String[] args) {
        UniqueCharacters("AAABBBCCCDEF");


    }
    public static void UniqueCharacters(String str) {

        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.contains("" + str.charAt(i))) {
                str = str.replaceAll("" + str.charAt(i), "");
            }
        }
        System.out.println(str);
    }
    }


