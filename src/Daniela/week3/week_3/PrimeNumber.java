package Daniela.week3.week_3;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number :");// asking a user to give a number

        int number = sc.nextInt();

        boolean isItPrime = checkForPrime(number);

        if (isItPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

        sc.close();


    }
    static boolean checkForPrime(int givenNumber)
    {
        boolean isItPrime = true;//The isPrime(int n) method is used to check whether the parameter passed to it is a prime number or not. If the parameter passed is prime, then it returns True otherwise it returns False.

        if(givenNumber <= 1)
        {
            isItPrime = false;////If the number is less than 1, if(inputNumber<= 1) it returns false.

            return isItPrime;
        }
        else
        {
            for (int i = 2; i<= givenNumber/2; i++)// If the number is not less than or equal to 1, performs division operation.

            {
                if ((givenNumber % i) == 0)//if the remainder is zero, it returns false, meaning it is not a prime number.
                {
                    isItPrime = false;//If it is a non-zero number, it returns true, resulting in a prime number.

                    break;
                }
            }

            return isItPrime;
        }
    }

}




    /*
    Write a method that can check if a number is prime or not.
     */

