package utils;
import java.util.*;
import java.util.function.IntPredicate;

public class PasswordValidation {

    public static boolean validate(String password) {

        if (password.length() < 5 || password.length() > 15)
            return false;

        if (!password.chars().anyMatch(c -> Character.isUpperCase(c)))
            return false;

        if (!password.chars().anyMatch(c -> !Character.isAlphabetic(c)))
            return false;

        return true;
    }
}
