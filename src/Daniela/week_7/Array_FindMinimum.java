package Daniela.week_7;

public class Array_FindMinimum {
    /*
    Write a method that can find the minimum number from an int Array
    Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 6
     */
    public static void main(String[] args) {
        int[] arr = {99, 12, 23, 32, 44, 57, 6};
        System.out.println(minArray(arr));
    }
    public static int minArray(int [] arr){// creating method with int return type, with array argument type
        int min = arr[0];// initial value for the first element /starting point
        for(int each :arr){ // using for each loop to iterate through each element in the array
            if(each<min){// if each number is smaller than previous number
                min=each;
            }

        }
        return min;

    }
}
