package student_mvc.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.stereotype.Repository;

import student_mvc.dto.Student;

@Repository
public class StudentDao {

	EntityManager em = Persistence.createEntityManagerFactory("hamitha").createEntityManager();
	EntityTransaction et = em.getTransaction();
	
	public void save(Student student)
	{
		et.begin();
		em.persist(student);
		et.commit();
	}
	public void login(Student student)
	{
	  Student stdDb	=em.find(Student.class, student);
	  if(stdDb.getEmail().equalsIgnoreCase("email"))
	  {
		  if(stdDb.getPwd().equalsIgnoreCase("pwd"))
		  {
			  System.out.println("Login Success");
		  }
		  else
		  {
			  System.out.println("Incorrect Password");
		  }
	  }
	  else
	  {
		  System.out.println("Incorrect Email");
	  }
	}
}
