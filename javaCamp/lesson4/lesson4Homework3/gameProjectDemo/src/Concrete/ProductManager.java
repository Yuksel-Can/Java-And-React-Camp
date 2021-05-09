package Concrete;

import Abstracts.ProductService;
import Entities.Product;
import Entities.User;

public class ProductManager implements ProductService{

	@Override
	public void save(User user, Product product) {

		System.out.println(product.getName() + ", isimli oyun " + user.getUserName() + " kullanýcý tafarýndan satýþa çýkartýldý");
	}
	
	@Override
	public void updatePrice(User user, Product product, double price) {

		product.setReelPrice(price);
		System.out.println(product.getName() + ", isimli oyunun " + user.getUserName() + " kullanýcýsý tafarýndan fiyatý "+product.getReelPrice()+" olarak güncellendi");
	}

	@Override
	public void delete(User user, Product product) {

		System.out.println(product.getName() + ", isimli oyun " + user.getUserName() + " kullanýcýsý tafarýndan satýþtan kaldýrýldý");
	}

	
}
