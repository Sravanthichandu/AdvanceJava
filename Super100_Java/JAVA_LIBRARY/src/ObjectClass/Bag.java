
package ObjectClass;

public class Bag {

	private String brand;
	private int cost;
	private int capacity;
	private String type;
	
	public Bag()
	{
		
	}
	public Bag(String brand,int cost,int capacity,String type)
	{
		this.brand=brand;
		this.cost=cost;
		this.capacity=capacity;
		this.type=type;
	}
	public void setbrand(String brand)
	{
		this.brand=brand;
	}
	public String getbrand()
	{
		return brand;
	}
	public void setcost(int cost)
	{
		this.cost=cost;
	}
	public int getcost()
	{
		return cost;
	}
	public void setcapacity(int capacity)
	{
		this.capacity=capacity;
	}
	public int getcapacity()
	{
		return capacity;
	}
	public void settype(String type)
	{
		this.type=type;
	}
	public String gettype()
	{
		return type;
	}
	
	public void display()
	{
		System.out.println("Brand : "+getbrand());
		System.out.println("Cost : "+getcost());
		System.out.println("capacity : "+getcapacity());
		System.out.println("Type : "+gettype());
	}
	@Override
	public String toString()
	{
		return "brand: " +getbrand()+"\n"+"cost: "+getcost()+"\n"+"capacity : "+getcapacity();
	}
	@Override
	public boolean equals(Object o)
	{
		Bag bag=(Bag)o;	
		return this.getcost()==bag.getcost() && this.gettype().equals(gettype());
	}
	@Override
	public int hashCode()
	{
		return getcost();
	}
}
