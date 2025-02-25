package one_to_one_uni.dao;

import java.util.Scanner;
import javax.persistence.Query;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


import one_to_one_uni.dto.Person;

public class PersonDao {

    static Scanner scanner = new Scanner(System.in);
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("hamitha");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	
	//savePerson
	public void savePerson(Person person)
	{
		et.begin();
		em.persist(person);
		et.commit();
	}
	
	//savePerson-aadhar
	/*public void savePersonAadhar(Person person)
	{
	   there should be only 1 persists method
	   for eg if we have n number of object we should create n number of persist methods to save
		et.begin();
		em.persist(person.getA());
		et.commit();
	}*/
	
	public void updatePerson(Person person)
	{
		System.out.println("Please Confirm Your PersonId to Update : ");
		int personId = scanner.nextInt();
		Person pdb=em.find(Person.class, personId);
		if(pdb!=null)
		{
			if(person.getP_id()==0)
				person.setP_id(pdb.getP_id());
			
			if(person.getP_name()==null)
				person.setP_name(pdb.getP_name());
			
			if(person.getP_gender()=='\u0000')
				person.setP_gender(pdb.getP_gender());
			
			if(person.getP_address()==null)
				person.setP_address(pdb.getP_address());
			
			if(person.getP_age()==0)
				person.setP_age(pdb.getP_age());
			
			if(person.getP_phone()==0)
				person.setP_phone(pdb.getP_phone());
			
			if(personId ==pdb.getP_id())
			{
				et.begin();
				em.merge(person);
				et.commit();
			}
		}
		else
		{
			System.out.println("No Data Found");
				
		}
		
	}
	public void deletePerson()
	{
		System.out.println("Please Enter PersonId to Delete Data : ");
		int personId = scanner.nextInt();
		Person pdb=em.find(Person.class, personId);
		if(pdb!=null)
		{
			if(personId==pdb.getP_id())
			{
				et.begin();
				em.remove(pdb);
				et.commit();
			}
		}
		else
		{
			System.out.println("No Data Found To Delete !");
		}
	}
	
	public void fetchPerson()
	{
		System.out.println("Enter Person Id : ");
		int personId = scanner.nextInt();
		System.out.println("Person Details : ");
		Person pdb = em.find(Person.class, personId );
		if(pdb!=null)
		{
			if(personId==pdb.getP_id())
			{
				System.out.println(pdb);
				/*Query query = em.createQuery("select p from Person p ");
				System.out.println(query.getResultList());*/
			}
			else
			{
				System.out.println("Please Enter valid Person Id ");
			}
		}
		
	}
}
