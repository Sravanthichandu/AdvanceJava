package ExecuteQuery;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ExecutingExecuteQuery {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/db1";
		String user = "root";
		String password = "root";
		Connection con =DriverManager.getConnection(url, user, password);
		
		//Printing all the Data
		
		/*PreparedStatement ps = con.prepareStatement(("select * from student "));
		ResultSet r =ps.executeQuery();
		while(r.next())
		{
			//we can store in variable or we can directly print 
			//by using getter methods here we are fetching the data
			//getter methods present in Resultset interface present java.sql
			//getter methods are public abstract and non static it contain method overloading methods
			//it accepts both column number/column name
			 
			int id = r.getInt(1);
			String name = r.getString(2);
			String email = r.getString("email");
			Long phone = r.getLong(4);
			System.out.println(id);
			System.out.println(name);
			System.out.println(email);
			System.out.println(phone);
			
		}*/
		
		//printing names
		
		PreparedStatement ps = con.prepareStatement(("select name from student "));
		ResultSet r =ps.executeQuery();
		while(r.next())
		{
			
			String name = r.getString("name");
		
			System.out.println(name);
			
		}
		
		System.out.println("---------------------------------------------------------------------------");
		
		
		
		
		
		
		
	}
}
