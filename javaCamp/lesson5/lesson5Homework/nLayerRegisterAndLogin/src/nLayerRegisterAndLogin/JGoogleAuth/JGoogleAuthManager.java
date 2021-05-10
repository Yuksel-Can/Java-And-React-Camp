package nLayerRegisterAndLogin.JGoogleAuth;

import nLayerRegisterAndLogin.Entities.concrete.User;

public class JGoogleAuthManager {
	
	public void register(User user) {
		System.out.println(user.getFirstName() + " : Google ile kayýt iþlemi BAÞARILI");
	}
	public void login(String email, String password) {
		System.out.println(email+ " : Google ile giriþ iþlemi BAÞARILI");
	}

}
