package interfacesYoutube;
public class CustomerManager {

	private ICustomerDal customerDal;
	
	public CustomerManager(ICustomerDal customerDal) {
		this.customerDal = customerDal;
	}
	
	public void add() {
		//dal i�inde de add vard� buradakinin fark� i� kodlar� yaz�l�r
		//yani �artlar� sa�l�yormu ortam uygunmu kontrol edilir.
	
		customerDal.add();
	}
}
