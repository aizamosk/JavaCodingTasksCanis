package Aizat.week_1;

public class OddOrEven {
    /*

 Numbers -  Odd or even:
Write  a method which can identify given number is even or odd
Output ex:
identify(5); ->"Odd"
identify(6); ->"Even"

     */
    public static void oddOrEven() {

        int number = 6;


        boolean isEven = number % 2 == 0;
        boolean isOdd = !isEven;

        System.out.println(number + " is an even number " + isEven);
        System.out.println(number + " is an odd number " + isOdd);
    }


    public static void main(String[] args) {
        oddOrEven();
    }

}
