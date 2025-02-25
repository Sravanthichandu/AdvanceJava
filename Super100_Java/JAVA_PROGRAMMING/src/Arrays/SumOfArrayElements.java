package Arrays;

import java.util.Scanner;

public class SumOfArrayElements {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int sum=0;
		System.out.println("Enter size of an array : ");
		int size=s.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter array elements : ");
		for(int i=0;i<size;i++)
		{
			arr[i]=s.nextInt();
		}
		for(int i=0;i<size;i++)
		{
			sum=sum+arr[i];
		}
		System.out.println("Sum Of array elements in an array  : "+sum);
	}

}
