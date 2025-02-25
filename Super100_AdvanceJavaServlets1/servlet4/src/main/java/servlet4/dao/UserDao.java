package servlet4.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.jdbc.Driver;

import servlet4.dto.User;

public class UserDao {
	
	//fetch by primarykey

	public User fetchByEmail(String email) throws ClassNotFoundException, Exception 
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/servletdb?createDatabaseIfNotExist=true","root","root");
			PreparedStatement ps = con.prepareStatement("select * from savingdata where email=?");
			ps.setString(1, email);
			ResultSet res = ps.executeQuery();
			if(res.next())
			{
				return new User(res.getString("Name"), email, res.getLong("PhoneNumber"), res.getInt("Age"), res.getString("Gender"), res.getString("pwd"));
			}
			else
			{
				return null;
			}
		
	
	}
	
	//fetchall
	
	public List<User> fetchByAll() throws Exception 
	{
		List<User> list = new ArrayList<User>();
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/servletdb?createDatabaseIfNotExist=true","root","root");
		PreparedStatement ps = con.prepareStatement("select * from savingdata");
	    ResultSet res = ps.executeQuery();
		while(res.next())
		{
			list.add(new User(res.getString("Name"),res.getString("email"),res.getLong("PhoneNumber"),res.getInt("Age"),res.getString("Gender"),res.getString("pwd")));
		}
		return list;
	
	}
	
	//save
	
	public void save(User user) throws Exception 
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/servletdb?createDatabaseIfNotExist=true","root","root");
			PreparedStatement ps = con.prepareStatement("insert into savingdata values (?,?,?,?,?,?)");
			ps.setString(1,user.getName());
			ps.setString(2, user.getEmail());
			ps.setLong(3, user.getPhonenumber());
			ps.setInt(4, user.getAge());
			ps.setString(5, user.getGender());
			ps.setString(6, user.getPwd());
			ps.execute();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	//delete
	
	public int deletebyEmail(String email) throws Exception
	{
		DriverManager.registerDriver(new Driver());
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/servletdb?createDatabaseIfNotExist=true","root","root");
		PreparedStatement ps = con.prepareStatement("delete from savingdata where email=?");
		ps.setString(1, email);
		return ps.executeUpdate();
		
	}

	//update
	public int updateByEmail(User user) throws SQLException {
		
		DriverManager.registerDriver(new Driver());
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/servletdb?createDatabaseIfNotExist=true","root","root");
		PreparedStatement ps = con.prepareStatement("update savingdata  set name=?,PhoneNumber=?,age=?,gender=?,pwd=? where email=?" );
		ps.setString(1,user.getName());
		ps.setLong(2, user.getPhonenumber());
		ps.setInt(3, user.getAge());
		ps.setString(4, user.getGender());
		ps.setString(5, user.getPwd());
		ps.setString(6, user.getEmail());
		return ps.executeUpdate();
				
	}
	
	//update
	
	
	
	
}
