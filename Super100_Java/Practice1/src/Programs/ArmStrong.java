package Programs;

public class ArmStrong {

	public static void main(String[] args) {
		
		int number = 153;
		int temp=number;
		int count=0;
		int sum=0;
		while(temp>0)
		{
			temp=temp/10;
			count++;
		}
		while(number>0)
		{
			int ld = number%10;
			int exp=1;
			for(int i=1;i<=count;i++)
			{
				exp=exp*ld;
			}
			sum=sum+ld;
		}
		if(sum==number)
		{
			System.out.println("ArmStrongNumber");
		}
		else
		{
			System.out.println("Not ArmStrong Number");
		}

	}

}
