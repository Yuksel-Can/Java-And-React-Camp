package nLayerRegisterAndLogin.dataAccess.abstracts;

import java.util.List;

import nLayerRegisterAndLogin.Entities.concrete.User;

public interface UserDao {
	
	void add(User user);
	void update(User user);
	void delete(User user);
	User getUser(int id);
	List<User> getAll();
}
