
public class InstructorManager extends UserManager{

	public void add(User user) {
		System.out.println(user.getUserName() + ", Eðitmen sisteme eklendi" );
	}
	
	public void delete(User user) {
		System.out.println(user.getUserName() + ", Eðitmen sistemden silindi" );
	}
}
