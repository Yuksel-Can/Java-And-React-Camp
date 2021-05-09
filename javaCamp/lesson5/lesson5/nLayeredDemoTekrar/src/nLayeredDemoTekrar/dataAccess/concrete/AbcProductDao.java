package nLayeredDemoTekrar.dataAccess.concrete;

import java.util.List;

import nLayeredDemoTekrar.dataAccess.abstracts.ProductDao;
import nLayeredDemoTekrar.entities.concrete.Product;

public class AbcProductDao implements ProductDao{

	@Override
	public void add(Product product) {

		System.out.println("Ürün Abc ile baþarýyla eklendi : " + product.getName());
	}

	@Override
	public void update(Product product) {

		System.out.println("Ürün Abc ile baþarýyla güncellendi : " + product.getName());
		
	}

	@Override
	public void delete(Product product) {
		System.out.println("Ürün Abc ile baþarýyla silindi : " + product.getName());
	}

	@Override
	public Product get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
