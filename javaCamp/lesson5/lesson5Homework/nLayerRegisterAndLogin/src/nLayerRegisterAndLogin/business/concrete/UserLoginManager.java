package nLayerRegisterAndLogin.business.concrete;

import nLayerRegisterAndLogin.business.abstracts.UserLoginService;
import nLayerRegisterAndLogin.core.abstracts.AuthLoginService;

public class UserLoginManager implements UserLoginService{

	AuthLoginService authLoginService;
	
	public UserLoginManager(AuthLoginService authLoginService) {
		this.authLoginService=authLoginService;
	}
	@Override
	public void login(String email, String password) {

		if(email.isEmpty() || password.isEmpty()) {
			System.out.println("Email yada þifre boþ olamaz");
			return ;
		}
		authLoginService.login(email, password);
	}

}
