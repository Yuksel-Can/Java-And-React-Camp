package Abstracts;

import java.rmi.RemoteException;

import Entities.User;

public interface UserService {

	void save(User user) throws NumberFormatException, RemoteException;
	void update(User user, BaseChange baseChange, String value);
	void delete(User user);
}
