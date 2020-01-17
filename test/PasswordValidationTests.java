import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;
import utils.PasswordValidation;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PasswordValidationTests {

    @Test
    void passwordShouldBeMoreThan5chars() {
        assertTrue(PasswordValidation.validate("Hello2"));
        assertFalse(PasswordValidation.validate("hel2"));
    }

    @Test
    void passwordShouldNotBeMoreThan15chars() {
        assertTrue(PasswordValidation.validate("helLohello2"));
        assertFalse(PasswordValidation.validate("hellohellohellohello2"));
    }

    @Test
    void passwordShouldHaveAtLeaast1uppercase() {
        assertTrue(PasswordValidation.validate("Hellohello2"));
        assertFalse(PasswordValidation.validate("hhellohello2"));
    }

    @Test
    void passwordShouldHaveAtLeast1SpecialCharacter(){
        assertTrue(PasswordValidation.validate("Hellohello2"));
        assertFalse(PasswordValidation.validate("hhellohello"));
    }

}
