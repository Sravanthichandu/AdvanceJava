package callablestmtPrograms;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;



public class callableProgram1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
			Class.forName("com.mysql.cj.jdbc.Driver");
			

			FileInputStream stream = new FileInputStream("dbconfig.properties");
			Properties properties = new Properties();
			
			properties.load(stream);
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost3306/db1",properties);
	        CallableStatement cs= con.prepareCall("delete from student where id=1");
			int res = cs.executeUpdate();
			cs.close();
			con.close();
			System.out.println(res);
	}
}
