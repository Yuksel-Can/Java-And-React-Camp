
public class CRUD {

	private UserManager userManager;	
	private User user;
	
	public CRUD(UserManager userManager) {
		this.userManager = userManager;
	}
	
	public void add(User user) {
		this.userManager.add(user);
	}
	
	public void delete(User user) {
		this.userManager.delete(user);
	}
}
