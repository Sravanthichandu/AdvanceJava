package InheritancePrograms;

public class Test extends Demo
{
	
	public static void main(String[] args) {
		
		Test t=new Test();
		System.out.println(t.a);//calling variables from super class 
		System.out.println(t.b);
		t.display();
	}
}

