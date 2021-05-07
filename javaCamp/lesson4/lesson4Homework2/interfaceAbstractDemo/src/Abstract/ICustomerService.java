package Abstract;

import java.rmi.RemoteException;

import Entities.Customer;

public interface ICustomerService {

	void save(Customer customer) throws RemoteException;
}
