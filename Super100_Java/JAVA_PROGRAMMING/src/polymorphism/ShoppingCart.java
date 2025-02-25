package polymorphism;

public class ShoppingCart
{
	private String itemName;
	private int quality;
	private double price;
	
	public ShoppingCart() {}
	public ShoppingCart(String itemName,int quality,double price)
	{
		this.itemName=itemName;
		this.quality=quality;
		this.price=price;
	}
	public void setitemName(String itemName)
	{
		this.itemName=itemName;
	}
	public String getitemName() 
	{
		return itemName;
	}
	public void setquality(int quality)
	{
		this.quality=quality;
	}
	public int getquality()
	{
		return quality;
	}
	public void setprice(double price)
	{
		this.price=price;
	}
	public double getprice()
	{
		return price;
	}
	//method
	public double CalculateTotal(double price)
	{
		return quality*price;
	}
	//method overloading
	public double CalculateTotal(int discountPercentage)
	{
	    double discount =(price*discountPercentage)/100;
		return quality*(price-discount);	
	}
	//static method -- static binding
	public static void printWelcomeMessage()
	{
		System.out.println(" Welcome to the online shopping ");
	}
	//display method
	public void display()
	{
		System.out.println("ItemName           : " +getitemName());
		System.out.println("qantity            : " +getquality());
		System.out.println("Price              : " +CalculateTotal(price));
		System.out.println("DiscountPercentage : " +CalculateTotal(quality));
	}
}

