package study3;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration //= 스프링 설정에 사용되는 클래스
@Component //xml 에 자동으로 bean 등록해준다
public class ApplicationConfig {
	
	@Bean //bean으로 인식할 수 있도록 어노테이션
	public Person person3() //메서드 명을 아이디로 인식
	{
		List<String> hobby = new ArrayList<String>();
		hobby.add("노래하기");
		hobby.add("춤추기");
		hobby.add("산책하기");
		
		Person p = new Person(hobby);
		p.setAddress("미국 LA");
		return p;
	}

}
