package Odil.week05;

public class Reverse {
    /*
    Write a return method that can reverse  String. Ex: Reverse("ABCD"); ==> DCBA
     */

    public static void Reverse(String str) {

        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }

        System.out.println(reverse);
    }

    public static void main(String[] args) {
        Reverse("ABCD");
    }
}
