package nLayerRegisterAndLogin.JEmailValidator;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

public class EmailValidatorTest {
	@Test
	public void testIsEmailValid() {
	// Do�ru
	assertTrue(EmailValidator.isEmailValid("ykslcn@gmail.com"));
	assertTrue(EmailValidator.isEmailValid("yuksel@itu.edu.tr"));
	assertTrue(EmailValidator.isEmailValid("yuksel@test.com.tr"));
	assertTrue(EmailValidator.isEmailValid("yuksel.can@test.com.tr"));
	// Yanl��
	assertFalse(EmailValidator.isEmailValid("bahadir.akin@test.asd"));
	}
}
