package lesson2Homework;

public class Menu {

	int id;
	String name;
	String url;
	
	public Menu() {
		System.out.println("Menu başarıyla oluşturuldu.");
	}
	public Menu(int id, String name, String url) {
		this();
		this.id=id;
		this.name=name;
		this.url=url;
			
	}
}
