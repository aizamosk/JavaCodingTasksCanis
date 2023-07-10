package Leela.week_7;

public class Array_SortAscending {

    public static void main(String[] args) {

        sortAscending();

    }

    public static void sortAscending(){

        int[] arr = new int[] {10, 9, 8, 7};

        int temp = 0;  // temporary variable to store compared elements

        for (int i = 0; i < arr.length; i++) {  //first loop

            for (int j = i; j < arr.length ; j++) {  // second loop

                if(arr[i] > arr[j]); // comparing first element to every element one by one

                temp = arr[i];

                arr[i] = arr[j];

                arr[j] = temp;

            }

        }
        for (int sortAscending : arr){

            System.out.print(sortAscending);


        }
    }






    /*Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays

    class
    Ex: int[] arr = {10, 9, 8, 7};
    arr = Sort(arr); ==>{ 7, 8, 9, 10};

     */
}
