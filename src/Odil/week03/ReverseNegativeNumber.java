package Odil.week03;

public class ReverseNegativeNumber {

    public static void main(String[] args) {
        
        ReverseNegativeNumber(-53);
        ReverseNegativeNumber(-35);
        ReverseNegativeNumber(-117);
        ReverseNegativeNumber(254);

    }

    /*
    Write a return method that can reverse digits of a negative number and return it as int
input: -35  output: -53
     */

    public static void ReverseNegativeNumber(int a){
        if (a > 0){
            System.err.println("Number should be negative");
            System.exit(1);
        }

        String intToString = String.valueOf(a);
        String reverseString = "";

        for (int i = intToString.length()-1 ; i > 0 ; i--){
        reverseString += intToString.charAt(i);
        }
        System.out.println(Integer.parseInt(reverseString)*-1);
    }
    }
