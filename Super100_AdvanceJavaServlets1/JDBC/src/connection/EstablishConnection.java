package connection;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import com.mysql.cj.jdbc.Driver;

public class EstablishConnection {

	public static void main(String[] args) throws SQLException, IOException {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			DriverManager.registerDriver(new Driver());
			
			FileInputStream stream = new FileInputStream("dbConfig.properties");
			
			Properties p = new Properties();
			
			p.load(stream);
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db2", p);
			System.out.println(con);
			System.out.println("connected");
			
		} catch (ClassNotFoundException e) {
			
			
			e.printStackTrace();
		}
	}
}
