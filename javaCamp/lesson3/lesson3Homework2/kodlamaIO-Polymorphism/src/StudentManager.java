
public class StudentManager extends UserManager{

	public void add(User user) {
		System.out.println(user.getUserName() + ", ��renci sisteme eklendi" );
	}
	
	public void delete(User user) {
		System.out.println(user.getUserName() + ", ��renci sistemden silindi" );
	}
}
