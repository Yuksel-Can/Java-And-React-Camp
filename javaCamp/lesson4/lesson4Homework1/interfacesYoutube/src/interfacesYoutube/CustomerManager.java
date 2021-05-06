package interfacesYoutube;
public class CustomerManager {

	private ICustomerDal customerDal;
	
	public CustomerManager(ICustomerDal customerDal) {
		this.customerDal = customerDal;
	}
	
	public void add() {
		//dal içinde de add vardý buradakinin farký iþ kodlarý yazýlýr
		//yani þartlarý saðlýyormu ortam uygunmu kontrol edilir.
	
		customerDal.add();
	}
}
