package constructors;

public class Bag {
	
	String brand;
	int cost;
	String color;    //global variables
	int capacity;
	String type;
	
	public Bag(String brand , int cost , String color ,int capacity, String type)//local variables
	{
		//global variable name = local variable;
		brand = brand ;
		cost  = cost;
		color = color;
		capacity= capacity;
		type  = type;
	}
	public void show()
	{
		System.out.println("....Bag Details....");
		System.out.println("Brand    : "+brand);
		System.out.println("Cost     : "+cost);
		System.out.println("Color    : "+color);
		System.out.println("Capacity : "+capacity);
		System.out.println("Type     : "+type);
	}

	public static void main(String[] args) {
		
		Bag b1 = new Bag("SkyBags",2000,"black",5,"leather");
		b1.show();
	}

}
/*
 * 
 * Here local variables and global variable names are same 
 * so  local variables dominating global variables  
 * local variables not initiliazing original values to global variables
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * */
