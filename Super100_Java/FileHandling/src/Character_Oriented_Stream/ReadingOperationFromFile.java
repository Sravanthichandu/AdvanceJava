package Character_Oriented_Stream;

import java.io.FileReader;
import java.io.IOException;

public class ReadingOperationFromFile {

	public static void main(String[] args) {
		
		
		try {
			FileReader 	fr = new FileReader("C:\\Users\\sriya\\Desktop\\Java\\Super100_Java\\FileHandling\\Data1");
			
			fr.read();
			
		} catch (IOException e) {
		
			e.printStackTrace();
		}
	}
}
