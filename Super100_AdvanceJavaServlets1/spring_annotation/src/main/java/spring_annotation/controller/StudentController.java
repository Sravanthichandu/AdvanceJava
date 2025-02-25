package spring_annotation.controller;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import lombok.Data;


@Data
@Controller
public class StudentController {

	@Qualifier("studentDaoHibernateImplementation")
	@Autowired
	spring_annotation.dao.StudentDao dao;
	
	@PostConstruct
	public void start()
	{
		System.out.println("Application Started");
	}
	
	@PreDestroy
	public void end()
	{
		System.out.println("Application Ended");
	}
}

/*we can use preDestroy Postcons*/