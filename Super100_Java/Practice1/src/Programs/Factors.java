package Programs;

import java.util.Scanner;

public class Factors {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = s.nextInt();
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				System.out.println(i);
			}
		}

	}

}
/*
 * 
 * i=1 1<=6
 * if 6%1==0 -------1
 *    i++ i=2 2<=6
 *    6%2==0 -------2
 *    i++ i=3 3<=6
 *    6%3==0 -------3
 *    i++ i=4 4<=6
 *    6%4==0 (false)
 * 
 * */
 */