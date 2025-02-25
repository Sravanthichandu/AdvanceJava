package com.methodoverridding;

class Parent
{
	 void show()
	{
		System.out.println("Parent show method ");
	}
}
class Child extends Parent
{
	@Override
	public void show()
	{
		System.out.println("Child class show method");
	}
}
public class Example {

	public static void main(String[] args) {
		
		/*Parent p = new Parent();
		p.show();*/
		
		Child c = new Child();
		c.show();

	}

}
