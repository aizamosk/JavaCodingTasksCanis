package Leela.week_6;

import Odil.week06.PasswordValidation;

public class String_PasswordValidation {

    public static boolean isValidPassword(String password) {
        // Requirement 1: Password length is at least 6 characters and does not contain space
        if (password.length() < 6 || password.contains(" ")) {
            return false;
        }

        // Requirement 2: Contains at least one uppercase letter
        if (!password.matches(".*[A-Z].*")) {
            return false;
        }

        // Requirement 3: Contains at least one lowercase letter
        if (!password.matches(".*[a-z].*")) {
            return false;
        }

        // Requirement 4: Contains at least one special character
        if (!password.matches(".*[!@#$%^&*()-_=+{}\\|\\[\\];:'\",<.>/?].*")) {
            return false;
        }

        // Requirement 5: Contains at least one digit
        if (!password.matches(".*\\d.*")) {
            return false;
        }

        // All requirements are met
        return true;
    }

    public static void main(String[] args) {
        String password = "Abc123@";
        boolean isValid = PasswordValidation.isValidPassword(password);

        if (isValid) {
            System.out.println("Password is valid");
        } else {
            System.out.println("Password is not valid");
        }
    }

   /* 1. Write a return method that can verify if a password is valid or not.
    requirements:
            1. Password MUST be at least have 6 characters and should not contain space
2. PassWord should at least contain one upper-case letter
3. PassWord should at least contain one lowercase letter
4. Password should at least contain one special character
5. Password should at least contain a digit
if all requirements above are met, the method returns true, otherwise returns  false

    */
}
