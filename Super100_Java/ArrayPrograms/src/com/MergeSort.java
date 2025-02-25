package com;

public class MergeSort {

	public static void main(String[] args) {
		
		int a1[] = {1,2,3};
		int a2[] = {4,5,6};
		int res[]=new int[a1.length+a2.length];

		for(int i=0;i<a1.length-1;i++)
		{
			res[i]=a1[i];

		}
		for(int i=0;i<a2.length-1;i++)
	{
			res[a1 + i] = a2[i];
		}
	}
}
