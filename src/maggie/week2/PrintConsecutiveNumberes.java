package maggie.week2;

public class PrintConsecutiveNumberes {

    public static void main(String[] args) {

        int n = 20;
        String codality = "Codality";
        String test = "Test";
        String coder = "Coder";

        //print numbers 1 - n
        //nums = 2 replace with codaility, 3 Test, 5 coders

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                System.out.println(codality);
                if (i % 3 == 0) {
                    System.out.println(test);
                    if (i % 5 == 0) {
                        System.out.println(coder);
                    } else {
                        System.out.println(i);
                    }
                }
            }
        }
    }
}

/**
 *  Numbers -- print consecutive numbers
 * Write a function that, given a positive integer N, prints the consecutive numbers from 1 to N,
 * each on a separate line. However, any number divisible by 2, 3 or 5 should be replaced by the word Codility,
 * Test or Coders respectively. If a number is divisible by more than one of the numbers: 2,3 or 5, it should be
 * replaced by a concatenation of the respective words Codility, Test and Coders in this given order. For example,
 * numbers divisible by both 2 and 3 should be replaced by CodilityTest and numbers divisible by all three numbers:
 * 2,3 and 5, should be replaced by CodilityTestCoders.
 *
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