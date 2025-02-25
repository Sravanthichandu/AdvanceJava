package spring_user.controller;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import spring_user.dto.User;


public class UserControllerForFieldInjection {

	public static void main(String[] args) {
		
		BeanFactory bf = new XmlBeanFactory(new ClassPathResource("userFieldInjection.xml"));
		User user1 = bf.getBean(User.class);
		System.out.println(user1);
				
	}
}
