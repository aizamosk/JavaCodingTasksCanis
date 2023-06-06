package Aizat.week_3;

public class PrimeNumber {
    /*
    Write a method that can check if a number is prime or not.
     */

    public static boolean isPrimeNumber(int n) { //is my method
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {
            return false;

        }

      return true;


    }

    public static void main(String[] args) {
        for (int i = 1; i <=100 ; i++) {
            if(isPrimeNumber(i));{   // I  am calling my method
                System.out.println(i +" this number is a prime number ");
            }
        }
    }
}
