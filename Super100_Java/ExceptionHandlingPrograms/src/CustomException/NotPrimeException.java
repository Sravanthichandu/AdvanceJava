package CustomException;

public class NotPrimeException extends RuntimeException
{
   @Override
   public String toString()
   {
	   return getClass() + ": Not a PrimeNumber ";
   }
	
}
