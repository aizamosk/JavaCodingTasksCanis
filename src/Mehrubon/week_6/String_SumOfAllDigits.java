package Mehrubon.week_6;

public class String_SumOfAllDigits {
    public static void main(String[] args) {
        System.out.println(sumOfDigits("dsg1234gjkj"));
    }
    /*
    Write a method that can return the sum of the digits in a string
    Ex:  "12 java 5 apple 3"  ==>  20
     */
    public static int sumOfDigits(String str){
        int result = 0;
        char[] ch = str.toCharArray();
        for (char each : ch) {
            if (Character.isDigit(each))
                result += Integer.valueOf(""+each);
        }
        return result;
    }
}
