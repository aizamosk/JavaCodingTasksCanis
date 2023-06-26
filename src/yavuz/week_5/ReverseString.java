package yavuz.week_5;

public class ReverseString {
    /*
    Write a return method that can reverse  String
    Ex: Reverse("ABCD"); ==> DCBA
     */
    public static void main(String[] args) {
        System.out.println(StrReverse("abcd"));

    }

    public static String StrReverse(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--)
            reverse += str.charAt(i);
        return reverse;
    }
}
