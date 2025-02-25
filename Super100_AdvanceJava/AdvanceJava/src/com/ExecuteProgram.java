package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class ExecuteProgram {

	public static void main(String[] args) throws SQLException {
		
		DriverManager.registerDriver(new Driver());
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1", "root", "root");
		
		Statement s = con.createStatement();
		s.execute("insert into student values(9,Sri,sri@gmail.com,98765234134");
		System.out.println();
		
		
	}
}
