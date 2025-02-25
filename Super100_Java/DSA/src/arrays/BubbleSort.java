package arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int [] array = {5,3,8,1,2,7};
		System.out.println("Original Array : ");
		printArray(array);
		System.out.println("Sorted Array : ");
		bubbleSort(array);
		printArray(array);

	}
	public static void bubbleSort(int[] array)
	{
		int temp=0;
		
		for(int i=0;i<array.length;i++)
		{
			for(int j=i+1;j<array.length;j++)
			{
				if(array[i]>array[j])
				{
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
	}
	public static void printArray(int [] array)
	{
		for(int i=0;i<array.length;i++)
		{
			System.out.println(array[i]+" ");
		}
		System.out.println();
	}

}
