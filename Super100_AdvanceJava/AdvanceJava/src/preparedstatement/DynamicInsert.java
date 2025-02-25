package preparedstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.cj.jdbc.Driver;
public class DynamicInsert {

	public static void main(String[] args) throws SQLException {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter id : ");
		int id = scan.nextInt();
		System.out.println("Enter name : ");
		String name = scan.next();
		System.out.println("Enter email : ");
		String email = scan.next();
		System.out.println("Enter phoneNumber : ");
		Long phone = scan.nextLong();
		
		//load and register driver
		DriverManager.registerDriver(new Driver());
		
		//establish connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","root");
		
		//create statements
		PreparedStatement ps = con.prepareStatement(("insert into student values(?,?,?,?)"));
		
		
		//bind the placeholder with the value by using setters present in PreparedStatement
		
		ps.setInt(1, id);
		ps.setString(2, name);
		ps.setString(3, email);
		ps.setLong(4, phone);
		
		//execute statements
		ps.execute();
		
		//close the connection
		
		con.close();
		
		System.out.println("Inserted");
		
		
	}
}
