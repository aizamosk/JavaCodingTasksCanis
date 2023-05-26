package Aizat;

import java.util.Scanner;
public class DivisionWithoutOperator {
    /*

 Numbers - Divide without / operator:
Write a method that can divide two numbers without using division operator

     */


    public static void divisionWithoutOperator() {




        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter the first number:");
        int a = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int b = scanner. nextInt();

        int count = 0;

        while (a >= b){
            a = a-b;
            count = count +1;

        }
        System.out.println("Divide is : " +count );
    }



    public static void main(String[] args) {
        divisionWithoutOperator();
        }
    }

