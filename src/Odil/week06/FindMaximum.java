package Odil.week06;

public class FindMaximum {

    public static void findMaximumNumber(int[] arr) {
        if (arr == null || arr.length == 0) {
            System.out.println("The array is empty.");
            return;
        }

        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Maximum number: " + max);
    }

    public static void main(String[] args) {
        int[] arr = {99, 12, 23, 32, 44, 57, 6};
        findMaximumNumber(arr);
    }

}
