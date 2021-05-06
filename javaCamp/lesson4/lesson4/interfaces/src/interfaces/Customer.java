package interfaces;

public class Customer {

	private int id;
	private String firstName;
	private String latsName;
	
	public Customer() {
		
	}
	public Customer(int id, String firstName, String latsName) {
		//super();			//bu super bunun miras ald��� parametresiz contructor varsa onuda �al��t�r�r.
		this.id = id;
		this.firstName = firstName;
		this.latsName = latsName;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLatsName() {
		return latsName;
	}
	public void setLatsName(String latsName) {
		this.latsName = latsName;
	}
}
