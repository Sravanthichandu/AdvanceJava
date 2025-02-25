package Serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class MainStudent {
	
	public static void main(String[] args) {
		
		//3.create object for user defined class
		
		Student s = new Student("Ram",2,56,21);
		
		//4.create object for fileoutput stream
		
		try {
			FileOutputStream fos = new FileOutputStream("Student.txt");
			
			//5.create object for objectOutputStream
			
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			//6.call or invoke WriteObject(Object reference variable)
			
			oos.writeObject(s);
			
			fos.flush();

//In order to achieve de-serialization (converting file to object format) first we have to perform serialization
//converting object to file or byte format
			
			FileInputStream fis = new FileInputStream("Student.txt");
			
			ObjectInputStream ois = new ObjectInputStream(fis);
			
		   //downcast
			
			Student std = (Student)ois.readObject();
			std.display();
			
			//ois.close(); or
			oos.close();
			System.out.println("Data Stored");
			
		} catch (FileNotFoundException e) {
		
			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		
		
	}

}
