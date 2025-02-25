package Student.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import Student.dto.Student;

public class StudentDao {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("hamitha");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	
	//save Student or insert 
	public void saveStudent(Student student)
	{
		et.begin();
		em.persist(student);
		et.commit();
	}
	
	//fetch student
	
	public void fetchStudent(int studentId)
	{
		em.find(Student.class,studentId);
	}
	
	//delete Student
	public void removeStudent(Student student)
	{
		Student std_data=em.find(Student.class, student.getStdId());
		if(std_data!=null)
		{
			et.begin();
			em.remove(std_data);
			et.commit();
		}
		else
		{
			System.out.println("No Data is Found to Delete ..");
		}
	}
	
	//update Student
	public void updateStudent(Student student)
	{
		
	}
	
}
