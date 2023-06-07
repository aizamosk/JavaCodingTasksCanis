package Mehrubon.week3;

public class ReverseNegativeNumber {
    public static void main(String[] args) {
        System.out.println(reverseNegNum(-456));
    }
       /*
    Write a return method that can reverse digits of a negative number and return it as int
input: -35  output: -53
     */
public static int reverseNegNum(int num){
    String str = new StringBuilder(""+num).reverse().toString();
    if(num<2){
        str = "-"+str.substring(0, str.length()-1);
    }
    return Integer.valueOf(str);
}
}
