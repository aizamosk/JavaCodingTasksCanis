package Daniela.week4.week_4;

public class FrequencyofCharacters {
    /*Write a return method that can find the frequency of characters
    Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2*/

    public static void main(String[] args) {



        String str= " AAABBCDD";
          String expected ="";

            for (int i = 0; i <str.length() ; i++) {
                int num = 0;
                for (int j = 0; j < str.length(); j++) {
                    if (str.charAt(i) == str.charAt(j)) {
                        num++;
                    }

                }
                expected = str.charAt(i) + " " + num;
                str = str.replace("" + str.charAt(i), "");
                i = 1;
                System.out.println(expected);
            }




        }







    }

