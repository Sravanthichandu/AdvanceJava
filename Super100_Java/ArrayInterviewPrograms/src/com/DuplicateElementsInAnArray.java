package com;

import java.util.ArrayList;
import java.util.Arrays;

public class DuplicateElementsInAnArray {

	public static void main(String[] args) {
		
		//BruteForceApproach
		
		int [] a = {12,34,56,78,12,34};
		System.out.println("DuplicateElement in an Array Using BruteForce Approach: ");
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					System.out.print(a[i]+",");

				}
			}
		}
		System.out.println();
		System.out.println("==============================================");
		System.out.println("DuplicateElement in an Array Using sorting Method: ");
		Arrays.sort(a);
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					System.out.print(a[i]+",");
				}
			}
		}
		System.out.println();
		System.out.println("==============================================");
		System.out.println("Duplicate Elements By using ArrayList");
		int array[]= {23,45,65,78,98,23,65};
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(int num : array)
		{
			al.add(num);
		}
		for(Object obj : al)
		{
			int current=al.get(i);
		}
		
		
	}
}
