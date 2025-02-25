package FuntionalInterface;

public class MainPrint {

	public static void main(String[] args) {
		
		PrintingHelloWorld  h = ()->System.out.println("HelloWorld");
		h.print();
	}
}
