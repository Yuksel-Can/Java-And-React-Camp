package Concrete;

import Abstracts.ProductService;
import Entities.Product;
import Entities.User;

public class ProductManager implements ProductService{

	@Override
	public void save(User user, Product product) {

		System.out.println(product.getName() + ", isimli oyun " + user.getUserName() + " kullan�c� tafar�ndan sat��a ��kart�ld�");
	}
	
	@Override
	public void updatePrice(User user, Product product, double price) {

		product.setReelPrice(price);
		System.out.println(product.getName() + ", isimli oyunun " + user.getUserName() + " kullan�c�s� tafar�ndan fiyat� "+product.getReelPrice()+" olarak g�ncellendi");
	}

	@Override
	public void delete(User user, Product product) {

		System.out.println(product.getName() + ", isimli oyun " + user.getUserName() + " kullan�c�s� tafar�ndan sat��tan kald�r�ld�");
	}

	
}
