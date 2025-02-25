package arrays;

import java.util.Scanner;

public class AscendingOrder {  //using userinput

	/*public static void ascendingOrderOfArrayElements(int array[])
	{
		int smallest=array[0];
		for(int i=0;i<array.length;i++)
		{
			
			for(int j=i+1;j<array.length;j++)
			{
				if(array[j]>smallest)
				{
					int temp=array[j];
					array[j]=smallest;
					smallest=temp;
				}
				
			}
			System.out.println(array[i] + ",");
		}
	}*/
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a array size : ");
		int size = s.nextInt();
		int[] array = new int[size];
		System.out.println("Enter Array values : ");
		for(int i=0;i<array.length;i++)
		{
			array[i]=s.nextInt();
			//ascendingOrderOfArrayElements(array[i]);
		}
		int smallest=array[0];
		for(int i=0;i<array.length;i++)
		{
			
			for(int j=i+1;j<array.length;j++)
			{
				if(array[j]<smallest)
				{
					smallest=array[j];
				}
				
			}
			int temp=array[i];
			array[i]=smallest;
			smallest=temp;
			System.out.println(array[i] + ",");
		}

		
	}
	
}
