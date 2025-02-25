package Try_Catch_Scenarios;

public class Scenario4 {

	public static void main(String[] args) {
		// try block without catch block
		
		try
		{
			System.out.println(3/0);
		}
		finally
		{
			System.out.println("Executed");
		}

	}

}
