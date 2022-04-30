package study3;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration //= ������ ������ ���Ǵ� Ŭ����
@Component //xml �� �ڵ����� bean ������ش�
public class ApplicationConfig {
	
	@Bean //bean���� �ν��� �� �ֵ��� ������̼�
	public Person person3() //�޼��� ���� ���̵�� �ν�
	{
		List<String> hobby = new ArrayList<String>();
		hobby.add("�뷡�ϱ�");
		hobby.add("���߱�");
		hobby.add("��å�ϱ�");
		
		Person p = new Person(hobby);
		p.setAddress("�̱� LA");
		return p;
	}

}