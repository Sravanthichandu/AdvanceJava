package Strings;

public class Program1 {

	public static void main(String[] args) {
		
		String  s = "Java123";
		int AlphabetsCount =0;
		char alphabets;
		int  numbers;
		int NumberCount=0;
		for(int i=0;i<s.length();i++)
		{
		        char ch =s.charAt(i);
		        if(ch>='0' && ch<='9')
		        {
		        	NumberCount+=1;
		        	//numbers=i;
		        	//System.out.println(numbers);
		     
		        }
		        else if((ch>='A'&&ch<='Z')||(ch>='a'&&ch<='z'))
		        {
		        	 AlphabetsCount+=1;
		        	 //alphabets=ch;
			         //System.out.println(alphabets);
			        	
		        }
		}

	}

}

