package week1;

public class OddOrEven {

    public static void main(String[] args) {
        oddOrEVen(3);
    }

    /*

 Numbers-  Odd or even:
Write  a method which can identify given number is even or odd
Output ex:
identify(5); ->"Odd"
identify(6); ->"Even"

     */


    public static void oddOrEVen (int a){
        if (a%2==0){
            System.out.println(a+" -> even");
        }else {
            System.out.println(a+" -> odd");
        }
    }

}
