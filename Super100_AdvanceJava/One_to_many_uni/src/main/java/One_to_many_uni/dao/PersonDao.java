package One_to_many_uni.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import One_to_many_uni.dto.Person;

public class PersonDao {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("hamitha");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	
	public void savePerson(Person person)
	{
		et.begin();
		em.persist(person);
		et.commit();
		
	}
	
}
