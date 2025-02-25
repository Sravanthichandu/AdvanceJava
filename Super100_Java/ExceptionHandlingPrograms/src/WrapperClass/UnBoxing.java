package WrapperClass;

public class UnBoxing {

	public static void main(String[] args) {
		
		//Expilicit unboxing --- boxing & unboxing
		boolean bb=false;
		Boolean b = new Boolean(bb);
		boolean b1 = b.booleanValue();
		System.out.println(b1);
		

	}

}
