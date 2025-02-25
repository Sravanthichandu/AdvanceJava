package spring_Annotation.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import spring_Annotation.DemoConfig;
import spring_Annotation.dto.Demo1;
import spring_Annotation.dto.Demo2;
import spring_Annotation_dto.Demo8;

public class DemoController {

	public static void main(String[] args) {
		/*
		ApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
		System.out.println(context);*/
		ApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
		Demo1 demo1=context.getBean(Demo1.class);
		System.out.println(demo1);
		Demo2 demo2=context.getBean(Demo2.class);
		System.out.println(demo2);
		Demo8 d8=context.getBean(Demo8.class);
		System.out.println(d8);
		/*it will wont create object beacause in Democonfig @componentScan scan all the base packages
		 * i.e same package name .extensions can be anything it will create object
		 * for other packages we give @component to create object it will wont create*/
	}
}
