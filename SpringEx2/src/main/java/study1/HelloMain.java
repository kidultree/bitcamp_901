package study1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloMain {

	public static void main(String[] args) {
		//자바방식으로 생성
		Hello h1 = new Hello();
		System.out.println(h1.getInfo());
		
		Hello h2 = new Hello();
		System.out.println(h2.getInfo());
		System.out.println("** 주소 비교 **");
		System.out.println(h1.hashCode()+":"+h2.hashCode());
		
		
		System.out.println("** 스프링 방식 **");
		ApplicationContext context =
				new ClassPathXmlApplicationContext("appContext.xml");
		
		Hello h3 = (Hello)context.getBean("hello"); 
		//getBean : 반환타입이 object이다 따라서 형변환
		System.out.println(h3.getInfo());
		
		Hello h4 = context.getBean("hello", Hello.class);
		System.out.println(h4.getInfo());
		
		//스프링에서 bean 으로 생성시 주소가 모두 같다 
		//bean 설정시 scope 기본값이 singleton
		System.out.println(h3.hashCode()+":"+h4.hashCode());
		
	}

}
