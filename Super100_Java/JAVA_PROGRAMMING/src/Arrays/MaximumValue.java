package Arrays;

public class MaximumValue {

	public static void main(String[] args) {
		
		int max=0;
		System.out.println("Enter size of an array : ");
		int size = s.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
	}
}
