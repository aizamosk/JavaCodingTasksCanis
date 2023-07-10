package Leela.week_6;

public class String_SumOfAllDigits {

    public static void calculateNumberSum(String str) {
        int sum = 0;
        String[] numbers = str.split("\\D+");

        for (String number : numbers) {
            if (!number.isEmpty()) {
                sum += Integer.parseInt(number);
            }
        }
        System.out.println("Sum of numbers: " + sum);
    }

    public static void main(String[] args) {

        calculateNumberSum("12 java 5 apple 3");

    }

}










    /*
    Write a method that can return the sum of the digits in a string
    Ex:  "12 java 5 apple 3"  ==>  20
     */


