package Concrete;

import java.rmi.RemoteException;
import java.util.Scanner;

import Abstracts.BaseChange;
import Abstracts.UserCheckService;
import Abstracts.UserService;
import Entities.User;

public class UserManager implements UserService{

	private UserCheckService checkService;
	
	public UserManager(UserCheckService checkService) {
		this.checkService = checkService;
	}

	@Override
	public void save(User user) throws NumberFormatException, RemoteException {

		if(checkService.checkIfRealPerson(user)) {
			System.out.println("Yeni �ye kayd� yap�lm��t�r, Kullan�c� Ad�: " + user.getUserName() + ", Ad� Soyad�: " + user.getFirstName() + " " + user.getLastName());
		}else {
			System.out.println("Kay�t ba�ar�s�z ! L�tfen bilgilerinizi kontrol ediniz !");
		}
	}

	@Override
	public void update(User user, BaseChange baseChange, String value) {
		
		/*
		System.out.println("-------------------------------------");
		System.out.println(user.getUserName() + ", kullan�c� adl� ki�inin hangi bilgisini de�i�tirmek istiyorsunuz ?");
		System.out.println("(1)-Kullan�c� Ad�,\n(2)-E-posta");
		
		Scanner value = new Scanner(System.in);
		String value2 = value.next();
		/*
		if(Integervalue == 1){
			
		}
		*/
		baseChange.change(user, value);
	}

	@Override
	public void delete(User user) {

		System.out.println(user.getUserName() + ", isimli kullan�c� ba�ar�l� bir �ekilde silindi!");
	}

}
