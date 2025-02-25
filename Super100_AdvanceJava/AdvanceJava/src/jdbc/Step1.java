package jdbc;

             /*JDBC connectivity ---2 ways
             * 1.helper method --- forName(static method)--Class class -- java.lang
             * 2.register driver
             * */
public class Step1 {

	/* step1 : Load and Register the Driver */
	public static void main(String[] args) throws ClassNotFoundException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Step1 completed");
		
	}
}








/*--------------------------------------------------------------------------------
 * "com.mysql.cj.jdbc.driver"--fully qualified name
 * the driver not exists in Jre library -- classNotFoundException
 * 
 * plugging process -- adding external resources into driver class
 * 
 * */

/* NOTE : Module info in project will restrict to add external libraries*/
/*-----------------------------------------------------------------------------*/

/* What is Driver ? -- Driver is a class present in com.mysql.cj.jdbc package*/