package Character_Oriented_Stream;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

//in order to create file in c,d,e,f storage
//first we have 3 things 1.location,2.FileName,3.Extension
// in c drive it is not possible 
public class Sample {

	public static void main(String[] args) {
		
		File f = new File("D://Sample.pdf" ,true); //--> by using true we can store 
		try {
			boolean res = f.createNewFile();
			//System.out.println(res);
			
			FileWriter fr = new FileWriter(f);
			//fr.write("Hello FileHandling");
			fr.write("Jsp,QSp");
			
			//o/p :
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
				

	}

}
