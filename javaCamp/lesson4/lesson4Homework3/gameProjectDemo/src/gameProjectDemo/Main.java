package gameProjectDemo;

import java.rmi.RemoteException;

import Adapters.MernisServiceAdapter;
import Concrete.CampaignManager;
import Concrete.EmailChange;
import Concrete.ProductManager;
import Concrete.SaleManager;
import Concrete.UserManager;
import Entities.Campaign;
import Entities.Product;
import Entities.User;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, RemoteException {

		UserManager userManager = new UserManager(new MernisServiceAdapter());
		User user1 = new User(1,"Yüksel Can", "Özdemir", "1998", "12345678910", "CanYuksel","yukselcanozdemir@gmail.com");
		userManager.save(user1);
		userManager.update(user1,new EmailChange(),"Osman");
		userManager.delete(user1);
		
		//--------------------------------------
		ProductManager productManager = new ProductManager();
		Product product1 = new Product(1,"Forza Horizon 4", "Race", 1000);
		productManager.save(user1,product1);
		productManager.updatePrice(user1, product1, 990);
		productManager.updatePrice(user1, product1, 1000);
		productManager.delete(user1, product1);
		//---------------------------------------
		CampaignManager campaignManager = new CampaignManager();
		Campaign campaign = new Campaign(1,"Ürünlerde %10 indirim", 10);
		campaignManager.add(campaign, product1);
		campaignManager.delete(campaign,product1);
		//---------------------------------------
		SaleManager sale1 = new SaleManager();
		sale1.sale(product1, user1);
		
	}

}
