package kodlamaio.northwind.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//import lombok.Data;

@Data		//bu lombok için
@Entity		//Bu hareketle product bir entity dir dedik
			//yani bu bir veri tabanı nesnesidir dedik
@AllArgsConstructor			//contructor oluşturmak için kullandık
@NoArgsConstructor			//parametresiz constructor oluşturmak için kullandık
@Table(name = "products")	//diyerek bu nesnenin veri tabanında
							//hangi tabloya ait olduğunu söylüyoruz
public class Product {
	@Id			//id'yi bu id'dir diye belirtmemiz gerekiyor
	@GeneratedValue(strategy = GenerationType.IDENTITY)	//buda id'nin nasıl artırılacağını söylememiz gerekiyor.GeneratedValue = bir bir artırılacak demektir.
	@Column(name="product_id")		//buda hangi kolona karşılık geldiğini ifade etmek açamlıdır
	private int id;
	
	/*
	@Column(name="category_id")		//hangi alan kime ait onu verdik
	private int categoryId;
	*/
	
	@Column(name="product_name")
	private String productName;
	
	@Column(name="unit_price")
	private double unitPrice;
	
	@Column(name="units_in_stock")
	private short unitsInStock;
	
	@Column(name="quantity_per_unit")
	private String quantityPerUnit;
	
	@ManyToOne()
	@JoinColumn(name="category_id")
	private Category category;
}
