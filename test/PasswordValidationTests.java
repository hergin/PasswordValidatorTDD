import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;
import utils.PasswordValidation;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PasswordValidationTests {

    @Test
    void passwordShouldBeMoreThan5chars() {
        assertTrue(PasswordValidation.validate("Hello"));
        assertFalse(PasswordValidation.validate("hell"));
    }

    @Test
    void passwordShouldNotBeMoreThan15chars() {
        assertTrue(PasswordValidation.validate("helLohello"));
        assertFalse(PasswordValidation.validate("hellohellohellohello"));
    }

    @Test
    void passwordShouldHaveAtLeaast1uppercase() {
        assertTrue(PasswordValidation.validate("Hellohello"));
        assertFalse(PasswordValidation.validate("hhellohello"));
    }
    @Test
    void passwordShouldHaveAtLeast1SpecialCharacter(){
        assertTrue(PasswordValidation.validate("!Hello.hello?"));
        assertFalse(PasswordValidation.validate("Helo"));
    }

}
