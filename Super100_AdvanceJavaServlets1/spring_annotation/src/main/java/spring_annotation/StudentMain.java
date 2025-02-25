package spring_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import spring_annotation.controller.StudentController;

public class StudentMain {
	
   public static void main(String[] args) {
	
	 //  ApplicationContext conatiner = new AnnotationConfigApplicationContext(StudentConfig.class);
	   
	   AnnotationConfigApplicationContext conatiner = new AnnotationConfigApplicationContext(StudentConfig.class);
	   StudentController stdconntroller = conatiner.getBean(StudentController.class);
	   System.out.println(stdconntroller);
	   conatiner.close();
	   
}
	
}
