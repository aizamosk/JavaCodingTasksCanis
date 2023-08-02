package Alexey.week_8;

import java.util.Arrays;

public class Array_NuniqueIntegersThatSumUpTo0 {
    /*
    Write a function that, given an integer N (1 < N < 100), returns an array containing N unique integers that sum up to 0.
    The function can return any such array. For example, given N = 4, the function could return [1, 0, -3, 2] or [-2, 1, -4, 5].
    The answer [1, -1, 1, 3] would be incorrect (because value 1 occurs twice).
    For N = 3 one of the possible answers is [-1,0,1]  (but there are many more correct answers).
     */
        public static int[] generateArray(int N) {
            int[] arr = new int[N];

            // If N is odd, assign 0 to the middle element
            if (N % 2 != 0) {
                arr[N / 2] = 0;
            }

            int num = 1;
            // Assign positive and negative integers alternately
            for (int i = 0; i < N; i++) {
                if (arr[i] != 0) {
                    continue;
                }

                arr[i] = num;
                arr[N - i - 1] = -num;
                num++;
            }

            return arr;
        }

        public static void main(String[] args) {
            int N = 4;
            int[] result = generateArray(N);
            System.out.println(Arrays.toString(result));
        }
    }
