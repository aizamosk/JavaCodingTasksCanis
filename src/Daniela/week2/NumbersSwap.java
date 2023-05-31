package Daniela.week2;

/**
 *  Numbers -- Swap Numbers
 * Swap two variable values without using a third variable
 */
public class NumbersSwap {
    public static void main(String[] args) {
        swapTwoVariables(5,6);

    }
    static void swapTwoVariables(int a, int b){
        a = a-b; // difference between b and a is stored in a
        b=a+b;// sum is stored in b
        a=b-a;// difference between  a and b is replaced in a
        System.out.println(" After swap value of (a) is " + a + " and Value of (b) is " +b);

    }

}
