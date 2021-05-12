package nLayerRegisterAndLogin;

import java.util.ArrayList;
import java.util.List;

import nLayerRegisterAndLogin.Entities.concrete.User;
import nLayerRegisterAndLogin.business.abstracts.UserLoginService;
import nLayerRegisterAndLogin.business.abstracts.UserService;
import nLayerRegisterAndLogin.business.concrete.UserLoginManager;
import nLayerRegisterAndLogin.business.concrete.UserManager;
import nLayerRegisterAndLogin.core.concrete.DefaultAuthLogin;
import nLayerRegisterAndLogin.core.concrete.JEmailVerificationAdapter;
import nLayerRegisterAndLogin.core.concrete.JGoogleAuthAdapter;
import nLayerRegisterAndLogin.core.concrete.JeMailValidatorAdapter;
import nLayerRegisterAndLogin.dataAccess.concrete.MySqlUserDao;
import nLayerRegisterAndLogin.dataAccess.concrete.OracleUserDao;

public class Main {

	public static ArrayList<String> users;
	public static void main(String[] args) {

		System.out.println("--------- Üyelik Ýþlemleri ----------");
		UserService userService = new UserManager(new MySqlUserDao(),new JeMailValidatorAdapter(), new JEmailVerificationAdapter());
		UserService userService2 = new UserManager(new OracleUserDao(),new JeMailValidatorAdapter(), new JEmailVerificationAdapter());
		User user = new User(1, "Y", "Özdemir", "yukselcanozdemir@gmail.com", "123456");
		User user2 = new User(1, "Yüksel Can", "Ö", "yukselcanozdemir@gmail.com", "123456");
		User user3 = new User(1, "Yüksel Can", "Özdemir", "yukselcanozdemir", "123456");
		User user4 = new User(1, "Yüksel Can", "Özdemir", "yukselcanozdemir@gmail.com", "123");
		User user5 = new User(1, "Yüksel Can", "Özdemir", "yukselcanozdemir@gmail.com", "123456");
		User user6 = new User(2, "Osman Can", "Ates", "osmancan@hotmail.com", "456789");
		
		User user7 = new User(1, "Ali", "Güneþ", "yukselcanozdemir@gmail.com", "444444");
		
		users= new ArrayList<String>();
		userService.add(user);
		userService.add(user2);
		userService.add(user3);
		userService.add(user4);
		userService.add(user5);
		
		userService2.add(user6);
		
		userService.add(user7);
		
		System.out.println("--------- Giriþ Ýþlemleri ----------");
		UserLoginService userLogin = new UserLoginManager(new DefaultAuthLogin());
		UserLoginService userLogin2 = new UserLoginManager(new JGoogleAuthAdapter());
		userLogin2.login("osmancan@hotmail.com", "456789");
		userLogin2.login("yukselcanozdemir@gmail.com", "123456");
		userLogin.login("osmancan@hotmail.com", "456789");
		
	}

}
