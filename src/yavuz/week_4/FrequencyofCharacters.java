package yavuz.week_4;

public class FrequencyofCharacters {
    /*Write a return method that can find the frequency of characters
    Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2*/
    public static void main(String[] args) {


        String str = "aaggggbkkkkcccd";
        String result = "";//a2b1c3d1
        for (int j = 0; j <str.length() ; j++) {


            char ch = str.charAt(j);//we have to compare the first character with all other characters
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ch) {
                    count++;
                }

            }
            if(result.contains(""+ch)){//to make string//if character is already in the result
                continue;//skip it
            }
            result +=ch+""+count;
        }
        System.out.println(result);


    }
    }

