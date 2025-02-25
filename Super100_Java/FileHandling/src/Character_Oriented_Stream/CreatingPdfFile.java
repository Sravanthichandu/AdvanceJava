package Character_Oriented_Stream;

import java.io.File;
import java.io.IOException;

public class CreatingPdfFile {
	
	public static void main(String[] args) {
		
		File f= new File("demo.pdf");
		try {
			
		boolean	res = f.createNewFile();
		System.out.println(res);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}

}
