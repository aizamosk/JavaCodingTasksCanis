package Daniela.week3.week_3;

public class ReverseNegativeNumber {
    public static void main(String[] args) {

        System.out.println(reverseNegativeNumber(-35));

    }

    public static int reverseNegativeNumber(int num) {
        boolean isNegative = false;
        if (num < 0) {//First, we check if the input number is negative or not using a boolean variable `isNegative`. If it is negative, we set `isNegative` to true and convert the number to its positive equivalent by multiplying it with -1.
            isNegative = true;
            num = -num;
        }
        int reversed = 0;
        while (num > 0) {// In each iteration of the loop, we take the last digit of the number using `num % 10`, add it to `reversed` multiplied by 10, and update `num` by removing its last digit using `num /= 10`.
            reversed = reversed * 10 + num % 10;
            num /= 10;
        }
        return isNegative ? -reversed : reversed;

    }

    /*
    Write a return method that can reverse digits of a negative number and return it as int
input: -35  output: -53
     */
}
