package Mehrubon.week2;

public class SwapTwoNums {
    public static void main(String[] args) {
        SwapNums();
    }
    /*
    Numbers -- Swap Numbers
Swap two variable values without using a third variable
     */

    public static void SwapNums(){
        int x = 12;
        int y = 23;
        x = x+y;
        y= x-y;
        x=x-y;
        System.out.println("x: "+x);
        System.out.println("y: "+y);
    }
}
