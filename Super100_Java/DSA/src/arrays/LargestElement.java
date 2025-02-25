package arrays;

public class LargestElement {

	public static void main(String[] args) {
	
		int array[]= {2,5,8,1,9,79,79};
		int largest=0;
		/*int largest=array[0];
		
		for(int i=0;i<array.length;i++)
		{
			for(int j=i+1;j<array.length;j++)
			{
				if(array[j]>largest)
				{
					largest=array[j];	
				}
		

			}
		}*/
		for(int i=0;i<array.length;i++)
		{
			if(array[i]>largest)
			{
				largest=array[i];
			}
		}
		
		System.out.println("Largest Element : "+largest);
	}

}
