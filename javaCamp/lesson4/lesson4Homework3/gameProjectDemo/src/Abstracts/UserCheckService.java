package Abstracts;

import java.rmi.RemoteException;

import Entities.User;

public interface UserCheckService {
	
	boolean checkIfRealPerson(User user) throws NumberFormatException, RemoteException;
}
