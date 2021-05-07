package interfaceAbstractDemo;

import java.rmi.RemoteException;

import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarbuckCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) throws RemoteException {

		BaseCustomerManager customerManager = new StarbuckCustomerManager(new MernisServiceAdapter());
		customerManager.save(new Customer(1,"Y�ksel Can", "�zdemir","1998","12345678910"));

	}

}
