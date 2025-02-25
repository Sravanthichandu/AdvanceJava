package com;

public class DuplicateElements {

	public static void isDuplicate(int[] a)
	{
		for(int i=1;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					System.out.println(a[i]);
				}
			}
		}
	}
	public static void main(String[] args) {
		
		int a[] = {1,2,3,1,2,3,7};
		isDuplicate(a);
		
	}
}
