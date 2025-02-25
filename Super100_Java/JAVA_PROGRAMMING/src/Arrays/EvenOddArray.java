package Arrays;
import java.util.*;
public class EvenOddArray {

	public static void main(String[] args) {
		int count=0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter size of an array : ");
		int size = s.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter array elements  : ");
		for(int i=0;i<size;i++)
		{
		  arr[i]=s.nextInt();
		}
		System.out.println("Even Array elements : ");
		for(int i=0;i<size;i++)
		{
			if(arr[i]%2==0)
			{ 
				System.out.println(arr[i]);
				count++;
			}
		}
		System.out.println("Count of Even array elements : "+count);
	}

}
