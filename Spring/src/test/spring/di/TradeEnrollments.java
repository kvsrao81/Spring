package test.spring.di;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

@SuppressWarnings("deprecation")
public class TradeEnrollments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
		//Person person = (Person)factory.getBean("person");
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		Person person = (Person) ctx.getBean("person");
		person.printDetails();
	}

}
