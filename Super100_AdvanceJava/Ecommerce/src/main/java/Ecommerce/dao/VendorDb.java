package Ecommerce.dao;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.Scanner;

import com.mysql.cj.jdbc.Driver;

import Ecommerce.controller.VendorMain;
import Ecommerce.dto.Shop;
import Ecommerce.dto.Vendor;


public class VendorDb {
    static Scanner scanner = new Scanner(System.in);
    static VendorMain vm = new VendorMain();
	Connection con;
	public Connection createTables() throws SQLException, IOException
	{
		DriverManager.registerDriver(new Driver());
		FileInputStream stream = new FileInputStream("dbconfig.properties");
		Properties p = new Properties();
		p.load(stream);
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/", p);
		Statement s = con.createStatement();
		s.execute("create table if not exists profiledb(name varchar(45),"
				+ "email varchar(45) unique,"
				+ "password varchar(45) not null,"
				+ "phoneNumber bigint)");
		Statement s1 = con.createStatement();
		s1.execute("create table if not exists shopdb(shop_name varchar(45),"
				+ "shop_Ownername varchar(45),"
				+ "shop_type  varchar(45),"
				+ "shop_location varchar(45)");
		Statement s2 = con.createStatement();
		s2.execute("create table if not exists materialdb(item_name varchar(45),"
				+ "item_type varchar(45),"
				+ "item_cost bigint,"
				+ "vendor_name varchar(45))");
		return con;	
		
	}
	public void saveProfile(Vendor vendor) throws SQLException, IOException
	{
		Connection connection = createTables();
		//System.out.println("-------------------------------------------------------");
		PreparedStatement ps = connection.prepareStatement(("insert into profiledb values(?,?,?,?)"));
		ps.setString(1, vendor.getName());
		ps.setString(2, vendor.getEmail());
		ps.setString(3, vendor.getPassword());
		ps.setString(4, vendor.getPassword());
		ps.setLong(5, vendor.getPhoneNumber());
		ps.execute();
		//System.out.println("-------------------------------------------------------");
	}
	
	public Vendor loginAdmin(String email,String password)
	{
		try {
			Connection connection = createTables();
			PreparedStatement ps = connection.prepareStatement("select * from profiledb where email=? and password=? ");
			ps.setString(2, password);
			ps.setString(1, email);
			ResultSet res = ps.executeQuery();
			if(res.next())
			{
				if(res.getString(email).equals(email))
				{
					if(res.getString(password).equals(password))
					{
						System.out.println("Login SuccessFull..");
						boolean isStart=true;
						System.out.println("1.Shop\n2.Profile\n3.exit");
						System.out.println("Choose the required option ..");
						int option = scanner.nextInt();
						switch(option)
						{
						   case 1 : 
						   {
							   System.out.println("Welcome to the shop option ...The operations are");
							   System.out.println("1.CreateShop\n2.UpdateShop\n3.DeleteShop\n4.FetchAllShops\n5.exit");
							   System.out.println("Enter valid task number : ");
							   int task = scanner.nextInt();
							   switch(task)
							   {
							     case 1 :
							     {
							    	 VendorMain.shop();
							     }
							     break;
							     case 2 :
							     {
							    	 updateShop();
							     }
							   }
						   }
						   break;
						   case 2 :
						   {
							   
						   }
						   break;
						   case 3 :
						   {
							   isStart=false;
						   }
						   default : System.out.println("Invalid option");
						}
					}
					else
					{
						System.out.println("Incorrect Password");
					}
				}
				else
				{
					System.out.println("Incorrect email");
				}
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;
		
	}
	private void updateShop() {
		
		System.out.println("UpdateShop By \n1.ShopName\n2.ShopType\n3.ShopOwnerName\n4.ShopLocation");
		System.out.println("Enter your chooise : ");
		int chooise = scanner.nextInt();
		switch(chooise)
		{
		    case 1 :
		    {
			      System.out.println("Update By ShopName ...");
			      System.out.println("Enter new ShopName : ");
			      String shopName = scanner.next();
			      Connection connection = createTables();
					PreparedStatement ps1 = connection.prepareStatement(("update shopdb set shopName=shopName values(?,?,?,?)"));
					ps1.setString(1,shop.getShop_name());
			      
	     	}
		    break;
		}
		
	}
	public void createShop(Shop shop) throws SQLException, IOException {
		Connection connection = createTables();
		PreparedStatement ps1 = connection.prepareStatement(("insert into shopdb values(?,?,?,?,?)"));
		ps1.setInt(1, );
		ps1.setString(2,shop.getShop_name());
		ps1.setString(3, shop.getShop_ownername());
		ps1.setString(4, shop.getShop_type());
		ps1.setString(5, shop.getShop_location());
		ps1.execute();	
		
	}
	
}
