package spring_annotation.dao;


import org.springframework.stereotype.Repository;

@Repository
public class StudentDaoHibernateImplementation implements StudentDao
{

	@Override
	public void save() {
		System.out.println("Implemented by using hibernate");
		
	}

}
