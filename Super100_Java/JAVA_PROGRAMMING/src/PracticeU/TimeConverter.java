package PracticeU;

public class TimeConverter {

	public static int convertHoursToMinutes(int hours)
	{
		if(hours<0)
		{
			return -1;
		}
		int noOfMinutes=hours*60;
		return noOfMinutes;
	}
	public static int convertDaysToMinutes(int day)
	{
		if(day<0)
		{
			return -1;
		}
		int noOfMinutes=day*24*60;
		return noOfMinutes;
	}
	public static void main(String[] args) {
		convertHoursToMinutes(12);
		convertDaysToMinutes(1);

	}

}
