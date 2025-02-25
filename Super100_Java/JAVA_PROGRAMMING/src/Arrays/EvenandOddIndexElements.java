package Arrays;

import java.util.Scanner;

public class EvenandOddIndexElements {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter size of an array : ");
		int size =s.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter elements : ");
		for(int i=0;i<size;i++)
		{
			arr[i]=s.nextInt();
		}
		
		for(int i=0;i<size;i++)
		{
			if(arr[i]%2!=0)
			{
				System.out.println(i);
			}
		}
		
	}
}
