package FirstMethodPrograms;

import java.util.Scanner;

public class MultiplicationTableOf8 {

	public static void main(String[] args) {
		
		int Table = 8;
		Scanner s = new Scanner(System.in);
		System.out.println("Printing Multiplication Table 8 ");
		System.out.println("Enter start iteration of Table : ");
		int start = s.nextInt();
		System.out.println("Enter start iteration of Table : ");
		int end = s.nextInt();
		for(int i=start;i<=end;i++)
		{
			System.out.println(Table  + " X " + i + " = " + Table*i  );
		}

	}

}
