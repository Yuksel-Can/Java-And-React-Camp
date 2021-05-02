package lesson2Homework;

public class Main {

	public static void main(String[] args) {

		Course course1 = new Course(1,"Java",100,"Engin Demiro�","Uygulamal� Java E�itimi");
		Course course2 = new Course(2,"C#",80,"Engin Demiro�","Uygulamal� C# E�itimi");
		
		Menu menu1 = new Menu(1, "Kurslar�m","https://www.kodlama.io/my-courses");
		Menu menu2 = new Menu(2,"T�m Kurslar","https://www.kodlama.io/all-courses");
		
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
