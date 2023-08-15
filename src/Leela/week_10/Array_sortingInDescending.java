package Leela.week_10;

public class Array_sortingInDescending {
    /**

    Write a method that can sort the ArrayList in Descending order without using the sort method.
     */

    public static void main(String[] args) {
        int arr[] = new int[] {9, 8, 13, 10,-5};
        int temp = 0;

        System.out.println("Elements of an original array");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[i] < arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
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
