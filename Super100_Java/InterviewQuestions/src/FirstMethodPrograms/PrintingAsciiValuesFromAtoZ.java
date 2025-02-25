package FirstMethodPrograms;

public class PrintingAsciiValuesFromAtoZ {

	public static void main(String[] args) {
		
		for(char i='A' ; i<='Z';i++)
		{
			int ascii = i;
			
			System.out.println( i + " - " + ascii);
		}
	}

}
