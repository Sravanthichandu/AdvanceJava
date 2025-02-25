package SingletonClass;

public class Runtime {

	
	private static Runtime CurrentRuntime = new Runtime();
	
	private Runtime()
	{
		
	}
	
	public static Runtime getruntime()
	{
		return CurrentRuntime;
	}


}
