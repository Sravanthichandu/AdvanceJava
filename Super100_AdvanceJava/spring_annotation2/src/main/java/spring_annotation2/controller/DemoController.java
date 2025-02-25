package spring_annotation2.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dto.Demo6;
import spring_annotation2.DemoConfiguration;
import spring_annotation2.dao.Demo2;
import spring_annotation2.dto.Demo1;

public class DemoController {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(DemoConfiguration.class);
		System.out.println(context.getBean(Demo1.class));
		System.out.println(context.getBean(Demo2.class));
		System.out.println(context.getBean(Demo6.class));
		
	
	}
}
