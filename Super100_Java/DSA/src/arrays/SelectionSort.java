package arrays;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in);
		System.out.println("Enter size of an Array : ");
		int n = s.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the Elements Of an Array : ");
		for(int i=0;i<n;i++)
		{
		   a[i]=s.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			int smallest=i;
			for(int j=i+1;j<n;j++)
			{
				if(a[j]>a[smallest])
				{
					smallest=j;
				}
			}
			int temp=a[i];
			
			a[i]=a[smallest];
			a[smallest]=temp;
		}
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]+"");
		}


	}

}
