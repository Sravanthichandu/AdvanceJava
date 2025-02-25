package arrays;

public class EvenIndex {

	public static void main(String[] args) {
		           //  0 1 2 3 4 5 6 7
		int array []= {1,2,3,9,4,1,2,6};
		for(int i=0;i<array.length;i++)
		{
			if(i%2==0)
			{
				System.out.println(array[i]);
			}
		}

	}

}
