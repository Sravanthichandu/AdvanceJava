package FirstMethodPrograms;

public class PrintingNaturalNumbersFrom1to10Except3And8 {

	public static void main(String[] args) {
		for(int i=1 ;i<=10;i++)
		{
			if(i==3 || i==8)
				continue;
			System.out.println(i);

		}

	}

}
