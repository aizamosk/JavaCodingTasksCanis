package Aizat.week_2;

/**
 *  Numbers -- Swap Numbers
 * Swap two variable values without using a third variable
 */
public class NumbersSwap {
    public static void main(String[] args) {

        int a= 15, b=30;

        a= a+b; // a becomes 45
        b= a-b; // b becomes 15
        a= a-b; // a become 30
        System.out.println("Result: "+a +" " +b);


    }

}
