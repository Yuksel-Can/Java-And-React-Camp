package nLayerRegisterAndLogin.core.concrete;

import nLayerRegisterAndLogin.Entities.concrete.User;
import nLayerRegisterAndLogin.JEmailVerification.JEmailVerificationManager;
import nLayerRegisterAndLogin.core.abstracts.JEmailVerificaitonService;

public class JEmailVerificationAdapter implements JEmailVerificaitonService{

	@Override
	public void log(User user) {

		JEmailVerificationManager sender = new JEmailVerificationManager();
		sender.log(user);
	}

}
