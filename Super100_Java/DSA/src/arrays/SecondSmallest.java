package arrays;

public class SecondSmallest {

	public static void main(String[] args) {
	
		int array[]= {2,3,4,9};
		int firstSmallest=array[0];
		int secondSmallest=array[1];
		for(int i=0;i<array.length;i++)
		{
			for(int j=i+1;j<array.length;j++)
			{
				if(array[i]<firstSmallest)
				{
				    secondSmallest=firstSmallest;
				    firstSmallest=array[i];
				}\\\\\o8
				else if(array[i]<secondSmallest && array[i]>firstSmallest)
				{
					secondSmallest=array[i];
				}
			}
		}

		System.out.println("second smallest : "+ secondSmallest);
	}

}
