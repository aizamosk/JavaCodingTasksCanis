package Leela.week_5;

public class ReverseString {
    public static void main(String[] args) {

        reverseString();

    }

        public static void reverseString() {


            String str = "ABCD";

            String reverse = "";

            for (int i = str.length() - 1; i >= 0; i--) {
                reverse += str.charAt(i);

            }
            System.out.println(reverse);
        }


    /*
    Write a return method that can reverse  String
    Ex: Reverse("ABCD"); ==> DCBA
     */
    }
