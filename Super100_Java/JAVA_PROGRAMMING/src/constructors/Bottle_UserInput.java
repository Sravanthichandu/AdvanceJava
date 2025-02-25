package constructors;

public class Bottle_UserInput {
	String brand;
	String color;
	int cost;
	int capacity;
	String type;
		
	public Bottle(String brand ,String color,int cost ,int capacity,String type)
	{
		if(brand.equals("Milton") ||brand.equals("Cello")||brand.equals("Tupperwear") )
		{
			   this.brand = brand;
		}
		else
		{
				System.out.println("Invalid brand , can't initialize ");
		}
			
			if(color.equals("Red") || color.equals("Black") || color.equals("Blue"))
			{
				this.color=color;
			}
			else
			{
				System.out.println("Invalid color, can't initialize");
			}
			if(cost >= 500 && cost<=1500 )
			{
				this.cost=cost;
				
			}
			else
			{
				System.out.println("Invalid cost , ca;t initialize ");
			}
			if(capacity >=1 && capacity<=5)
			{
				this.capacity=capacity;
			}
			else
			{
				System.out.println("Invalid capacity , ca;t initialize ");
			}
			if(type.equals("Silver") || type.equals("Copper") || type.equals("plastic"))
			{
				this.type = type;
			}
			else
			{
				System.out.println("Invalid type , ca;t initialize ");
			}
				
			
		}
		public void display()
		{
			System.out.println(" brand : "+brand);
			System.out.println(" color : "+color);
			System.out.println(" cost : "+cost);
			System.out.println(" capacity : "+capacity);
			System.out.println(" type     : "+type);
			
		}
		public static void main(String[] args) {
			
			Bottle b1 = new Bottle("Milton" ,"Black", 500 ,5 , "Silver");
			b1.display();
		}

	}
