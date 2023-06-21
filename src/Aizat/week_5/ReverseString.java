package Aizat.week_5;

public class ReverseString {
    public static void main(String[] args) {
        reverseString();
    }


    /*
    Write a return method that can reverse  String
    Ex: Reverse("ABCD"); ==> DCBA
     */
        public static void reverseString() {
            String str = "ABCD";
            String reversed = "";
            int len = str.length();

            for (int i = len - 1; i >= 0; i--) {
                reversed = reversed + str.charAt(i);
            }

            System.out.println("Reversed string: " +reversed);
        }
    }

