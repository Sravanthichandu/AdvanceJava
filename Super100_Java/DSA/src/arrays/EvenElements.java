package arrays;

public class EvenElements {

	public static void main(String[] args) {
	
		int [] array= {2,6,8,9,1,1,4};
		System.out.println("Even Elements in an array :");
		for(int i=0;i<array.length;i++)
		{
				if(array[i]%2==0)
				{
					System.out.println(array[i]);

				}
		}
	}

}
