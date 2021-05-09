package nLayeredDemoTekrar.business.abstracts;

import java.util.List;

import nLayeredDemoTekrar.entities.concrete.Product;

public interface ProductService {

	void add(Product product);
	List <Product> getAll();
}
