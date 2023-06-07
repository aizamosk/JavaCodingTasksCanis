package Aizat.week_3;

public class ReverseNegativeNumber {
    /*
    Write a return method that can reverse digits of a negative number and return it as int
input: -35  output: -53
     */

    public static void main(String[] args) {


        int num = -35;
        int number = -1 * num, reversed = 0;
        while (number != 0) {
            int num2 = number % 10;
            reversed = reversed * 10 + num2;
            number = number / 10;

        }
        reversed=-1*reversed;
        System.out.println(reversed);
    }

}








