package Abstracts;

import Entities.Product;
import Entities.User;

public interface ProductService {

	void save(User user, Product product);
	void updatePrice(User user, Product product, double price);
	void delete(User user, Product product);
}
