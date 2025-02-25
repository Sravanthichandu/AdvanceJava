package com;

public class Duplicate {
	
	public static void isDuplicate(int[] a)
	{
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length-1;j++)
			{
				if(a[i]!=0)
				{
					if(a[i]==a[j])
					{
						a[j]=0;
					}
				}
			}
		}
		for(int j=0;j<=a.length-1;j++)
		{
			System.out.print(a[j]);
		}
	}
	
	public static void main(String[] args) {
		int a[]= {1,2,1,5,2,7};
		isDuplicate(a);
	}
}

/*
 * 1,2,1,5,2,7
 * 1,2,0,5,0,7
 * 
 * */
