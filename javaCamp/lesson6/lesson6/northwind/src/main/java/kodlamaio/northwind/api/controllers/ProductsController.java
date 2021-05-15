package kodlamaio.northwind.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.northwind.business.abstracts.ProductService;
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
	public List<Product> getAll(){ 
		//çalışması için => kodlama.io/api/products/getall    adresine gidilmelidir.
		
		return this.productService.getAll();
	}
}
