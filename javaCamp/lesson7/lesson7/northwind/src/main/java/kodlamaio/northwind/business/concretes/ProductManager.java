package kodlamaio.northwind.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.northwind.business.abstracts.ProductService;
import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.core.utilities.results.SuccessDataResult;
import kodlamaio.northwind.core.utilities.results.SuccessResult;
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
	public DataResult<List<Product>> getAll() {
		
		
		return new SuccessDataResult<List<Product>>
		(this.productDao.findAll(),"Data Listelendi");
	}

	@Override
	public Result add(Product product) {
		this.productDao.save(product);
		return new SuccessResult("Ürün eklendi");
	}

}
