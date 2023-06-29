package Aizat.week_6;

public class String_SumOfAllDigits {
    /*
    Write a method that can return the sum of the digits in a string
    Ex:  "12 java 5 apple 3"  ==>  20
     */
    public static void main(String[] args)
    {

        String str = "12 java 5 apple 3";

        System.out.println(Sum(str));
    }


    static int Sum(String str)
    {

        String string = "0";

        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);// Ch will iterate every character from the string during the iteration of the loop

            if (Character.isDigit(ch))
                string += ch;// if each character of ch is digit it will concatenate in the string

            else {
                sum += Integer.parseInt(string);// Here we have 12 + 5 + 3 as a string

                string = "0";
            }
        }


        return sum + Integer.parseInt(string);
    }


}
