package Odil.week02;

/**
 *  Numbers -- Swap Numbers
 * Swap two variable values without using a third variable
 */
public class NumbersSwap {

    public static void main(String[] args) {

        numbersSwap(5,7);
        System.out.println("__________________");
        numbersSwap(10, 15);

    }

    public static void numbersSwap(int a, int b){

        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("Swapped a = " + a);
        System.out.println("Swapped b = " + b);
    }
}
