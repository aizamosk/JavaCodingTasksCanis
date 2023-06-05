package week1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args){

        int num = 0;

        if(num % 2 == 0) {
            System.out.println("Even");
        }else {
            System.out.println("Odd");
        }

    }

    /*

 Numbers-Odd or even:
Write  a method which can identify given number is even or odd
Output ex:
identify(5); ->"Odd"
identify(6); ->"Even"

     */
    //wonderfullll




    public static void Identifier(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter number to be identify");
        int number = scan.nextInt();

        if (number%2 != 0) {                        //checking if number entered has left over from division by 2
            System.out.println("Odd");
        } else System.out.println("Even");

        scan.close();   //closing scannera
    }
    public static void main(String[] args) {
        try {
            Identifier();
        }
        catch (InputMismatchException e) {
            System.out.println("You`ve entered wrong type in console for identification, please enter numbers only!");
        }
    }

}
