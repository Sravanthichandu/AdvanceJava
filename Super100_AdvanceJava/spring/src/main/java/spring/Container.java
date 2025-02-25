package spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Container {

	public static void main(String[] args) {
		
		Demo a1 = new Demo();
		Demo a2 = new Demo();
		Demo a3 = new Demo();
		System.out.println(a1+"\n"+a2+"\n"+a3);
		System.out.println("-------------------------------");
		
		Resource r = new ClassPathResource("containerConfig.xml");
		BeanFactory bf = new XmlBeanFactory(r);
		System.out.println(bf);
		System.out.println("---------------------------------");
		Demo d1 = bf.getBean(Demo.class);
		System.out.println(d1);
		Demo d2 = bf.getBean(Demo.class);
		System.out.println(d2);
		Demo d3 = bf.getBean(Demo.class);
		System.out.println(d3);
		Demo d4 = bf.getBean(Demo.class);
		System.out.println(d4);
		
		System.out.println(bf.getBean(Demo1.class));
		
		
	}
}

/*it will not throw any exception during creation while accessing it throws
 * for accessing we use getBean(class name or reference)*/
 