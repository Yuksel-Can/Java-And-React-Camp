
public class InstructorManager extends UserManager{

	public void add(User user) {
		System.out.println(user.getUserName() + ", E�itmen sisteme eklendi" );
	}
	
	public void delete(User user) {
		System.out.println(user.getUserName() + ", E�itmen sistemden silindi" );
	}
}
