package Leela.week_6;

public class Array_FindMaximum {

    public static void main(String[] args) {
        maximumNumber();
    }

    public static void maximumNumber(){

        int[] numbers = {99, 12, 23, 32, 44, 57, 6, 1000};

        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {

            if (numbers[i] > max) {
                max = numbers[i];

            }

        }
        System.out.println(max);

    }
    /*
    Write a method that can find the maximum number from an int Array
    Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 99

     */
}
