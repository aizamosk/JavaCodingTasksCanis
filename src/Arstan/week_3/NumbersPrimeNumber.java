package Arstan.week_3;

public class NumbersPrimeNumber {

        public static void main(String[] args) {
            System.out.println(primeNumber(7));

        }

        public static boolean primeNumber(int num) {
            if (num < 2) {
                return false;
            }
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

