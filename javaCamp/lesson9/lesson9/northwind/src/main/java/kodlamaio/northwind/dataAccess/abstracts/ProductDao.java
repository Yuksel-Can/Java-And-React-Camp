package kodlamaio.northwind.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import kodlamaio.northwind.entities.concretes.Product;
import kodlamaio.northwind.entities.dtos.ProductWithCategoryDto;

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
	//select * from Category c inner join Product p on c.categoryId = p.categoryId
	//güncellersek(* yerine ne istediğimizi yazarsak)
	//select p.productId, p.productName, c.categoryName from Category c inner join Product p on c.categoryId = p.categoryId
	//jpql
	//her zaman OneToMany ilerle yani ana tablodan ilerle yani önce category(one olduğu için) sonra product(many old için)(alt satırda yazdım)
	@Query("Select new kodlamaio.northwind.entities.dtos.ProductWithCategoryDto(p.id, p.productName, c.categoryName) From Category c Inner Join c.products p")
	//on koşulu jpql de yazılması gerekmiyor
	List<ProductWithCategoryDto> getProductWithCategoryDetails();
	
}
