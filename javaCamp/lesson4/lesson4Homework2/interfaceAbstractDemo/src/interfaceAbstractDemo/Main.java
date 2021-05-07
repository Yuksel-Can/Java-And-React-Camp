package interfaceAbstractDemo;

import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarbuckCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {

		BaseCustomerManager customerManager = new StarbuckCustomerManager(new MernisServiceAdapter());
		customerManager.save(new Customer(1,"mürsel", "özdemir","1976","10315032184"));

	}

}
