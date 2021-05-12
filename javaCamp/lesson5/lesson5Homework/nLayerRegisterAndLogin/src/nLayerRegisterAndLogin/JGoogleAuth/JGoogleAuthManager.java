package nLayerRegisterAndLogin.JGoogleAuth;

import java.util.regex.Pattern;

import nLayerRegisterAndLogin.Entities.concrete.User;

public class JGoogleAuthManager {
	
	private static final String EMAIL_PATTERN = "@gmail.com";

	public void register(User user) {
		System.out.println(user.getFirstName() + " : Google ile kay�t i�lemi BA�ARILI");
	}
	public void login(String email, String password) {
		Pattern pattern = Pattern.compile(EMAIL_PATTERN, Pattern.CASE_INSENSITIVE);
		
		if(pattern.matcher(email).find()) {
			System.out.println(email+ " : Google ile giri� i�lemi BA�ARILI");
		}else {
			System.out.println(email+ " : Google ile giri� i�lemi BA�ARISIZ");
		}
	}

}
