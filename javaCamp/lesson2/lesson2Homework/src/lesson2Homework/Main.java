package lesson2Homework;

public class Main {

	public static void main(String[] args) {

		Course course1 = new Course(1,"Java",100,"Engin Demiroğ","Uygulamalı Java Eğitimi");
		Course course2 = new Course(2,"C#",80,"Engin Demiroğ","Uygulamalı C# Eğitimi");
		
		Menu menu1 = new Menu(1, "Kurslarım","https://www.kodlama.io/my-courses");
		Menu menu2 = new Menu(2,"Tüm Kurslar","https://www.kodlama.io/all-courses");
		
		Course[] courses = {course1,course2};
		CourseManager courseManager = new CourseManager();
		
		for(Course course : courses) {
			courseManager.add(course);
			courseManager.delete(course);
		}
		
		Menu[] menus = {menu1,menu2};
		MenuManager menuManager = new MenuManager();
		
		for(Menu menu : menus) {
			menuManager.add(menu);
			menuManager.delete(menu);
		}
	}

}
