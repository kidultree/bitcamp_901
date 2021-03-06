package study3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonMain {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("myContext.xml");
		Person p1 = (Person) context.getBean("person");
		p1.write();
		System.out.println("-------------------------");

		Person p2 = (Person) context.getBean("person2");
		p2.write();
		
		System.out.println("-------------------------");
		
		Person p3 = (Person) context.getBean("person3");
		p3.write();
	}

}
