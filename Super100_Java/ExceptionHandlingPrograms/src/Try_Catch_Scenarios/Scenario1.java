package Try_Catch_Scenarios;

public class Scenario1 {

	public static void main(String[] args) {
		
		try
		{
		   System.out.println(3/0);	
		}

		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("Handled1");
		}
		catch(ArithmeticException e)
		{
			System.out.println("Handled"); 
			//for try block corresponding catch block will be executed
		}
	}
}
