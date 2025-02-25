package Try_Catch_Scenarios;

public class Scenario3 {

	public static void main(String[] args) {
		// nested try and catch blocks

		try
		{
			String s = "java";
			System.out.println(s.charAt(9));
			try
			{
				System.out.println(3/0);
			}
			catch(Exception e)
			{
				System.out.println("Handled");
			}
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("Handled2");
		}
	}

}
