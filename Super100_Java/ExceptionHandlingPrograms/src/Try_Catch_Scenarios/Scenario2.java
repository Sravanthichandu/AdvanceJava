package Try_Catch_Scenarios;

public class Scenario2 {

	public static void main(String[] args) {
	
		try
		{
			System.out.println(3/0);
		}
		try
		{
			System.out.println(5/0);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Handled");
		}

	}

}
/*In java we cannot declare multiple try blocks with single catch block
 * for every try block there should be catch block or finally block */
 */