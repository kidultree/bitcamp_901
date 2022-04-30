package study1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloMain {

	public static void main(String[] args) {
		//�ڹٹ������ ����
		Hello h1 = new Hello();
		System.out.println(h1.getInfo());
		
		Hello h2 = new Hello();
		System.out.println(h2.getInfo());
		System.out.println("** �ּ� �� **");
		System.out.println(h1.hashCode()+":"+h2.hashCode());
		
		
		System.out.println("** ������ ��� **");
		ApplicationContext context =
				new ClassPathXmlApplicationContext("appContext.xml");
		
		Hello h3 = (Hello)context.getBean("hello"); 
		//getBean : ��ȯŸ���� object�̴� ���� ����ȯ
		System.out.println(h3.getInfo());
		
		Hello h4 = context.getBean("hello", Hello.class);
		System.out.println(h4.getInfo());
		
		//���������� bean ���� ������ �ּҰ� ��� ���� 
		//bean ������ scope �⺻���� singleton
		System.out.println(h3.hashCode()+":"+h4.hashCode());
		
	}

}