package Leela.week_3;

public class ReverseNegativeNumber {

        public static void main(String[] args) {
            int number = - 43;
            int num = 43, rev = 0;
            while(num != 0)
            {
                int digit = num % 10;
                rev = rev * 10 + digit;
                num = num/10;
            }
            System.out.println(rev);
    }


    }
    /*
    Write a return method that can reverse digits of a negative number and return it as int
input: -35  output: -53
     */

