package springAnnotations;



import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import springAnnotations.dto.Jspiders;

public class Main {
	
	public static void main(String[] args) {
		
		ApplicationContext J2EEContainer = new AnnotationConfigApplicationContext(DemoConfig.class);
		Jspiders jspiders = J2EEContainer.getBean(Jspiders.class);
		System.out.println(jspiders);
		System.out.println(J2EEContainer.getBean(List.class));
		
	}

}

