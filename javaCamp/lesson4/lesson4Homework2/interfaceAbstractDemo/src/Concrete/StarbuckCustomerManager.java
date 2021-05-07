package Concrete;

import java.rmi.RemoteException;

import Abstract.BaseCustomerManager;
import Abstract.ICustomerCheckService;
import Entities.Customer;

public class StarbuckCustomerManager extends BaseCustomerManager {
	//implements ICustomerCheckService
	private ICustomerCheckService customerCheckService;
	
	public StarbuckCustomerManager(ICustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}
	@Override
	public void save(Customer customer) throws RemoteException{
			if(customerCheckService.CheckIfRealPerson(customer)) {
				//save(customer);
				System.out.println(customer.getFirstName() + " " + customer.getLastName() + " , veritaban�na ba�ar�yla eklendi");
			}else {
				System.out.println("Kay�t edilemedi.");
			}
		
	}

}
