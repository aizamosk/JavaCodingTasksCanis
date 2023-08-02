package Alexey.week_8;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Array_MoveZerosToTheEnd {
    /*
    Write a method that can move all the zeros to last indexes of the array (Do Not Use Sort Method)
    input:  {1,0,2,0,3,0,4,0};
    output: [1, 2, 3, 4, 0, 0, 0, 0]
     */


    public static void moveZeros(int[] nums) {
        int index = 0; // Index to track the current position to insert non-zero elements

        // Traverse the array and move non-zero elements to the left side of the array
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[index] = nums[i];
                index++;
            }
        }

        // Fill the remaining elements with zeros
        while (index < nums.length) {
            nums[index] = 0;
            index++;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 0, 0, 6, 3, 12, 144, 12};

        System.out.println("Original array: " + Arrays.toString(nums));
        moveZeros(nums);
        System.out.println("Array after moving zeros: " + Arrays.toString(nums));
    }

}
