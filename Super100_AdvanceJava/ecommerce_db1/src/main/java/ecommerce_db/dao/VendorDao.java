package ecommerce_db.dao;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import ecommerce_db.dto.Vendor;

public class VendorDao {
	
	static Vendor v = new Vendor();
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("hamitha");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	
	//insert data into db
	public void saveVendor(Vendor vendor)
	{
	   em.persist(vendor);	
	   System.out.println("Data saved Successfully..");
	}
		//login
		public void loginVendor(String email,String password)
		{
		    Vendor vdb	=em.find(Vendor.class, v.getId());
		    if(vdb.getEmail().equalsIgnoreCase(email))
		    {
		    	if(password.equalsIgnoreCase(v.getPassword()))
		    	{
		    		System.out.println("Login SuccessFull");
		    		System.out.println("Enter the Required Option : ");
		    		System.out.println("1.ShopDetails\n2.Profile\n3.Exit");
		    		int option = scanner.nextInt();
		    		boolean isstart=true;
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
		
	}
		
