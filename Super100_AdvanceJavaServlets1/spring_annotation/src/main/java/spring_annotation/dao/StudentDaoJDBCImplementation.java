package spring_annotation.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDaoJDBCImplementation implements StudentDao
{
  
	@Override
	public void save() {
		System.out.println("Implemented by using jdbc");
		
	}

}
