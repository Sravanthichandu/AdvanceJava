package spring_user.controller;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import spring_user.dto.User;

public class UserControllerForConstructorInjectionInDependencyInjection {

	public static void main(String[] args) {
		
		BeanFactory bf = new XmlBeanFactory(new ClassPathResource("userConstructorInjection.xml"));
		User user = bf.getBean(User.class);
		System.out.println(user);
		/*According to the constructor present in the user class
		 * the constructor-args present in xml file 
		 * will checks the matching constructor present in user
		 * and after it check type,noofarguments and order */
		
	}
}
