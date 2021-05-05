
public class Main {

	public static void main(String[] args) {

		
		Student student1 = new Student( new String[2]);
		student1.setId(1);
		student1.setFirstName("Can");
		student1.setLastName("Yuksel");
		student1.setCourses(0, "Java");
		student1.setCourses(1, "C#");
		
		System.out.println(student1.getId());
		System.out.println(student1.getFirstName());
		System.out.println(student1.getLastName());
		System.out.println(student1.getUserName());
		System.out.println(student1.getCourseCount());
		String courses[]=student1.getCourses();
		for(String course : courses) {
			System.out.println(course);
		}
		
		CRUD crud = new CRUD(new StudentManager());
		crud.add(student1);
		crud.delete(student1);

		System.out.println("//////////////////////////");

		Instructor instructor1 = new Instructor(1, "JAVA");
		instructor1.setId(2);
		instructor1.setFirstName("Engin");
		instructor1.setLastName("Demirog");
		
		System.out.println(instructor1.getId());
		System.out.println(instructor1.getFirstName());
		System.out.println(instructor1.getLastName());
		System.out.println(instructor1.getUserName());
		System.out.println(instructor1.getTeachCourseCount());
		System.out.println(instructor1.getCourseLanguage());

		CRUD crud2 = new CRUD(new InstructorManager());
		crud2.add(instructor1);
		crud2.delete(instructor1);
		
		System.out.println("//////////////////////////");
		
	}

}
