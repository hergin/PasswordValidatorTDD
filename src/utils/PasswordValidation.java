package utils;

public class PasswordValidation {
    public static boolean validate(String password) {
        if (password.length() < 5 || password.length() > 15)
            return false;

        if (!password.chars().anyMatch(c -> Character.isUpperCase(c)))
            return false;

        boolean atleast1SpecialCharacter=false; // create a boolean type for check special charater

        for (int i=0; i<password.length(); i++) { //create a for loop
            if (!Character.isLetter(password.charAt(i)) && !Character.isDigit(password.charAt(i))) {  //check whether or not passwords have at least one special character
                atleast1SpecialCharacter=true;  //if passwords have at least one special character, change boolean type
                break; //break the for loop
            }
        }//close for loop

        if (atleast1SpecialCharacter==false){ //check boolean type
            return false;
        }

        return true;
    }
}
