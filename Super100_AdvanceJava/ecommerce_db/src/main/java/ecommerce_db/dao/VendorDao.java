package ecommerce_db.dao;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import ecommerce_db.dto.Shop;
import ecommerce_db.dto.Vendor;

public class VendorDao {
	
    static VendorDao vdao = new VendorDao();
	static Scanner scanner = new Scanner(System.in);
	static Shop shop = new Shop();
	static Vendor v = new Vendor();
	
	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("hamitha");
	static EntityManager em = emf.createEntityManager();
	static EntityTransaction et = em.getTransaction();
	
	//insert data into db
	public void saveVendor(Vendor vendor)
	{
	   et.begin();
	   em.persist(vendor);	
	   et.commit();
	   System.out.println("Data saved Successfully..");
	}
	
	//login
	public void loginVendor(Vendor vendor)
	{
		System.out.println("Please Enter your Vendor Id : ");
		int vid = scanner.nextInt();

	    Vendor vdb	=em.find(Vendor.class, vid);
	    if(vdb!=null)
		{
	    
			if(v.getEmail()==null)
				v.setEmail(vdb.getEmail());
			if(v.getPassword()==null)
				v.setPassword(vdb.getPassword()); 
			if(vdb.getEmail().equalsIgnoreCase(vendor.getEmail()))
		    {
		    	if(vdb.getPassword().equalsIgnoreCase(vendor.getPassword()))
		    	{
		    		System.out.println("Login SuccessFull");
		    		System.out.println("Enter the Required Option : ");
		    		System.out.println("1.ShopDetails\n2.Profile\n3.Exit");
		    		int option = scanner.nextInt();
		    		boolean isstart=true;
		    		while(true)
		    		{
		    			switch(option)
			    		{
			    	    	case 1:
			    	    	{
			    	    		VendorshopDetails();
			    	    	}
			    	    	break;
			    	    	case 2:
			    	    	{
			    	    		ProfileVendor();
			    	    	}
			    	    	break;
			    	    	case 3 :
			    	    	{
			    	    		isstart=false;
			    	    	}
			    		}
			    		
		    		}
		    	}
		    	else
		    	{
		    		System.out.println("Incorrect Password ");
		    	}
		    }
		    else 
		    {
		    	System.out.println("Incorrect Email .Please Enter Valid Email Address");
		    }
		    
	    }
	    else
	    {
	    	System.out.println("Data Not Found");
	    }
	
	}

	public void ProfileVendor() {
		System.out.println("choose the option for Futher operation : ");
		System.out.println("1.View Profile\n2.UpdateProfile\n3.Exit");
		int option = scanner.nextInt();
		switch(option)
		{
		   case 1 :
		   {
			   profileview();
		   }
		   break;
		   case 2 :
		   {
			   updateprofile();
		   }
		   break;
		}
		
	}

	public static void updateprofile() {
        Vendor v = new Vendor();
		System.out.println("Choose the Option to Update Profile : ");
		System.out.println("Update Profile By : \n1.UpdateByName\n2.UpdateByPhoneNumber\n3.UpdateByEmail\n4.UpdateByPassword");
        int option = scanner.nextInt();
        switch(option)
    	{
    	    case 1 :
    	    {
    	       System.out.println("Enter Name to Update : ");
    	       String name = scanner.next();
    	       v.setName(name);
    	    }
    	    break;
    	    case 2:
    	    {
    	    	System.out.println("Enter PhoneNumber to Update : ");
    	    	long phone = scanner.nextLong();
    	    	v.setPhoneNumber(phone);
    	    	
    	    }
    	    break;
    	    case 3 :
    	    {
    	    	System.out.println("Enter Email to Update : ");
    	    	String email =scanner.next();
    	    	v.setEmail(email);
    	 
    	    }
    	    break;
    	    case 4:
    	    {
    	    	System.out.println("Enter Password to Update : ");
    	    	String pswd = scanner.next();
    	    	v.setPassword(pswd);
    	    }
    	    break;
    	    
    	    default :
    	    	System.out.println("Please Enter Valid Option ");
    	    	break;
    	}
    	vdao.profileUpdate(v);
    }
	

	public void profileUpdate(Vendor v) {
		System.out.println("please conform to update Profile  : \nPlease Enter Vendor Id : ");
		int vid = scanner.nextInt();
		Vendor vdb = em.find(Vendor.class, vid);
		if(vdb!=null)
		{
			if(v.getId()==0)
				v.setId(vdb.getId());
			if(v.getName()==null)
				v.setName(vdb.getName());
			if(v.getPhoneNumber()==0)
				v.setPhoneNumber(vdb.getPhoneNumber());
			if(v.getEmail()==null)
				v.setEmail(vdb.getEmail());
			if(v.getPassword()==null)
				v.setPassword(vdb.getPassword());

			if(vid==vdb.getId())
			{
				et.begin();
				em.merge(v);
				et.commit();
			}	
		}
		else
		{
			System.out.println("Data is not Found to Update ");
		}
		
		
	}

	public void profileview() {
		System.out.println("Enter vendor id to view profile : ");
		int id = scanner.nextInt();
		System.out.println("Vendor Details ...");
		Vendor vd =em.find(Vendor.class, id);
		if(vd!=null)
		{
			if(id==vd.getId())
			{
				Query query=em.createQuery("select i from Vendor i");
				System.out.println(query.getResultList());
				
			}
		}
		else
		{
			System.out.println("No Data Found!");
		}
		
		
	}

	public void VendorshopDetails() {
		System.out.println("1.CreateShop\n2.UpdateShop\n3.DeleteShop\n4.FetchAllShops");
		System.out.println("Choose the option : ");
		int choise = scanner.nextInt();
		while(true)
		{
			switch(choise)
			{
		    	case 1 :
		    	{
		    		shopDetails();
		    	}
		    	break;
		    	case 2 :
		    	{
		    		shopUpdate();
		    	}
		    	break;
		    	case 3 :
		    	{
		    		removeShop();
		    	}
		    	break;
		    	case 4 :
		    	{
		    		fetchAllShops();
		    	}
		    	break;
		    	default :
		    		System.out.println("please enter valid option ..");
		    		break;
			}
		}
	}

	public void fetchAllShops() {
	
		System.out.println("Enter Vendor Name to Fetch All the Shops : ");
		String vendorName = scanner.next();
		System.out.println("Enter shop number : ");
		int shpf=scanner.nextInt();
		Shop shopfetch =em.find(Shop.class,shpf );
		if(vendorName.equalsIgnoreCase(shopfetch.getVendor_name()))
		{
			Query query = em.createQuery("select f from Shop f");
			System.out.println(query.getResultList());
			
		}
				

	}

	public void removeShop()
	{
		System.out.println("Enter ShopId to Delete Shop Details :  ");
		int sid = scanner.nextInt();
		Shop shopdb=em.find(Shop.class,sid);
		if(sid==shopdb.getShop_Id())
		{
			et.begin();
			em.remove(shopdb);
			et.commit();
		}
		System.out.println("Shop Data Deleted SuccessFully...");
		
	}

	public static void shopUpdate()
	{
		Shop shop = new Shop();
		System.out.println("Please Choose the below Option To Update Shop Data : ");
		System.out.println("1.UpdateByShopName\n2.UpdateByShopLocation\n3.UpdateByVendorName");
		int options = scanner.nextInt();
		switch(options)
		{
	     	case 1 :
	     	{
	     		System.out.println("Enter shopName to update : ");
	     		String shopname = scanner.next();
	     		shop.setShop_name(shopname);
	     	}
	     	break;
	     	case 2 :
	     	{
	     		System.out.println("please Enter Shop Location to Update");
	     		String shLoc = scanner.next();
	     		shop.setShop_location(shLoc);
	     	}
	     	break;
	     	case 3 :
	     	{
	     		System.out.println("please Enter vendorName to Update :  ");
	     		String shvendorName = scanner.next();
	     		shop.setVendor_name(shvendorName);
	     	}
	     	break;
	     	default :
	     		System.out.println("Enter valid option to Update ...");
	     		break;
		}
		vdao.UpdateShop(shop);
		
	}
	public  void UpdateShop(Shop shop)
	{
		System.out.println("please conform to update shop : \nPlease Enter Shop Id : ");
		int shpid = scanner.nextInt();
		Shop shopdb = em.find(Shop.class, shpid);
		System.out.println(shop);
		if(shopdb!=null)
		{
	        if(shop.getShop_name()==null)
	        	shop.setShop_name(shopdb.getShop_name());
			if(shop.getShop_location()==null)
				shop.setShop_location(shopdb.getShop_location());
			if(shop.getShop_name()==null)
				shop.setShop_name(shopdb.getShop_name());
			if(shop.getShop_Id()==0)
				shop.setShop_Id(shopdb.getShop_Id());
			if(shop.getVendor_name()==null)
				shop.setVendor_name(shopdb.getVendor_name());
			if(shpid==shopdb.getShop_Id())
			{
				et.begin();
				em.merge(shop);
				et.commit();
			}	
		}
		else
		{
			System.out.println("Data is not Found to Update ");
		}
     }

	
	public void shopDetails() {
		System.out.println("Enter Shop Details : ");
		System.out.println("Enter ShopName : ");
		String sname = scanner.next();
		System.out.println("Enter shopLocation : ");
		String sloc = scanner.next();
		System.out.println("Enter VendorName : ");
		String sVendorname = scanner.next();
		Shop shop = new Shop(0, sname,sloc,sVendorname);
		vdao.shopSave(shop);
		
	}
	public void shopSave(Shop shop)
	{
		et.begin();
		em.persist(shop);
		et.commit();
		System.out.println("Shop Data Saved Successfully..");
	}

	
}
