package constructors;

public class Mobile {
	
	String brand;
	int cost;
	
	public Mobile(String mobile_Brand,int mobile_Cost)
	{
		brand=mobile_Brand;
		cost = mobile_Cost;
	}
	public void display()
	{
		System.out.println("MobileBrand : "+brand);
		System.out.println("MobileCost  : "+cost);
	}

	public static void main(String[] args) {
		
		Mobile m = new Mobile("Nokia" , 1500);
		m.display();
		
	}

}
