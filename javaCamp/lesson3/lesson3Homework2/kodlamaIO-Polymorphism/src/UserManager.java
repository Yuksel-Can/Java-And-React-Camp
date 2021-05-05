
public class UserManager {

	public void add(User user) {
		System.out.println(user.getUserName() + ", default sisteme eklendi" );
	}
	
	public void delete(User user) {
		System.out.println(user.getUserName() + ", default sistemden silindi" );
	}
}
