package Mehrubon;

import java.util.Scanner;

public class OddOrEven {
    public static void OddEven() {

        Scanner scanner = new Scanner(System.in);

            System.out.println("Enter a number:");
            int num = scanner.nextInt();

            if(num%2==0){
                System.out.println("Number " + num +" is even");
            }else System.out.println("Number " + num +" is odd");
        }


    /*
 Numbers-Odd or even:
Write  a method which can identify given number is even or odd
Output ex:
identify(5); ->"Odd"
identify(6); ->"Even"

     */

}
