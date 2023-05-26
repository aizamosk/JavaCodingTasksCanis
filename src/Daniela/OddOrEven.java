package Daniela;
public class OddOrEven {

    public static void main(String[] args) {
        FindOddOrEven(6);

    }
    public static void FindOddOrEven(int num){

        if( num % 2== 0){
            System.out.println(num + " is Even");
        } else if(num % 2!=0){
            System.out.println(num + " is Odd");
        }else{
            System.out.println("invalid number");
        }





    }
}






    /*

 Numbers-  Odd or even:
Write  a method which can identify given number is even or odd
Output ex:
identify(5); ->"Odd"
identify(6); ->"Even"

     */


