package Character_Oriented_Stream;

import java.io.File;
import java.io.IOException;

public class CreatingTextFile {

	public static void main(String[] args) {
		
		//File f1 = new File("demo.txt"); // file object is created
		//File f1 = new File("Student.txt");
		//File f1 = new File("Employee.txt");
		File f1 = new File("Bottle.txt");
		try {
			boolean res = f1.createNewFile(); //now,file is created
			System.out.println(res);
			
		} catch (IOException e) {
			
			e.printStackTrace();
		} 
		
	}
	
}
