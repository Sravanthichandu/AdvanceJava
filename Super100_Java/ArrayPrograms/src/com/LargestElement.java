package com;

public class LargestElement {

	public static void main(String[] args) {
		int a[] = {1,2,3,4,5};
		int largest=0;
		for(int i=1;i<=a.length;i++)
		{
			for(int j=i+1;j<=a.length;j++)
			{
				if(a[i]>largest)
				{
					largest=a[i];
				}
			}
		}
		System.out.println("LargestElement: "+largest);
	}
}
