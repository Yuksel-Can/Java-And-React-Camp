package Concrete;

import Abstracts.BaseChange;
import Entities.User;

public class UserNameChange implements BaseChange{

	@Override
	public void change(User user, String value) {
		String before= user.getUserName();
		user.setUserName(value);
		System.out.println(before + ", isimli kullan�c�n�n Kullan�c� ad�: " + user.getUserName() + " olarak g�ncellendi");
	}

}
