package hibernate_user.dao;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import hibernate_user.dto.User;

public class UserDao {

	static Scanner s = new Scanner(System.in);
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("hamitha");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	public void saveUser(User user)
	{
		
		/*begin and commit are helper methods present in entityTransaction it helps to save our data in database*/
		et.begin();
		em.persist(user);
		et.commit();
	}
	public void fetchUser(int id)
	{
		User db = em.find(User.class, id);
		if(db!=null)
			System.out.println(db);
		else
			System.out.println("Data not Found");
	}
	public void deleteUser(int id)
	{
		User db = em.find(User.class, id); //first fetch
		if(db!=null)
		{
			et.begin();
			em.remove(db);
			et.commit();
		}
		else
		{
			System.out.println("Data is not exist to delete please provide correct data");
		}
	}
	public void fetchAll()
	{
		//em.createQuery("select * from User");
		Query query = em.createQuery("select s from User s");
		System.out.println(query.getResultList());
	}
	public void updateUser(User user)
	{
		System.out.println("Enter user id to update Data : ");
		int uid = s.nextInt();
		User db = em.find(User.class,uid);
		
		if(db!=null)
		{
			if(user.getuID()==0)
				user.setuID(db.getuID());
			if(user.getName()==null)
				user.setName(db.getName());
			if(user.getEmail()==null)
				user.setEmail(db.getEmail());
			if(user.getPassword()==null)
				user.setPassword(db.getPassword());
			if(user.getPhone()==0)
				user.setPhone(db.getPhone());
			if(uid==db.getuID())
			{
				et.begin();
			    em.merge(user);
			    et.commit();
			}
		
		}
		else
		{
			System.out.println("Data not Found to update");
		}
		
	}
	
}
/*if u want to see your sql query in persistence.xml -- in property hibernate.show_sql make value as true else false*/
/*For update operation we use hibernate helper method called merge() it is argumented 
 * it take argument as entity object
 * merge method work as insert(save) and update operation
 * if the primary key column value is present in the table (if it exists)--work as update operation
 * if not it insert the data -- work as insert or (save) operation*/
 