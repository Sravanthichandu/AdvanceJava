package com;

public class Laptop {
	private String brand;
	private String color;
	private int ram;
	private int cost;
	
	public Laptop() {}

	public Laptop(String brand, String color, int ram, int cost) {
		this.brand = brand;
		this.color = color;
		this.ram = ram;
		this.cost = cost;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}
	
	public void display()
	{
		System.out.println("Brand : "+getBrand());
		System.out.println("Color : "+getColor());
		System.out.println("Cost  : "+getCost());
		System.out.println("Ram   : "+getRam());
	}
	
	public String toString()
	{
		return "Brand : "+getBrand()+"Color : "+getColor()+"Cost : "+getCost()+"Ram :"+getRam()+"--------";
	}
	
}
