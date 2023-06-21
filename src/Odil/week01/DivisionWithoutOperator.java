package Odil.week01;

public class DivisionWithoutOperator {
    /*
Numbers - Divide without / operator:
Write a method that can divide two numbers without using division operator
*/

    public static void DivisionWithoutOperator(int num1, int num2) {

        int result = 0;

        if (num1 > 0 && num2 > 0) {
            while (num1 >= num2) {
                num1 -= num2;
                result++;
            }
        } else {
            System.err.println("Number is negative");
        }
        System.out.println("Result = " + result);
    }

}
