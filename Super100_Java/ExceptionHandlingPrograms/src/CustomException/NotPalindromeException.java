package CustomException;

public class NotPalindromeException extends RuntimeException
{
	@Override
	public String toString()
	{
		return getClass()+": You enter Not a Palindrome String";
	}

}
