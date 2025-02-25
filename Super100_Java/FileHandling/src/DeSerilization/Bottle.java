package DeSerilization;

import java.io.Serializable;

public class Bottle implements Serializable
{

	private String bottleBrand ;
	private int cost;
	private String bottletype;
	
	public Bottle()
	{
		
	}

	public Bottle(String bottleBrand, int cost, String bottletype) {
		
		this.bottleBrand = bottleBrand;
		this.cost = cost;
		this.bottletype = bottletype;
	}

	public String getBottleBrand() {
		return bottleBrand;
	}

	public void setBottleBrand(String bottleBrand) {
		this.bottleBrand = bottleBrand;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public String getBottletype() {
		return bottletype;
	}

	public void setBottletype(String bottletype) {
		this.bottletype = bottletype;
	}
	
	public void display()
	{
		System.out.println("BottleBrand :"+getBottleBrand());
		System.out.println("BottleCost : "+getCost());
		System.out.println("Bottletype : "+getBottletype());
		
	}
	
	
	
}
