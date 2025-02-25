package com;

import java.util.LinkedList;

public class BottleMain {

	public static void main(String[] args) {
		
		Bottle b1 = new Bottle("Milton",100,"red",5);
		Bottle b2 = new Bottle("Asus",200,"blue",9);
		Bottle b3 = new Bottle("Natraj",90,"silver",2);
		Bottle b4 = new Bottle("Apsara",145,"black",3);
		
		
		LinkedList<Bottle> l = new LinkedList<Bottle>();
		l.add(b1);
		l.add(b2);
		l.add(b3);
		l.add(b4);
		
		//displaying milton bottle details
		
		for(Bottle b : l)
		{
			if(b.getbrand().equalsIgnoreCase("Milton"))
			{
				System.out.println("----Milton Bottle details :--------");
				b.display();
				System.out.println("-----------------------------");
			}
			if(b.getcapacity()>3)
			{
				System.out.println("Bottle brand : "+b.getbrand()+"\n"+"Bottle color : "
			           +b.getcolor());
			}
			System.out.println("-=========================-------");
			if(b.getcolor().equalsIgnoreCase("black")&& b.getcapacity()<5)
			{
				b.setcost(450);
				b.display();
			}
		}
		
		
		
		
		
		
	}
}
