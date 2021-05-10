package nLayerRegisterAndLogin.core.concrete;

import nLayerRegisterAndLogin.core.abstracts.AuthLoginService;

public class DefaultAuthLogin implements AuthLoginService{

	@Override
	public void login(String email, String password) {

		System.out.println(email + " : Default giriþ iþlemi BAÞARILI");
	}

}
