package interfaces;

public class CustomerManager {
	
	private Logger[] loggers;		//neye baðlýysak ona deðiþken tanýmlanýr.
	
	
	public CustomerManager(Logger[] loggers) {
		this.loggers = loggers;
	}
	
	
	
	//loosly - tightly coupled
	public void add(Customer customer) {
		System.out.println("Müþteri eklendi : " + customer.getFirstName());
		
		Utils.runLoggers(loggers, customer.getFirstName() ); // runLoggers metodu static olduðu için class ismi ile çaðýrabiliriz
	}
	public void delete(Customer customer) {
		System.out.println("Müþteri silindi : " + customer.getFirstName());
		
		Utils.runLoggers(loggers, customer.getLatsName() );
	}
	
	
}
