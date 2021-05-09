package nLayeredDemoTekrar.business.concrete;

import java.util.List;

import nLayeredDemoTekrar.business.abstracts.ProductService;
import nLayeredDemoTekrar.core.abstracts.JLoggerService;
import nLayeredDemoTekrar.dataAccess.abstracts.ProductDao;
import nLayeredDemoTekrar.entities.concrete.Product;

public class ProductManager implements ProductService{

	ProductDao productDao;
	JLoggerService jLoggerService;
	
	public ProductManager(ProductDao productDao, JLoggerService jLoggerService) {
		this.productDao = productDao;
		this.jLoggerService = jLoggerService;
	}
	
	@Override
	public void add(Product product) {

		if(product.getId()==1) {
			System.out.println("Bu ürün deðiþtirilemez");
			return ;
		}
		this.productDao.add(product);
		this.jLoggerService.logToSystem(product, "successful");
		
		
	}

	@Override
	public List<Product> getAll() {
		
		return null;
	}

}
