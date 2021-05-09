package Abstracts;

import Entities.Campaign;
import Entities.Product;

public interface CampaignService {

	void add(Campaign campaign, Product product);
	void update(Campaign campaign, Product product);
	void delete(Campaign campaign, Product product);
}
