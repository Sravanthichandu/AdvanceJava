package Character_Oriented_Stream;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Demo {

	public static void main(String[] args) {
		
		File f = new File("helloWorld.txt"); //file object created
		try {
			boolean res = f.createNewFile(); // file created 
			
			//we can create file in two ways 
			// by using createNewFile and without using  createNewFile method
			
			//System.out.println(res); -->true (file created in project explorer)
			// false ---> file not created
			
			FileWriter fr = new FileWriter(f); //used to store the data
			
			//FileWriter is used to write the file
			
			fr.write("HelloWorld"); // the data is ready in stream we want push the data  we want external method flush
			
			
			fr.flush();
			fr.close(); // it is mandatory to close  
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}
}
