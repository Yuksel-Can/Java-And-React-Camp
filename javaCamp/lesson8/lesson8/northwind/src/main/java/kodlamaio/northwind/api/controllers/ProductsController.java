package kodlamaio.northwind.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.northwind.business.abstracts.ProductService;
import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.entities.concretes.Product;

@RestController			//sen RestController'sın dedik.Tüm yönetimler için bir controller olabilir.
@RequestMapping("/api/products")		//sisteme böyle bir istek gelirse bu class karşılıycak demektir.
public class ProductsController {	//Nesnenin sonuna 's' eklenir
	//iletişim class'ıdır.
	
	private ProductService productService;
	
	@Autowired  //prjeyi tarar productService i implement edeni bulur ve ProductManager p = new ProductManager yapar. Sonra geliyor
	public ProductsController(ProductService productService) {	//buradaki prudoctService değişkenine ekliyor.
	super();
	this.productService = productService;
	}


	@GetMapping("/getall")		//veri istemeye getRequest denilir.Yazılan adrese gidilirse bu metod çalışır
	public DataResult<List<Product>> getAll(){ 
		//çalışması için => kodlama.io/api/products/getall    adresine gidilmelidir.
		
		return this.productService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody Product product) {
		
		return this.productService.add(product);
	}
	
	@GetMapping("/getByProductName")
	public DataResult<Product> getByProductName(@RequestParam String productName){
		return this.productService.getByProductName(productName);
	}
	
	@GetMapping("/getByProductNameAndCategory_CategoryId")
	public DataResult<Product> getByProductNameAndCategory_CategoryId(@RequestParam("productName") String productName, @RequestParam("categoryId") int categoryId){
		return this.productService.getByProductNameAndCategory_CategoryId(productName, categoryId);
	}

	@GetMapping("/getByProductNameOrCategory_CategoryId")
	DataResult<List<Product>> getByProductNameOrCategory_CategoryId(@RequestParam String productName, @RequestParam int categoryId){
		return this.productService.getByProductNameOrCategory_CategoryId(productName, categoryId);
	}
	/*
	@GetMapping("/getByCategoryIn")		
	DataResult<List<Product>> getByCategoryIn(@RequestParam List<Integer> categories){
		return this.productService.getByCategoryIn(categories);
	}
	*/
	
	@GetMapping("/getByProductNameContains")
	DataResult<List<Product>> getByProductNameContains(@RequestParam String productName){
		return this.productService.getByProductNameContains(productName);
	}

	@GetMapping("/getByProductNameStartsWith")
	DataResult<List<Product>> getByProductNameStartsWith(@RequestParam String productName){
		return this.productService.getByProductNameStartsWith(productName);
	}
	
	@GetMapping("/getByProductNameEndsWith")
	DataResult<List<Product>> getByProductNameEndsWith(@RequestParam String productName){
		return this.productService.getByProductNameEndsWith(productName);
	}
	
	@GetMapping("/getByNameAndCategory")
	DataResult<List<Product>> getByNameAndCategory(@RequestParam String productName, @RequestParam int categoryId){
		return this.productService.getByNameAndCategory(productName, categoryId);
	}
	
	@GetMapping("/getAllByPage")
	DataResult<List<Product>> getAll(int pageNo, int pageSize){
		return this.productService.getAll(pageNo, pageSize);
	}
	@GetMapping("/getAllDesc")
	public DataResult<List<Product>> getAllSorted() {
		return this.productService.getAllSorted();
	}
}
