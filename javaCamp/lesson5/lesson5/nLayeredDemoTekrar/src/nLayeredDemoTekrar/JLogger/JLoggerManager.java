package nLayeredDemoTekrar.JLogger;

import nLayeredDemoTekrar.entities.concrete.Product;

public class JLoggerManager {

	public void log(Product product, String message) {
		System.out.println("�r�n JLogger ile logland� : " + product.getName()+" mesaj : "+message);
	}
}
