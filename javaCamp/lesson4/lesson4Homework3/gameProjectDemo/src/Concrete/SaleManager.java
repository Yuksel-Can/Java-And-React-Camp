package Concrete;

import Abstracts.SaleService;
import Entities.Product;
import Entities.User;

public class SaleManager implements SaleService{

	@Override
	public void sale(Product product, User user) {
		
		System.out.println(product.getName()+ " isimli oyun, "+product.getCurrentPrice()+" fiyatý ile "+user.getUserName()+" isimli kullanýcý tarafýndan satýn alýndý");
		
	}

}
