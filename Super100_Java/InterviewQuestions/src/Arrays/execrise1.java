package Arrays;

public class execrise1 {

	public static void main(String[] args) {
		
		//array declaration
		//datatype[] arrayName
		int[] arr;
		arr=new int[5];
		arr[0]=1;
		arr[1]=2;
		//arr[2]=2;
		arr[3]=3;
		arr[4]=4;
		for(int i=0;i<=arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		arr[0]=9;
		System.out.println(arr[0]);
		

	}

}
