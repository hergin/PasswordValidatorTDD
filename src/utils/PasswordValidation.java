package utils;

public class PasswordValidation {
    public static boolean validate(String password) {
        if (password.length() < 5 || password.length() > 15)
            return false;

        if (!password.chars().anyMatch(c -> Character.isUpperCase(c)))
            return false;

        char[] specialCharacter = {'!','@','#','$','%','^','&','*'};
        for (int i = 0; i < (password.length() - 1); i++) {
            for (int j = 0; i < specialCharacter.length; i++){
                if (password.charAt(i) == specialCharacter[j]){
                    return true;
                }
            }
        }
        return true;
    }
}
