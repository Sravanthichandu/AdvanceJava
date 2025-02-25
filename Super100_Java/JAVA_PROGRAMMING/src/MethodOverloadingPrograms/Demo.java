package MethodOverloadingPrograms;

public class Demo {

	public void display(int a)
	{
	    System.out.println("1");	
	}
	public void display(int a,int b)
	{
		System.out.println("2");
	}
	public void display(String a,int b)
	{
		System.out.println("3");
	}
	public static void main(String[] args) {
		
		Demo d = new Demo();
		d.display("Hamitha", 12);
	}

}
