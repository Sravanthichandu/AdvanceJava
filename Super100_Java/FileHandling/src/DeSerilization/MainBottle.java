package DeSerilization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class MainBottle {

	public static void main(String[] args) {
		
		Bottle b = new Bottle("Milton",250,"steel");
		Bottle b1 = new Bottle("Apsara",150,"plastic");
		
		try 
		{
			FileOutputStream fos = new FileOutputStream("Bottle.txt",true);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			System.out.println("DataStored");
			fos.flush();
			fos.close();
			
			
			
		} 
		catch (FileNotFoundException e)
		{
			
			e.printStackTrace();
		} 
		catch (IOException e) 
		{

			e.printStackTrace();
		}
		
		
	}
}
