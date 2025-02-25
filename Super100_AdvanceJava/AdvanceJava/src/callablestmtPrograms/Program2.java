package callablestmtPrograms;


import java.io.FileInputStream;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;


public class Program2 {

	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Properties properties = new Properties();
	    FileInputStream stream = new FileInputStream("dbconfig.properties");
		properties.load(stream);
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1",properties);
		//CallableStatement cs = con.prepareCall("call db1.deleteStudent(?)");--storedprocedures[0-
        CallableStatement cs= con.prepareCall("delete from student where id=1");
		int res = cs.executeUpdate();
		cs.close();
		con.close();
		System.out.println(res);
		
		
	}
}
