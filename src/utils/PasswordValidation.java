package utils;

public class PasswordValidation {
    public static boolean validate(String password) {
        if (password.length() < 5 || password.length() > 15)
            return false;

        if (!password.chars().anyMatch(c -> (Character.isUpperCase(c))))
            return false;

        String specialChars = "/*!@#$%^&*()\"{}_[]|\\?/<>,.";
        int count = 0;
        for (int i = 0; i < password.length(); i++)
        {
            for (int j = 0; j < specialChars.length(); j++)
            {
                if(password.charAt(i) == specialChars.charAt(j))
                {
                    count++;
                }
            }
        }
        if(count == 0)
        {
            return false;
        }


        return true;
    }
}
