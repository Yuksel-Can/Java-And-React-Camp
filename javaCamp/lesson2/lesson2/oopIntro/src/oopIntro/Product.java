package oopIntro;

public class Product {

	int id; // identity
	String name;
	double unitPrice;
	String detail;

	public Product() {
		System.out.println("Ben �al��t�m");
	}

	public Product(int id, String name, double unitPrice, String detail) {
		
		this();		//her ne olursa olsun parametresizde �al��s�n kodudur.
			
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.detail = detail;
	}
}
