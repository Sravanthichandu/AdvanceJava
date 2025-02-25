package spring_user.controller;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import spring_user.dto.User;

public class UserController {

	public static void main(String[] args) {
		
		Resource r = new ClassPathResource("user.xml");
		BeanFactory bf =new XmlBeanFactory(r);//only in spring 5 version it is working it is depricated
		System.out.println(bf);
		//searching by class---User.class
		User u1 = bf.getBean(User.class);
		System.out.println(u1);
		User u2 = bf.getBean(User.class);
		System.out.println(u2);
		User u3 = bf.getBean(User.class);
		System.out.println(u3);
		System.out.println("=============================");
		//searching by id -- user(user.xml)
		User u =(User) bf.getBean("user");  //casting
		System.out.println(u);
		User v =(User) bf.getBean("user");  //casting
		System.out.println(v);
		User w =(User) bf.getBean("user");  //casting
		System.out.println(w);
		
		
		//by using scope changing it to prototype we can store objects in different different location
		//the default is singleton 
	}
}
