package study2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentMain {

	public static void main(String[] args) {
		ApplicationContext context =
				new ClassPathXmlApplicationContext("appContext.xml");
		
		Student stu = (Student)context.getBean("stu");
		System.out.println(stu.toString());
		System.out.println(stu);//toString ���� ����
	}

}
