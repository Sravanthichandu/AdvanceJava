package MethodOverloadingPrograms;

public class MobileUnlockProcess {

	public void unLock(int Pattern)
	{
	    System.out.println("Mobile unLocked Using Pattern ");	
	}
	public void unLock(long Pin)
	{
		System.out.println("MobileUnLock Using Pin");
	}
	public void unLock(String FaceDetection)
	{
		System.out.println("Mobile Unlock Using FaceDetection");
	}
	public void unLock(boolean FingerPrint)
	{
		if(FingerPrint==true)
		{
			System.out.println("MobileunLock Using FingerPrint ");
		}
		else
		{
			System.out.println("Mobile cannot be unLock");
		}
		
	}
	public static void main(String[] args) {
		
		MobileUnlockProcess m = new MobileUnlockProcess();
		m.unLock(false);
	}

}
