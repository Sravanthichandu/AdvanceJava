package ByteOrientedStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo {

	public static void main(String[] args) {
		
		try {
			FileInputStream fis = new FileInputStream("helloWorld.txt");
			int size = fis.available();
			byte b[] = new byte[size];
			fis.read(b);
			String s = new String(b);
			System.out.println(s);
			
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}
	}
}
