package lesson2Homework;

public class Course {
	
	int id;
	String name;
	double coursePrice;
	String instructor;
	String description;

	public Course() {
		System.out.println("Kurs baþarýyla oluþturuldu.");
	}
	public Course(int id, String name, double coursePrice, String instructor, String description) {
		this();
		this.id=id;
		this.name=name;
		this.coursePrice=coursePrice;
		this.instructor=instructor;
		this.description=description;
		
	}
}
