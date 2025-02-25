package WrapperClass;

public class Boxing {

	public static void main(String[] args) {
		
		//expilicit Boxing
		
		Integer i = new Integer(9);
		System.out.println(i);
		
		//Impilicit Boxing
		
		int i1=3;
		Integer x=i1;
	    System.out.println(x);
	}

}
/*
 * Difference b/w Expilicit Boxing and Impilicit Boxing
 * 
 * Expilicit --- new keyword or new operator Developer need to declare expilicitly
 * Impilicit -- no need of declare new operator
 * 
 * 
 * */
