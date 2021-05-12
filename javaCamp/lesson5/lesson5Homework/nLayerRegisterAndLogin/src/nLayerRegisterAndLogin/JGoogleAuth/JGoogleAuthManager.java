package nLayerRegisterAndLogin.JGoogleAuth;

import java.util.regex.Pattern;

import nLayerRegisterAndLogin.Entities.concrete.User;

public class JGoogleAuthManager {
	
	private static final String EMAIL_PATTERN = "@gmail.com";

	public void register(User user) {
		System.out.println(user.getFirstName() + " : Google ile kayýt iþlemi BAÞARILI");
	}
	public void login(String email, String password) {
		Pattern pattern = Pattern.compile(EMAIL_PATTERN, Pattern.CASE_INSENSITIVE);
		
		if(pattern.matcher(email).find()) {
			System.out.println(email+ " : Google ile giriþ iþlemi BAÞARILI");
		}else {
			System.out.println(email+ " : Google ile giriþ iþlemi BAÞARISIZ");
		}
	}

}
