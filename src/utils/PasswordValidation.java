package utils;

import java.util.*;

public class PasswordValidation {
    public static boolean validate(String password) {
        if (password.length() < 5 || password.length() > 15)
            return false;

        if (!password.chars().anyMatch(c -> Character.isUpperCase(c)))
            return false;

        if (password.contains("!") || password.contains("#") || password.contains("$") ||
                password.contains("%") || password.contains("&") || password.contains("(") ||
                password.contains(")") || password.contains("*") || password.contains("+") ||
                password.contains(",") || password.contains("-") || password.contains(".") ||
                password.contains("/") || password.contains(":") || password.contains(";") ||
                password.contains("<") || password.contains("=") || password.contains(">") ||
                password.contains("?") || password.contains("@") || password.contains("[") ||
                password.contains("]") || password.contains("^") || password.contains("_") ||
                password.contains("`") || password.contains("{") || password.contains("|") ||
                password.contains("}") || password.contains("~")) {
        } else {
            return false;
            
        }


        return true;
    }
}

// !#$%&()*+,-./:;<=>?@[]^_`{|}~