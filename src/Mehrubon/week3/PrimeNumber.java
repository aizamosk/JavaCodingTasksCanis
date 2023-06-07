package Mehrubon.week3;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println(prime(9));
    }
      /*
    Write a method that can check if a number is prime or not.
     */
    public static boolean prime(int num) {

        if (num < 2) {
            return false;
        }

        for (int i=2; i<num; i++){
            if(num%i==0) {
                return false;
            }
        }
        return true;
    }
}
