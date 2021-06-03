package kodlamaio.northwind.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import kodlamaio.northwind.entities.concretes.Product;

public interface ProductDao extends JpaRepository<Product, Integer>{
	
	Product getByProductName(String productName);					//+product name i verilen değer olan satırı getirir
	
	Product getByProductNameAndCategory_CategoryId(String productName, int categoryId);	//+iki değerde sağlanıyorsa getirir
	
	List<Product> getByProductNameOrCategory_CategoryId(String productName, int categoryId);	//+iki değerden biri sağlanıyorsa yine getirir.  Yani hem onu hem onu getirir
	
	//List<Product> getByCategoryIn(List<Integer> categories);		//-Çalıştıramadım
	
	List<Product> getByProductNameContains(String productName);		//+içinde aranan string değeri geçenleri listeler

	List<Product> getByProductNameStartsWith(String productName);	//+bu değerle başlayanları listeler
	
	List<Product> getByProductNameEndsWith(String productName);		//+bu değerle bitenleri listeler
	
	@Query("From Product where productName=:productName and category.categoryId=:categoryId")
	List<Product> getByNameAndCategory(String productName, int categoryId);			//+verilen sorguya göre istediğimiz ismi verdiğimiz metod çalışır
	
	/*/*/
	
}
