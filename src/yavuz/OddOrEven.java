package yavuz;

public class OddOrEven {
    /*

Numbers-  Odd or even:
Write  a method which can identify given number is even or odd
Output ex:
identify(5); ->"Odd"
identify(6); ->"Even"

   */
    public static void main(String[] args) {
        //Write  a method which can identifies given number is even or odd
        identifyOddEven(5);
        identifyOddEven(6);
    }
    public  static  void  identifyOddEven( int  n ) {
        if(n%2==0){
            System.out.println("even");}//shows even
        else{
            System.out.println("odd");}//shows odd
    }
}
