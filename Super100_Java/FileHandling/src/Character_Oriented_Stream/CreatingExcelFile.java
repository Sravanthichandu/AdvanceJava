package Character_Oriented_Stream;

import java.io.File;
import java.io.IOException;

public class CreatingExcelFile {

	public static void main(String[] args) {
		
		File f = new File("demo.xlsx");
		try {
		boolean	res = f.createNewFile();
			System.out.println(res);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
