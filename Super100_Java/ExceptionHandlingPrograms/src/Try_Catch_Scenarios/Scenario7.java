package Try_Catch_Scenarios;

public class Scenario7 {

	public static void main(String[] args) {
		
		try
		{
			System.out.println(5/0);
		}
		catch(Exception e)
		{
			System.out.println("Handled");
		}
		catch(ArithmeticException e)
		{
			System.out.println("Handled1");
		}
	}
}
