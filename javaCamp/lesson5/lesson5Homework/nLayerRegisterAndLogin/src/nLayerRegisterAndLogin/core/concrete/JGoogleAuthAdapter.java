package nLayerRegisterAndLogin.core.concrete;

import nLayerRegisterAndLogin.JGoogleAuth.JGoogleAuthManager;
import nLayerRegisterAndLogin.core.abstracts.AuthLoginService;

public class JGoogleAuthAdapter implements AuthLoginService{

	@Override
	public void login(String mail, String password) {

		JGoogleAuthManager googleAuth = new JGoogleAuthManager();
		googleAuth.login(mail, password);
	}

}
