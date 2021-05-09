package nLayeredDemoTekrar.JLogger;

import nLayeredDemoTekrar.entities.concrete.Product;

public class JLoggerManager {

	public void log(Product product, String message) {
		System.out.println("Ürün JLogger ile loglandý : " + product.getName()+" mesaj : "+message);
	}
}
