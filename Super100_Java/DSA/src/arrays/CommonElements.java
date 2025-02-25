package arrays;

public class CommonElements {

	public static void main(String[] args) {
	
		int array1 [] = {1,2,3,6,6};
		int array2 [] = {2,6,5,9};
		for(int i=0;i<array1.length;i++)
		{
			for(int j=0;j<array2.length;j++)
			{
				if(array1[i]==array1[j])
				{
					System.out.println(array1[i]);
				}
			}
		}

	}

}
