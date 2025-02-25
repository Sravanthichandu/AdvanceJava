package constructors;

import java.util.Scanner;

public class Bottle_UsingUserInput {
	
	String bottle_brand ;
	String color;
	String type;
	int capacity;
	int cost;
    
	public Bottle_UsingUserInput(String bottle_brand , String color , String type , int capacity , int cost)
	{
		if(bottle_brand.equalsIgnoreCase("Milton")||bottle_brand.equalsIgnoreCase("Cello")||bottle_brand.equalsIgnoreCase("TupperWear") && color.equalsIgnoreCase("black")||color.equalsIgnoreCase("red") || color.equalsIgnoreCase("Blue"))
		{
			this.bottle_brand=bottle_brand;
			this.color = color;
		}
	
		else if(type.equalsIgnoreCase("Silver")||type.equalsIgnoreCase("Copper")||type.equalsIgnoreCase("Plastic"))
		{
			this.type=type;
		}
		else if(capacity>=1 && capacity<=5 || cost >=500 && cost<=1500)
		{
			this.capacity = capacity;
			this.cost = cost;
		}
		else
		{
			System.out.println("Not available ThankYou Visit Again ");
		}
	}
	public void display()
	{
		System.out.println("Bottle Brand : "+bottle_brand);
		System.out.println("Bottle color : "+color);
		System.out.println("Bottel type  : "+type);
		System.out.println("Bottle capacity : "+capacity);
		System.out.println("Bottle cost     : "+cost);
		
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter What Brand Bottle Do you want (1.Milton /n 2.Cello /n 3.TupperWear? ");
		String bottle_brand = s.next();
		System.out.println("Please choose color for your bottle 1.red /n 2. black 3.blue ");
		String color        = s.next();
		System.out.println("Select the type of bottle 1.silver/n 2. copper /n 3.plastic");
		String type         = s.next();
		Bottle_UsingUserInput customer1 = new Bottle_UsingUserInput( bottle_brand , color , type , capacity , cost);
		b1.display();
		
		
		
	}

}
