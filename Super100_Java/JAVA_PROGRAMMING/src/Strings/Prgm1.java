package Strings;

public class Prgm1 {

	public static void main(String[] args) {
		String s = "Java123";
		for(int i=0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			if(ch >='A' && ch<='Z')
			{
				char Alphabtes = ch;
				System.out.println(Alphabtes1);
			}	

		}
		for(int i=0;i<s.length();i++)
		{
			char c = s.charAt(i);
			if(c >=0 || c<=9)
			{
				int numbers = c;
				System.out.println( numbers );
			}
		}
	}

}
