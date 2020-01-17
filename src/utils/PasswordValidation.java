package utils;

public class PasswordValidation {
    public static boolean validate(String password) {
        if (password.length() < 5 || password.length() > 15)
            return false;

        if (!password.chars().anyMatch(c -> Character.isUpperCase(c)))
            return false;

        if (!password.chars().noneMatch(c -> Character.isSpaceChar(c)))
            return false;

        return true;
    }
}
