package nLayeredDemoTekrar;

import nLayeredDemoTekrar.business.abstracts.ProductService;
import nLayeredDemoTekrar.business.concrete.ProductManager;
import nLayeredDemoTekrar.core.concrete.JLoggerManagerAdapter;
import nLayeredDemoTekrar.dataAccess.concrete.HibernateProductDao;
import nLayeredDemoTekrar.entities.concrete.Product;

public class Main {

	public static void main(String[] args) {

		ProductService productService = new ProductManager(new HibernateProductDao(), new JLoggerManagerAdapter());
		Product product = new Product(2, 1, "Araba", 100, 5);
		productService.add(product);
	}

}
