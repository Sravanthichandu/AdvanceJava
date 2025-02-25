package FuntionalInterface;

public class MainPalindrome {

	public static void main(String[] args) {
		
		PalindromeString s = (String str)->
		{
			String rev = "";
			for(int i=str.length()-1;i>=0;i--)
			{
				rev = rev+str.charAt(i);
			}
			if(rev.equals(str))
			{
				System.out.println("Palindrome String");
			}
			else
			{
				System.out.println("Not Palindrome");
			}
		};
		s.palindrome("32'';'';");
	}
}
