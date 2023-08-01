package Daniela.week_6;

public class String_SumOfAllDigits {
    /*
    Write a method that can return the sum of the digits in a string
    Ex:  "12 java 5 apple 3"  ==>  20
     */
    public static void main(String[] args) {

        System.out.println(sumOfAllDigits("12 java 5 apple 3"));

    }
    static int sumOfAllDigits(String str){
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            char c=str.charAt(i);
            if(Character.isDigit(c)){
                sum+= Character.getNumericValue(c);
            }

        }
return sum;
    }
}
