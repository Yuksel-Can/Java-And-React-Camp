package nLayerRegisterAndLogin.JEmailVerification;

import nLayerRegisterAndLogin.Entities.concrete.User;

public class JEmailVerificationManager {

	public void log(User user) {
		System.out.println(user.geteMail() + ": adresine JEmailVerification ile doðrulama gönderildi");
	}
}
