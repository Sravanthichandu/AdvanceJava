package Character_Oriented_Stream;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadingFromFile_3 {

	public static void main(String[] args) {
		
		try {
			FileReader fr = new FileReader("Data1");
			long len = new File("Data1").length();
			for(int i=0;i<=len-1;i++)
				System.out.print((char)fr.read());
			fr.close();
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		
	}
}
