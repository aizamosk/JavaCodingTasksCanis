package Aizat.week_6;

public class String_PasswordValidation {
    public static void main(String[] args) {
        String_PasswordValidation("Pass#2");
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
   public static boolean String_PasswordValidation(String password){

       boolean length = password.length() >= 6 && !password.contains(" ");
       boolean UpperCase = false;
       boolean LowerCase = false;
       boolean hasDigit = false;
       boolean SpecChar = false;

       for (char each : password.toCharArray()) {

           if(Character.isUpperCase(each)){
               UpperCase = true;
           }else if(Character.isLowerCase(each)){
               LowerCase = true;
           }else if(Character.isDigit(each)){
               hasDigit = true;
           }else{
               SpecChar = true;
           }

       }
       return length && UpperCase && LowerCase && hasDigit && SpecChar;

   }
}
