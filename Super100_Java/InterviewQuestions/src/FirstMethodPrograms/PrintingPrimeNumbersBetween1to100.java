package FirstMethodPrograms;

import java.util.Scanner;

public class PrintingPrimeNumbersBetween1to100 {
	

	public static int isPrime(int number)
	{
		int count=0;
		for(int i=1 ; i<=number ;i++)
		{
			if(number%i==0)
			{
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a start range to print Prime numbers  ");
		int start = s.nextInt();
		System.out.println("Enter a end range to print Prime numbers  ");
		int end = s.nextInt();
		for(int i=start ;i<=end ; i++)
		{
			isPrime(i);
			if(isPrime(i)==2)
			{
				System.out.print(i + ",");
			}
		}

	}

}
/*
 * 
 * 
 * 2,3,5,7,---upto 10
 * 
 * 1 -    1%1==0
 * 1<=2   1%2==0 false 
 *     count ==1 -->not print
 * ------------------------
 * 2 - 2%1==0
 *     2%2==0
 *     count == 2 -->print
 * ----------------------------
 * 3 -- 3%1==0(t)
 *      3%2==0(f)
 *      3%3==0(t)
 *      count==2  -->print
 * ----------------------------
 * 4 -- 4%1==0(t)
 *      4%2==0(t)
 *      4%3==0(f)
 *      4%4==0(t)
 *      count==3 --> not print
 * ------------------------------
 * 5
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * */
