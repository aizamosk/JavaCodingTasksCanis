package maggie;

import java.util.Scanner;

/*
   Write a method that can check if a number is prime or not.
    */
public class PrimeNumbers {

    public static void main(String[] args) {

        primeNumber(17);
        primeNumber(4);
        primeNumber(131);
    }
    public static void primeNumber(int num1) {


        if (num1 <= 0){
            System.out.println("Invalid number" +num1);
            System.exit(1);
        }
            int count =0;
        for (int i = 2; i <= num1 ; i++) {
            if (num1 % i == 0) {
                count++;
            }
        }
            if(count == 1){
                System.out.println(num1 + " is a prime number");
            } else {
                System.out.println(num1 + " is not a prime number");

            }

    }
}
