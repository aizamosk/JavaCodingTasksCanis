package Odil.week05;

public class UniqueCharacters {
    /*
    Write a return  method that can find the unique characters from the String
Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";
     */

    public static void UniqueCharacters (String str){

        String result = "";

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            int count = 0;

            for (int j = 0; j < str.length(); j++) {
                if(str.charAt(j) == ch){
                    count++;
                }
            }

            if(count == 1 && !result.contains(""+ch)){
                result += ch;
            }

        }

        System.out.println(result);
    }

    public static void main(String[] args) {
        UniqueCharacters("AAABBBCCCDEF");
    }

}
