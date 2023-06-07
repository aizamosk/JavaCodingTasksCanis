package Odil.week03;

public class PrimeNumber {

    public static void main(String[] args) {

        primeNumber(7);
        primeNumber(13);
        primeNumber(25);
        primeNumber(112);
        primeNumber(-100);

    }

    /*
    Write a method that can check if a number is prime or not.
     */

    public static void primeNumber(int a){

        if (a <= 1){
            System.err.println("Invalid number");
            System.exit(1);
        }
        int count = 0;

        for (int i = 2; i <= a; i++) {
            if (a % i == 0){
                count++;
            }
        }
        if (count == 1){
            System.out.println("Given number " + a + " is a prime number");
        }else{
            System.out.println("Given number " + a + " is not a prime number");
        }
    }
}
