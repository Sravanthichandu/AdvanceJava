package Serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class MainEmployee {

	public static void main(String[] args) {
		
		Employee e = new Employee("Hari",2341,"SoftwareEngineer","Chennai");
		
		try 
		{
			FileOutputStream fos = new FileOutputStream("Employee.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(e);
			fos.flush();
			System.out.println("Data Stored");
			fos.close();
			
			
		}
		catch (FileNotFoundException e1) 
		{
			
			e1.printStackTrace();
		} catch (IOException e1) 
		{

			e1.printStackTrace();
		}
		
	}
}
