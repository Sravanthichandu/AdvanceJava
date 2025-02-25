package preparedstatement;
import com.mysql.cj.jdbc.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

//staticQuery

public class StaticInsert {

	public static void main(String[] args) throws SQLException {
		
		//step1 : load and register by using register driver
		
		DriverManager.registerDriver(new Driver());
		
		//step2 : establishing connection
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","root");
		
		//step3 : create statements -PreparedStatement is the child that extends statement
		//By using PreparedStatement we can execute static and dynamic 
		
		PreparedStatement ps = con.prepareStatement(("insert into student values(1,'Hari','hari@gmail.com',6544)"));
		
		//step4 : execute the query
		
		ps.execute();
		
		//step5:close
		
		ps.close();
		
		con.close();
		System.out.println("inserted");
		
	
		
	}
}
