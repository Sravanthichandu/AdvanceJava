package PracticeU;

public class Debugging {

	public static String sayHello(String name)
	{
		String msg ="Hello "+name;
		return msg;
	}
	public static void main(String[] args) {
		String message=sayHello("Sravs");
		System.out.println(message);
	}

}
