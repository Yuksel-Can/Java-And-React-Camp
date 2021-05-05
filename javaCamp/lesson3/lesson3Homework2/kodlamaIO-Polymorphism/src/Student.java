
public class Student extends User {

	private String[] courses;
	private int courseCount;
	
	public Student() {
		System.out.println("Student Eklendi");
	}
	
	public Student(String[] courses) {
		super();
		this.courses = courses;
	}
	
	public String[] getCourses() {
		return courses;
	}
	public void setCourses(int index,String course) {
		this.courses[index] = course;
	}
	public int getCourseCount() {
		courseCount = courses.length;
		return courseCount;
	}
}
