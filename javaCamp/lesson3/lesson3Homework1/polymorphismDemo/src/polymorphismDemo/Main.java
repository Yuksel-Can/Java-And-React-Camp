package polymorphismDemo;

public class Main {

	public static void main(String[] args) {

		/*
		BaseLogger[] baseLoggers = {
				new FileLogger(),
				new DatabaseLogger(),
				new EmailLogger(),
				new ConsoleLogger()
		};
		
		for (BaseLogger baseLogger : baseLoggers) {
			baseLogger.Log("Metin1");
		}
		*/
		CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
		customerManager.add();
	}

}
