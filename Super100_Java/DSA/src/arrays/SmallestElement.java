package arrays;

public class SmallestElement {

	public static void main(String[] args) {
		
		int array[]= {1,4,6,8,9,0,2,34};
		/*int smallest=array[0];
		
		for(int i=0;i<array.length;i++)
		{
			for(int j=i+1;j<array.length;j++)
			{
				if(array[j]<smallest)
				{
					smallest=array[j];
				}
			}
		}*/
		
		int smallest=0;
		for(int i=0;i<array.length;i++)
		{
			if(array[i]<smallest)
			{
				smallest=array[i];
			}
		}
		System.out.println("Smallest or minimum element : "+smallest);

	}

}
