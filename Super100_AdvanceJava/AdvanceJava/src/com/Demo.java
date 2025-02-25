package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

//getconnection(String url)
public class Demo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection
				("jdbc:mysql://localhost:3306/db1?user=root&password=root");
		
		PreparedStatement ps = con.prepareStatement(("delete from student where id=2"));
		ps.execute();
		ps.close();
		con.close();
		System.out.println("Delete successfully");
	}
}
