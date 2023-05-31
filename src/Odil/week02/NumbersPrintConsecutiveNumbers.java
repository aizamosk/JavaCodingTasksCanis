package Odil.week02;

/**
 * Numbers -- print consecutive numbers
 * Write a function that, given a positive integer N, prints the consecutive numbers from 1 to N, each on a separate line. However, any number divisible by 2, 3 or 5 should be replaced by the word Codility, Test or Coders respectively. If a number is divisible by more than one of the numbers: 2,3 or 5, it should be replaced by a concatenation of the respective words Codility, Test and Coders in this given order. For example, numbers divisible by both 2 and 3 should be replaced by CodilityTest and numbers divisible by all three numbers: 2,3 and 5, should be replaced by CodilityTestCoders.
 * <p>
 * For example, here is the output for N = 17:
 * 1
 * Codility
 * Test
 * Codility
 * Coders
 * CodilityTest
 * 7
 * Codility
 * Test
 * CodilityCoders
 * 11
 * CodilityTest
 * 13
 * Codility
 * TestCoders
 * Codility
 */
public class NumbersPrintConsecutiveNumbers {

    public static void main(String[] args) {

        CodilityTestCoders(17);

    }

    public static void CodilityTestCoders(int n) {

        System.out.println("Given number: N = " + n);

        String div2 = "Codility";
        String div3 = "Test";
        String div5 = "Coders";

        for (int i = 1; i < n; i++) {

            if (i % 30 == 0) {
                System.out.println(div2 + div3 + div5);
            } else if (i % 10 == 0) {
                System.out.println(div2 + div5);
            } else if (i % 6 == 0) {
                System.out.println(div2 + div3);
            } else if (i % 5 == 0) {
                System.out.println(div5);
            } else if (i % 3 == 0) {
                System.out.println(div3);
            } else if (i % 2 == 0) {
                System.out.println(div2);
            } else System.out.println(i);

        }


    }
}
