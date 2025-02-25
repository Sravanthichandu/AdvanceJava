package Character_Oriented_Stream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadingFromFile_2 {

	public static void main(String[] args) {
		
		try {
			FileReader fr=new FileReader("helloWorld.txt");
			long len=new File("helloWorld.txt").length();
			for(int i=0;i<=len-1;i++)
				   System.out.print((char)fr.read());
			fr.close();
		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
