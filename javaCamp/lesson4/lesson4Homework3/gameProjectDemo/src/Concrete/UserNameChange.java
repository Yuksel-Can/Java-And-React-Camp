package Concrete;

import Abstracts.BaseChange;
import Entities.User;

public class UserNameChange implements BaseChange{

	@Override
	public void change(User user, String value) {
		String before= user.getUserName();
		user.setUserName(value);
		System.out.println(before + ", isimli kullanýcýnýn Kullanýcý adý: " + user.getUserName() + " olarak güncellendi");
	}

}
