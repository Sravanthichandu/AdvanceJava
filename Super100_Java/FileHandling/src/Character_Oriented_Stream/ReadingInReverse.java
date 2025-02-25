package Character_Oriented_Stream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadingInReverse {

	public static void main(String[] args) {
		String file = "";
		String rev="";
		try {
			
			FileReader 	fr = new FileReader("helloWorld.txt");
			
			long length = new File("helloWorld.txt").length();
			
			 
			
			for(int i=0;i<=length-1;i++)
			{
				char ch = (char)fr.read();
				file = file+ch;
			}
		
			System.out.println(file);
			for(int i=file.length()-1;i>=0;i--)
			{
				  //char res = (char)fr.read();
				  //rev = rev+res;
				System.out.println((char)fr.read());
				
			}
			//System.out.println(rev);
			fr.close();
			
			
		} catch (FileNotFoundException e) {
		
			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}		
		
		
	}

}
