package oopIntro;

public class Main {

	public static void main(String[] args) {

		
		
		Product product1 = new Product(1, "Lenovo V14", 15000, "16 GB Ram",10.5);
	
		
		Product product2 = new Product();
		
		product2.setId(2);
		product2.setName("Lenovo V15");
		product2.setUnitPrice(16000);
		product2.setDetail("16 GB Ram");
		product2.setDiscount(10);
		
		//Product product3 = new Product();

		Product[] products = {product1, product2};
		for(Product product : products) {
			
			System.out.println(product.getName()+" indirim li hali : "+product.getUnitPriceAfterDiscount());
		}
		System.out.println(products.length);
		
		
		Category category1 = new Category();
		category1.setId(1);
		category1.setName("Bilgisayar");
		
		Category category2 = new Category();
		category2.setId(2);
		category2.setName("ev/Bahçe");
		
		////////////////////////
		ProductManager productManager= new ProductManager();
		for(Product product : products) {
			productManager.addToCart(product);
		}
	}

}
//41:05
