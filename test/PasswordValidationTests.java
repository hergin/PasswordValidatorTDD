import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;
import utils.PasswordValidation;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PasswordValidationTests {

    @Test
    void passwordShouldBeMoreThan5chars() {
        assertTrue(PasswordValidation.validate("Hell$"));
        assertFalse(PasswordValidation.validate("hel$"));
    }

    @Test
    void passwordShouldNotBeMoreThan15chars() {
        assertTrue(PasswordValidation.validate("helLohell$"));
        assertFalse(PasswordValidation.validate("hellohellohellohell$"));
    }

    @Test
    void passwordShouldHaveAtLeast1uppercase() {
        assertTrue(PasswordValidation.validate("Hellohell$"));
        assertFalse(PasswordValidation.validate("hhellohell$"));
    }

    @Test
    void passwordShouldHaveAtLeast1SpecialCharacter() {
        //  !#$%&'()*+,-./:;<=>?@[\]^_`{|}~"
        assertTrue(PasswordValidation.validate("Helloo$"));
        assertFalse(PasswordValidation.validate("Helloo"));
    }

}
