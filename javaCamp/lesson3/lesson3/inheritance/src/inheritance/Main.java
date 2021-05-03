package inheritance;

public class Main {

	public static void main(String[] args) {
		
		IndividualCustomer osman = new IndividualCustomer();
		osman.setCustomerNumber("123");
		
		CorporateCustomer hepsiBurada = new CorporateCustomer();
		hepsiBurada.setCustomerNumber("456");
		
		SendikaCustomer sendika = new SendikaCustomer();
		sendika.setCustomerNumber("789");
		
		Customer[]	customers = {osman, hepsiBurada, sendika};
		
		CustomerManager customerManager = new CustomerManager();
		customerManager.addMultiple(customers);

	}

}
