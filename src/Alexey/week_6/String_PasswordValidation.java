package Alexey.week_6;

import java.util.Arrays;
import java.util.Scanner;

public class String_PasswordValidation {
   /* Write a return method that can verify if a password is valid or not.
    requirements:
    1. Password MUST be at least have 6 characters and should not contain space
    2. PassWord should at least contain one upper-case letter
    3. PassWord should at least contain one lowercase letter
    4. Password should at least contain one special character
    5. Password should at least contain a digit
    if all requirements above are met, the method returns true, otherwise returns  false
    */

    public static boolean passwordValidation (String password) {
        boolean isDigit = false;
        boolean isLowerCase = false;
        boolean isUpperCase = false;
        boolean isSpecialCharacter = false;
        boolean isPass = false;

        if (password.length() < 6) return false;
        else if (password.contains(" ")) return false;
        else {
            for (int i = 0; i < password.length(); i++) {
                char ch = password.charAt(i);
                if (Character.isDigit(password.charAt(i))) isDigit = true;
                if (Character.isLowerCase(password.charAt(i))) isLowerCase = true;
                if (Character.isUpperCase(password.charAt(i))) isUpperCase = true;
                if ((32 < ch && ch < 48) && (57 < ch && ch < 65) && (90 < ch && ch < 97) && (122 < ch && ch < 127)) isSpecialCharacter = true;
            }
        }
        isPass = true && (isDigit && isLowerCase && isUpperCase);
        return isPass;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your password");
        String userInput = input.nextLine();
        System.out.println(passwordValidation(userInput));;    //  printing results by invoking method
    }
}
