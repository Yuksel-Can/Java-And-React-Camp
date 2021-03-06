package Concrete;

import Abstracts.ProductService;
import Entities.Product;
import Entities.User;

public class ProductManager implements ProductService{

	@Override
	public void save(User user, Product product) {

		System.out.println(product.getName() + ", isimli oyun " + user.getUserName() + " kullanıcı tafarından satışa çıkartıldı");
	}
	
	@Override
	public void updatePrice(User user, Product product, double price) {

		product.setReelPrice(price);
		System.out.println(product.getName() + ", isimli oyunun " + user.getUserName() + " kullanıcısı tafarından fiyatı "+product.getReelPrice()+" olarak güncellendi");
	}

	@Override
	public void delete(User user, Product product) {

		System.out.println(product.getName() + ", isimli oyun " + user.getUserName() + " kullanıcısı tafarından satıştan kaldırıldı");
	}

	
}
