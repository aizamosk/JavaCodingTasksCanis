package Leela.week_3;



public class PrimeNumber {

    public static void primeNumber(){

        int num = 13;
        int count = 0;


        for (int i = 1; i <= num; i++) {  // if num Divisible by 1 and itself is prime
            if (num % i == 0) {
                count++;
            }

        }
        if (count == 2) { //if num Divisible by 1 and itself  than count will be exactly 2.
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");

        }

    }

    public static void main(String[] args) {
        primeNumber();

    }
    /*
    Write a method that can check if a number is prime or not.
     */
}
