package nLayerRegisterAndLogin.JGoogleAuth;

import nLayerRegisterAndLogin.Entities.concrete.User;

public class JGoogleAuthManager {
	
	public void register(User user) {
		System.out.println(user.getFirstName() + " : Google ile kay�t i�lemi BA�ARILI");
	}
	public void login(String email, String password) {
		System.out.println(email+ " : Google ile giri� i�lemi BA�ARILI");
	}

}
