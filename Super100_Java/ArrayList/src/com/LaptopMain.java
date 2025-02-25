package com;

import java.util.ArrayList;

public class LaptopMain {
	
	public static void main(String[] args) {
		
		Laptop lap1 = new Laptop("Hp","Black",16,67000);
		Laptop lap2 = new Laptop("Lenovo","Blue",8,50000);
		Laptop lap3 = new Laptop("Asco","silver",16,70000);
		Laptop lap4 = new Laptop("Dell","Black",4,5000);
		Laptop lap5 = new Laptop("Asus","Silver",16,90000);
		
		ArrayList al = new ArrayList();
		al.add(lap1);
		al.add(lap2);
		al.add(lap3);
		al.add(lap4);
		al.add(lap5);
		
		for(int i=0;i<=al.size()-1;i++)
		{
			Laptop laptop = (Laptop)al.get(i);
			laptop.display();
			System.out.println("----------------------------");
		}
		System.out.println("Objects present at even index");
		for(int i=0;i<=al.size()-1;i++)
		{
			Laptop laptop = (Laptop)al.get(i);
			if((i!=0)&&i%2==0)
			{
				laptop.display();
				System.out.println("_________________________________");
			}
		}
		for(int i=0;i<=al.size()-1;i++)
		{
			Laptop laptop = (Laptop)al.get(i);
			if(laptop.getCost()>10000)
			{
				laptop.display();
				System.out.println("--------------------");
				
			}
			
		}
		
		
	}

}
