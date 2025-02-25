package com;

public class Duplicate2 {
	
	public static void isDuplicate(int[] a)
	{
		int i,j;
		for(i=0;i<a.length-1;i++)
		{
			for(j=0;j<i;j++)
			{
					if(a[i]==a[j])
					{
						break;
					}
			}
			if(j==i)
			{
				System.out.print(a[j]);
			}
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
