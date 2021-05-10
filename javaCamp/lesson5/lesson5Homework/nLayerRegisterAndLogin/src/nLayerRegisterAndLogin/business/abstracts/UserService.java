package nLayerRegisterAndLogin.business.abstracts;

import java.util.List;

import nLayerRegisterAndLogin.Entities.concrete.User;

public interface UserService {

	void add(User user);
	void update(User user);
	void delete(User user);
	User get(int id);
	List<User> getAll();
}
