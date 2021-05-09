package Entities;

import Abstracts.ProductService;

public class Product implements ProductService{

	private int id;
	private String name;
	private String category;
	private double currentPrice;
	private double reelPrice;
	
	public Product(int id, String name, String category, double currentPrice) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
		this.currentPrice = currentPrice;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
	public double getCurrentPrice() {
		return currentPrice;
	}

	public void setCurrentPrice(double currentPrice) {
		this.currentPrice = currentPrice;
	}

	public double getReelPrice() {
		return reelPrice;
	}

	public void setReelPrice(double reelPrice) {
		this.reelPrice = reelPrice;
	}


	@Override
	public void save(User user, Product product) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updatePrice(User user, Product product, double price) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(User user, Product product) {
		// TODO Auto-generated method stub
		
	}
}
