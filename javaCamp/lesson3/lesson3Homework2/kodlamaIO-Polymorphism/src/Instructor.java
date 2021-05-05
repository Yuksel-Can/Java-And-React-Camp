
public class Instructor extends User{

	private int teachCourseCount;
	private String courseLanguage;
	
	public Instructor() {
		
	}
	
	public Instructor(int teachCourseCount, String courseLanguage) {
		super();
		this.teachCourseCount = teachCourseCount;
		this.courseLanguage = courseLanguage;
	}
	
	public int getTeachCourseCount() {
		return teachCourseCount;
	}
	public void setTeachCourseCount(int teachCourseCount) {
		this.teachCourseCount = teachCourseCount;
	}
	public String getCourseLanguage() {
		return courseLanguage;
	}
	public void setCourseLanguage(String courseLanguage) {
		this.courseLanguage = courseLanguage;
	}
}
