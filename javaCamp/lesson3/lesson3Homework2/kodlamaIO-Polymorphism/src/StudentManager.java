
public class StudentManager extends UserManager{

	public void add(User user) {
		System.out.println(user.getUserName() + ", öðrenci sisteme eklendi" );
	}
	
	public void delete(User user) {
		System.out.println(user.getUserName() + ", öðrenci sistemden silindi" );
	}
}
