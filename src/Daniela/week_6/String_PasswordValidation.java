package Daniela.week_6;

public class String_PasswordValidation {
   /* 1. Write a return method that can verify if a password is valid or not.
    requirements:
            1. Password MUST be at least have 6 characters and should not contain space
2. PassWord should at least contain one upper-case letter
3. PassWord should at least contain one lowercase letter
4. Password should at least contain one special character
5. Password should at least contain a digit
if all requirements above are met, the method returns true, otherwise returns  false

    */
   public static void main(String[] args) {
      System.out.println(PassWord("a?G6jdsaja"));

   }

   static boolean PassWord(String passWord) {
      String validPassWord = "";
      boolean length = validPassWord.length() >= 6;
      boolean lower = validPassWord.matches(".*[a-z].*");
      boolean upper = validPassWord.matches(".*[A-Z].*");
      boolean number = validPassWord.matches(".*[0-9].*");
      boolean special = validPassWord.matches(".*[!@.,#$?].*");
      boolean valid = length && lower && upper && number && special;
      if (valid) {
         System.out.println("Password is valid");
      } else {
         System.out.println("Not a valid password");
      }
      return length;
   }
}





