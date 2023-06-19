package Daniela.week5.week_5;

public class ReverseString {
    /*
    Write a return method that can reverse  String
    Ex: Reverse("ABCD"); ==> DCBA
     */
    public static void main(String[] args) {
        ReverseString("ABCD");

    }

    static void ReverseString(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        System.out.println(reversed);

    }
}

