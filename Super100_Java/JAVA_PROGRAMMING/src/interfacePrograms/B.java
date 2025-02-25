package interfacePrograms;

public interface B extends A {
	default void run()
	{
		System.out.println("Start running");
	}
	default void stop()	
	{
		System.out.println("Stop running");
	}
	
	public static void main(String[] args) {
	
		B b;
		b.stop();
		b.run();
	}
}
