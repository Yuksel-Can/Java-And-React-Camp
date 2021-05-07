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
	public void save(Customer customer) {
		try {
			if(customerCheckService.CheckIfRealPerson(customer)) {
				save(customer);
				System.out.println("baþarýlý");
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			System.out.println("baþarýsýz1");
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("baþarýsýz2");
		}
		//throw new Exception("Not a valid person");
		//CheckIfRealPerson(customer);
		//System.out.println("Saved to db : " + customer.getFirstName());
	}

}
