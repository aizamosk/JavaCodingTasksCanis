package Mehrubon.week_6;

public class String_PasswordValidation {
    public static void main(String[] args) {
        System.out.println(passwordValidation("Ko1-@"));
        System.out.println(passwordValidation("Azthebest123!!!!@!!!"));
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
    public static boolean in(String p, String r) {
        for (int j = 0; j < p.length(); j++) {
            for (int i = 0; i < r.length(); i++) {
                if (r.charAt(i) == p.charAt(j)) {
                    return true;
                }
            }
        }

        return false;
    }
    public static boolean passwordValidation(String password){
        return  (password.length() >= 6) &
                (password.toLowerCase() != password) &
                (password.toUpperCase() != password) &
                (!(password.contains(" "))) &
                (in(password, "1234567890")) &
                (in(password, "(.*[ -/, :-@].*)"));
    }

}
