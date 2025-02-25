package batchInsert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.jdbc.Driver;

public class BatchDelete {

	public static void main(String[] args) throws SQLException {
		
		List<Long>list=new ArrayList<Long>();
		list.add(982648102l);
		list.add(881423516l);
		list.add(98752479l);
		
		DriverManager.registerDriver(new Driver());
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","root");
		PreparedStatement ps = con.prepareStatement("delete from student where Phonenumber=?");
  
		for (Long phone : list) {
			
			ps.setLong(1,phone);
			
			ps.addBatch();
			System.out.println(phone +"added into the Batch ");
		}
		int[] res = ps.executeBatch();
		System.out.println("BatchExecuted");
		System.out.println(res);
		ps.close();
		con.close();
		
	}
}



