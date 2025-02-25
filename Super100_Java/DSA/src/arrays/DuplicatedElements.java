package arrays;

public class DuplicatedElements {

	public static void main(String[] args) {
		
		int array []= {1,2,5,6,7,2,1,6};
		System.out.println("Duplicated Elements:");
		for(int i=0;i<array.length;i++)
		{
			for(int j=i+1;j<array.length;j++)
			{
				if(array[i]==array[j])
				{
					System.out.println(array[i]);
				}
			}
		}

	}

}
