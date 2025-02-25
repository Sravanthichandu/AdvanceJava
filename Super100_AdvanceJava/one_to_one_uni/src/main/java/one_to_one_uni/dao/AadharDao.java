package one_to_one_uni.dao;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import one_to_one_uni.dto.AadharCard;
import one_to_one_uni.dto.Person;

public class AadharDao {
 
	static Scanner scanner = new Scanner(System.in);
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("hamitha");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	static AadharCard aadhar = new AadharCard();
	public void saveAadhar(AadharCard aadhar)
	{
		et.begin();
		em.persist(aadhar);
		et.commit();
	}
	
	public void fetchAadhar()
	{
		System.out.println("Enter AadharNumber : ");
		long AadharNumber = scanner.nextLong();
		System.out.println("Person Details : ");
		AadharCard adb = em.find(AadharCard.class,AadharNumber );
		if(adb!=null)
		{
			if(AadharNumber==aadhar.getAadharNumber())
			{
				System.out.println(adb);
				/*Query query = em.createQuery("select p from Person p ");
				System.out.println(query.getResultList());*/
			}
			else
			{
				System.out.println("Please Enter valid Aadhar Number ");
			}
		}
		
	}
	
	public void deleteAadhar()
	{
		Person p = new Person();
		System.out.println("Please Enter AadharNumber to Delete Data : ");
		long AadharNumber = scanner.nextLong();
		AadharCard adb=em.find(AadharCard.class, AadharNumber );
		
		if(p.getA()!=null)
		{
			Person persondb = fetchPersonByAadhar(adb);
			System.out.println(persondb );
			persondb.setA(null);
			System.out.println(persondb );
			if(adb!=null)
			{
				if(AadharNumber==adb.getAadharNumber())
				{
					et.begin();
					em.remove(adb);
					et.commit();
				}
			}
			else
			
			{
				System.out.println("No Data Found To Delete !");
			}
		}
		else
		{
			if(AadharNumber==adb.getAadharNumber())
			{
				et.begin();
				em.remove(adb);
				et.commit();
			}
			else
			{
				System.out.println("No Data Found To Delete !");
			}
		}
		
	}
	
	public void updateAadhar(AadharCard aadhar)
	{
		System.out.println("Please Confirm Your AadharNumber to Update : ");
		long aadharnum = scanner.nextLong();
		AadharCard adb=em.find(AadharCard.class,aadharnum );
		if(adb!=null)
		{
			if(aadhar.getA_Fathername()==null)
				aadhar.setA_Fathername(adb.getA_Fathername());
			if(aadhar.getA_Mothername()==null)
				aadhar.setA_Mothername(adb.getA_Mothername());
			if(aadhar.getAddress()==null)
				aadhar.setAddress(adb.getAddress());
			if(aadhar.getDateOfBirth()==null)
				aadhar.setDateOfBirth(adb.getDateOfBirth());
			if(aadhar.getAadharNumber()==0)
				aadhar.setAadharNumber(adb.getAadharNumber());
			
			if(aadharnum==adb.getAadharNumber())
			{
				et.begin();
				em.merge(aadhar);
				et.commit();
			}
		}
		else
		{
			System.out.println("No Data Found");
				
		}
		
	}
	
	//breaking connection between owning data and non-owning data ,so we can easily  delete the non-owning data only even when it is connected to owning
	
	public Person fetchPersonByAadhar(AadharCard a)
	{
		Query query = em.createQuery("Select s from Person s where a=?1");
		query.setParameter(1, a);
		//downcast
		return (Person) query.getSingleResult();
		
	}
	

}

/*
 * 
 * https://tinyurl.com/jntujspwe2024
 * 15 days online/offline
 * be/btech/mca/msc/bsc/bca 
 * 
 * tinyurl.com/jspacc05
 * 
 * */
