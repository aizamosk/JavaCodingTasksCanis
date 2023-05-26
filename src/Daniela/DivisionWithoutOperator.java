package Daniela;

public class DivisionWithoutOperator {

    public static void main(String args[]){//main method
        int num1=200;
        int num2=5;
        int result=0;
       int  div=num1+num2;
        while(div>num2){
            div=div-num2;
            result++;

        }
        System.out.println("Division of "+num1+" to "+num2+" = "+result);
    }
}



    /*

 Numbers - Divide without / operator:
Write a method that can divide two numbers without using division operator
     */

