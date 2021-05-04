package polymorphismDemo;

public class CustomerManager {

	private BaseLogger logger;
	
	public CustomerManager(BaseLogger baseLogger) {
		this.logger = baseLogger;
	}
	
	public void add() {
		System.out.println("M��teri Eklendi");
		this.logger.log("Mesaj 1");
	}
}
