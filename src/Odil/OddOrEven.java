package Odil;

public class OddOrEven {
    /*
Numbers-  Odd or even:
Write  a method which can identify given number is even or odd
Output ex:
identify(5); ->"Odd"
identify(6); ->"Even"
*/

    public static void oddOrEven(int number){

        if(number % 2 ==0){
            System.out.println("identify(" + number + "); -> \"Even\"");
        }else{
            System.out.println("identify(" + number + "); -> \"Odd\"");
        }

    }

}
