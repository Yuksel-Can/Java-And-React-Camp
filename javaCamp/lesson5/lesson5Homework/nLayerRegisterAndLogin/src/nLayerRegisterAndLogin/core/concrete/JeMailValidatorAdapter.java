package nLayerRegisterAndLogin.core.concrete;

import nLayerRegisterAndLogin.JEmailValidator.EmailValidator;
import nLayerRegisterAndLogin.core.abstracts.JeMailValidatorService;

public class JeMailValidatorAdapter implements JeMailValidatorService{

	@Override
	public boolean isValid(String email) {

		return EmailValidator.isEmailValid(email);
		
	}

}
