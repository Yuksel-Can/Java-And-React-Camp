package interfaces;

public class CustomerManager {
	
	private Logger[] loggers;		//neye ba�l�ysak ona de�i�ken tan�mlan�r.
	
	
	public CustomerManager(Logger[] loggers) {
		this.loggers = loggers;
	}
	
	
	
	//loosly - tightly coupled
	public void add(Customer customer) {
		System.out.println("M��teri eklendi : " + customer.getFirstName());
		
		Utils.runLoggers(loggers, customer.getFirstName() ); // runLoggers metodu static oldu�u i�in class ismi ile �a��rabiliriz
	}
	public void delete(Customer customer) {
		System.out.println("M��teri silindi : " + customer.getFirstName());
		
		Utils.runLoggers(loggers, customer.getLatsName() );
	}
	
	
}
