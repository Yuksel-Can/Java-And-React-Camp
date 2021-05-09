package Concrete;

import Abstracts.CampaignService;
import Entities.Campaign;
import Entities.Product;

public class CampaignManager implements CampaignService{

	@Override
	public void add(Campaign campaign, Product product) {
		
		System.out.println("Yeni Kampanya olu�turuldu: " + campaign.getCampaignName());
		product.setCurrentPrice((product.getReelPrice()*(100-campaign.getDiscountAmount()))/100);
		System.out.println("Kampanya sonras� " + product.getName()+" isimli �r�n�n yeni fiyat�: " + product.getCurrentPrice());
	}

	@Override
	public void update(Campaign campaign, Product product) {
		
		System.out.println("Kampanya g�ncellendi: : " + campaign.getCampaignName());
	}

	@Override
	public void delete(Campaign campaign, Product product) {
		
		System.out.println("Kampanya silindi: " + campaign.getCampaignName());
		product.setCurrentPrice(product.getReelPrice());
		System.out.println("Kampanya silinmesi sonras� " + product.getName()+" isimli �r�n�n yeni fiyat�: " + product.getCurrentPrice());

	}

}
