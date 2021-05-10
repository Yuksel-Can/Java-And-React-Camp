package nLayerRegisterAndLogin.business.concrete;

import java.util.List;

import nLayerRegisterAndLogin.Main;
import nLayerRegisterAndLogin.Entities.concrete.User;
import nLayerRegisterAndLogin.business.abstracts.UserService;
import nLayerRegisterAndLogin.core.abstracts.JEmailVerificaitonService;
import nLayerRegisterAndLogin.core.abstracts.JeMailValidatorService;
import nLayerRegisterAndLogin.dataAccess.abstracts.UserDao;

public class UserManager implements UserService{

	UserDao userDao;
	JeMailValidatorService jeMailValidatorService;
	JEmailVerificaitonService jeMailVerificationService;
	
	public UserManager(UserDao userDao, JeMailValidatorService jeMailValidatorService, JEmailVerificaitonService jEmailVerificaitonService) {
		this.userDao = userDao;
		this.jeMailValidatorService = jeMailValidatorService;
		this.jeMailVerificationService = jEmailVerificaitonService;
	}
	
	@Override
	public void add(User user) {

		if(user.getFirstName().length()<2 || user.getLastName().length() < 2) {
			System.out.println("Kullan�c� Ad� veya Soyad� en az iki karakterden olu�mal�d�r");
			return ;
		}
		if(user.getPassword().length()<6) {
			System.out.println("Parola en az 6 karakterden olu�mal�d�r");
			return ;
		}
		if(!jeMailValidatorService.isValid(user.geteMail())) {
			System.out.println("Email hatal� yada eksik olmamal�d�r");
			return ;
		}
		if(Main.users.size() !=0) {
			if(Main.users.contains(user.geteMail())) {
				System.out.println(user.geteMail() + " : Bu mail adresi daha �nceden kay�tl�d�r");
				return ;
			}
		}
		this.jeMailVerificationService.log(user);
		System.out.println("Do�rulama ba�ar� ile ger�ekle�ti");
		Main.users.add(user.geteMail());
		userDao.add(user);
	}

	@Override
	public void update(User user) {

		System.out.println("Kullanc� bilgileri g�ncellendi");
	}

	@Override
	public void delete(User user) {


		System.out.println("Kullanc� bilgileri g�ncellendi");		
	}

	@Override
	public User get(int id) {

		return null;
	}

	@Override
	public List<User> getAll() {

		return null;
	}

}
