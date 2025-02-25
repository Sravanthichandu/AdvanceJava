package AccessSpecifiers;

public class privateExample {

	private static int number;
	private static String name;
	public void showDetails(int number,String name)
	{
		System.out.println("Number of the person : "+number);
		System.out.println("Name of the person : " +name);
		System.out.println("from it college ");
		System.out.println("at duvada...");
	}
	public privateExample()
	{
		System.out.println("Details of the person ");
	}
	public static void main(String[] args) {
		privateExample v1 = new privateExample();
		number=10;
		name="harii";
		v1.showDetails(number,name);
		
	}
}
