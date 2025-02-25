package com;

public class Bottle {
	
	private String brand;
	private int cost;
	private String color;
	private int capacity;
	
	public Bottle()
	{
		
	}
	
	public Bottle(String brand,int cost,String color,int capacity)
	{
		this.brand=brand;
		this.cost=cost;
		this.color=color;
		this.capacity=capacity;
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
	public void setcolor(String color)
	{
		this.color=color;
	}
	public String getcolor()
	{
		return color;
	}
	public void setcapacity(int capacity)
	{
		this.capacity=capacity;
	}
	public int getcapacity()
	{
		return capacity;
	}
	
	public void display()
	{
		System.out.println("Bottle brand : "+getbrand());
		System.out.println("Bottle color : "+getcolor());
		System.out.println("Bottle cost  : "+getcost());
		System.out.println("Bottle capacity : "+getcapacity());
	}
    
	public String toString()
	{
		return "Bottle brand : "+getbrand()+"\n"+"Bottle color : "+getcolor()
		+"Bottle cost : "+getcost()+"\n"+"Bottle capacity : "+getcapacity();
	}
}
