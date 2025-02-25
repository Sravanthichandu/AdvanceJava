package admin_jdb.dao;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import com.mysql.cj.jdbc.Driver;

import admin_jdb.dto.Admin;

//creating schemas and tables 

public class AdminCrud {
	
	/*create table return type changes to connection becuase in saveAdmin we can to declare 
	 * 2 steps load register and establish connection for reusability calling the */

	/*Connection con declare outside the class when we surrounded with try catch it will not
	 * accept in another method*/
	
	Connection con;
	
	public Connection createTables()
	{
		try {
			//1.load and register the driver
			DriverManager.registerDriver(new Driver());
			

			FileInputStream stream = new FileInputStream("dbconfig.properties");
			Properties properties = new Properties();
			
			properties.load(stream);
			//2.establish the connection
		     con = DriverManager.getConnection
		("jdbc:mysql://localhost:3306/admindb?createdatabaseIfNotExist= true", properties);
			
			
/*Connection con = DriverManager.getConnection
			("jdbc:mysql://localhost:3306/admindb?createDatabaseIfNotExist = true", "root", "root");*/
			
			//3.create statement --creating table is static go with statement 
			Statement statement = con.createStatement();
			statement.execute(("create table If Not Exists admin (id int primary key,"
					+ "name varchar(45),"
					+ "email varchar(45) unique,"
					+ "password varchar(45) not null,"
					+ "phoneNumber bigint )"));
			
			
		} catch (SQLException | IOException e) {
			
			e.printStackTrace();
		}
		return con;
				
	}
	
	public void saveAdmin(Admin admin) throws SQLException
	{
		Connection connection = createTables();
		PreparedStatement ps = connection.prepareStatement(("insert into admin values(?,?,?,?,?)"));
		ps.setInt(1, admin.getId());
		ps.setString(2, admin.getName());
		ps.setString(3, admin.getEmail());
		ps.setString(4, admin.getPassword());
		ps.setLong(5, admin.getPhoneNumber());
		ps.execute();
		
	}
	
	public Admin loginAdmin(String email,String password)
	{
		try {
			Connection connection = createTables();
			PreparedStatement ps = connection.prepareStatement("select * from admin where email=? and password=? ");
			ps.setString(2, password);
			ps.setString(1, email);
			ResultSet res = ps.executeQuery();
			if(res.next())
			{
				return new Admin(res.getInt(1),res.getString(2),email,password,res.getLong(5));
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;
		
	}
}
