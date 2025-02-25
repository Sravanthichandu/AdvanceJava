package spring_annotation_student.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import spring_annotation_student.StudentConfiguration;
import spring_annotation_student.dto.Student;

public class StudentController {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(StudentConfiguration.class);
		Student stu=context.getBean(Student.class);
		System.out.println(stu);
	}
}
