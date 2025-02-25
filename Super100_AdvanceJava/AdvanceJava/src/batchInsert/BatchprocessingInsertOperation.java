package batchInsert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.mysql.cj.jdbc.Driver;

public class BatchprocessingInsertOperation {

	public static void main(String[] args) throws SQLException {
		
		//Collection--arraylist
		
		List <Student> list=new ArrayList<Student>();
		
		//adding into them by using or set the values into the list by using argumented constructor and setters
		//here using argumentedConstructor
		
		//list.add(new Student());---it will give the default values to see that we should override toString in Student class
		
		list.add(new Student(101,"raju","raju@gmail.com",916123782));
		list.add(new Student(102,"rani","rani@gmail.com",981423516));
		list.add(new Student(103,"usha","usha@gmail.com",781423516));
		list.add(new Student(104,"das","das@gmail.com",881423516));
		list.add(new Student(105,"sam","sam@gmail.com",281423516));
		System.out.println(list);
		
		//step1---load and register
		DriverManager.registerDriver(new Driver());
		
		//step2--establish connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1?user=root&password=root");
		
		//step3--create statement
		PreparedStatement ps = con.prepareStatement("insert into student values (?,?,?,?)");
		
		//we should set the values and make them batch instead of inserting one on one for that we need iterate loop
		//for each
		
		for (Student student : list) {
			
			//in preparestatement we are inserting dynamic query so before executing we should set them 
			
			ps.setInt(1, student.id);
			ps.setString(2, student.name); //variables are not private we can access without setters
			ps.setString(3, student.email);
			ps.setLong(4, student.phone);
			
			ps.addBatch();
			System.out.println(student.name+"your data is added to batch");
			
		}
		
		//ps.executeBatch()--- after getting batch execute batch by using executeBatch() it return int[] 
		// after manipulate it return 1
		
		int[] res=ps.executeBatch();
		System.out.println("executedBatch");
		System.out.println(Arrays.toString(res));
		ps.close();
		con.close();
		
	}
}
	class Student{
	
		int id;
		String name,email;
		long phone;
		
		//constructor
		public Student(int id, String name, String email, long phone) {
			this.id = id;
			this.name = name;
			this.email = email;
			this.phone = phone;
		}

		@Override
		public String toString() {
			return "Student [id=" + id + ", name=" + name + ", email=" + email + ", phone=" + phone + "\n]";
		}
		
		
}
/*Batchprocessing --- instead of insert one and one query it distrub the database so group the queries into collection 
 * and make batch for that use one collection -- ArrayList*/
