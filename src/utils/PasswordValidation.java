package utils;

public class PasswordValidation {
    public static boolean validate(String password) {
        String specialCharacters = "!#$%+_<>/?<>:;'=-[]^'{}|";
        int numberOfSC = 0;

        if (password.length() < 5 || password.length() > 15)
            return false;

        if (!password.chars().anyMatch(c -> Character.isUpperCase(c)) )
            return false;

        for(int i =0; i < password.length();i++){
            if(specialCharacters.contains(Character.toString(password.charAt(i)))){
                numberOfSC = numberOfSC+1;
            }
        }
        if(numberOfSC==0)
            return false;


        return true;
    }
}
