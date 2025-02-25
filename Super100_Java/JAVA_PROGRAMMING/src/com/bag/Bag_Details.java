package com.bag;

public class Bag_Details {
	
	String branch;
	String color;
	int cost;
	String type;
	String capacity;
	

	public  void display()
	{
		System.out.println("Bag branch    : " +branch);
		System.out.println("Bag color     : "+color);
		System.out.println("Bag cost      : "+cost);
		System.out.println("Bag type      : "+type);
		System.out.println("Bag capacity  : "+capacity);	
		System.out.println("----------------------");
	}
	
	public static void main(String[] args) {
		Bag_Details bag1 = new Bag_Details();
		bag1.branch="china";
		bag1.capacity="12Kg";
		bag1.color="black";
		bag1.cost=450;
		bag1.type="plastic";
		bag1.display();
		Bag_Details bag2 = new Bag_Details();
		bag2.branch="America";
		bag2.capacity="20kg";
		bag2.color="white";
		bag2.cost=800;
		bag2.type="leather";
		bag2.display();
		Bag_Details bag3 = new Bag_Details();
		bag3.branch="India";
		bag3.capacity="30kg";
		bag3.color="red";
		bag3.cost=500;
		bag3.type="cotton";
		bag3.display();
	}

}
