package maggie;

import com.sun.jdi.event.BreakpointEvent;

public class ReverseNegative {
    public static void main(String[] args) {

        reverseDigits(-84);

    }

    public static int reverseDigits(int a){

        int reversedNumber = 0;
            while(a < 0){
            int digit = a % 10;
            reversedNumber = digit * 10;
        }
            return reversedNumber;

    }
}
   /*
    Write a return method that can reverse digits of a negative number and return it as int
input: -35  output: -53
     */