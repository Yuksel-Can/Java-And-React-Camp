package Concrete;

import Abstracts.UserCheckService;
import Entities.User;

public class UserCheckManager implements UserCheckService{

	@Override
	public boolean checkIfRealPerson(User user) {

		return true;
	}

}
