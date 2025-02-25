package SingletonClass;

public class MainRuntime {

	public static void main(String[] args) {
		
		Runtime r1 = Runtime.getruntime();
		Runtime r2 = Runtime.getruntime();
		System.out.println(r1);
		System.out.println(r2);
	}
}
