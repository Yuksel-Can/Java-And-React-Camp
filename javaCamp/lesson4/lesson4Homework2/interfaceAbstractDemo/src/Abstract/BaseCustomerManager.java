package Abstract;

import java.rmi.RemoteException;

import Entities.Customer;

public abstract class BaseCustomerManager implements ICustomerService{

	@Override
	public void save(Customer customer) throws RemoteException{

		System.out.println("Saved to db : " + customer.getFirstName());
	}

}
