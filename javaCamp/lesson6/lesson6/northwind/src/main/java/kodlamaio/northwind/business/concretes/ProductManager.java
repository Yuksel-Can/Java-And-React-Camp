package kodlamaio.northwind.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.northwind.business.abstracts.ProductService;
import kodlamaio.northwind.dataAccess.abstracts.ProductDao;
import kodlamaio.northwind.entities.concretes.Product;

@Service			//bu projede bu class service görevi(yani business) görecek manasında yazılır.zorunludur.
public class ProductManager implements ProductService{

	private ProductDao productDao;
	
					//bu bizim productDao class'ımızla arkada oluşturduğu ürettiği,
	@Autowired		//örneğin MysqlDao gibi. onu bileştiriyor
	public ProductManager(ProductDao productDao) {
		this.productDao = productDao;
	}
	
	@Override
	public List<Product> getAll() {
		
		
		return this.productDao.findAll();		//findAll() data vermeden bütün dataları getiriyor.
	}

}
