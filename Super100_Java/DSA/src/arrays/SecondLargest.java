package arrays;

public class SecondLargest {

	public static void main(String[] args) {
		
		int array[] = {2,4,5,8,8,89,110};
		int firstLargest=array[0];
		int secondLargest=array[1];
		for(int i=0;i<array.length;i++)
		{
			for(int j=i+1;j<array.length;j++)
			{
		      if(array[i]<firstLargest)
		      {
		    	  secondLargest=firstLargest;
		    	  firstLargest=array[i];
		      }
		      else if(array[i]>secondLargest &&array[i]!=firstLargest)
		      {
		    	  secondLargest=array[i];
		      }
		
			}
		}
		System.out.println("SecondLargestElement : "+secondLargest);

	}

}

/*
 *     second largest ?
 *     0 1 2 3    
 *     2,4,5,9
 *     1st---largest-->9
 *     2nd ---largest --->5
 *     
 *     2 varaiables declare
 *     int firstLargest=arr[0];
 *     int secondLargest=arr[1];
 *     
 *     for(int i=0;i<array.length;i++)
 *     {
 *        for(int j=i+1;j<array.length;j++)
 *        {
 *          if(array[i]>array[j])
 *          {
 *             if(array[i]<firstlargest && array[i]>secondlargest)
 *             {
 *                secondlargest=array[i];
 *             }
 *          }
 *        }
 *     }
 *     
 *     i=0 0<3 (t)
 *     j=0+1=1 1<3 (t)
 *     
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * */
