package Mehrubon.week5;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println(reverseString("jhgjhk"));
    }
    public static String reverseString(String str){
        String result = "";
        for (int i = str.length()-1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;
    }

       /*
    Write a return method that can reverse  String
    Ex: Reverse("ABCD"); ==> DCBA
     */
}


