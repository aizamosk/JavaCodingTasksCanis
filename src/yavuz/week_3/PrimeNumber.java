package yavuz.week_3;

public class PrimeNumber {
    /*
    Write a method that can check if a number is prime or not.
     */

    static boolean isPrime(int number) {//created a method
        if (number <= 0) {//negative numbers can not be prime
            return false;
        }
        for (int i = 2; i < number; i++) {//to check if the number is divisible by other than 1 and its own.
            if ((number % i) == 0) {
                // Not Prime
                return false;
            }
        }
            // Just Prime!
            return true;

    }


        public static void main (String[]args){

            System.out.println(isPrime(29));
        }

}
