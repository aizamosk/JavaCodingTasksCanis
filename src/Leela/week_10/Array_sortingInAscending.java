package Leela.week_10;

public class Array_sortingInAscending {
    /**

    Write a method that can sort the ArrayList in Ascending order without using the sort method.
     **/

    public static void main(String[] args) {
        int arr[] = new int[] {6, 7, 12, 9,-5};
        int temp1 = 0;

        System.out.println("Elements of an original array");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[i] > arr[j]){
                    temp1 = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp1;
                }

            }

        }
        System.out.println();
        System.out.println("Elements of sorted array");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
