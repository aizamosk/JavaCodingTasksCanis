package maggie;

import org.w3c.dom.ls.LSOutput;

public class FrequencyOfCharacters {

    private static String frequencyOfChar(String str) {

        String result = "";
        for (int j = 0; j < str.length(); j++) {
            char ch = str.charAt(j); //a
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ch) {
                    count++;
                }
            }
            if (result.contains("" + ch)) {
                continue;
            }
            result += ch + "" + count;
        }
        return result;
    }


    public static void main(String[] args) {

        frequencyOfChar("Maaarrcooo");
    }

}
/*
Write a return method that can find the frequency of characters
  Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
 */