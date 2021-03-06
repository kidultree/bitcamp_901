package study5;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import study4.ShopDto;

//@Component("myshop") 
//아이디 : shopController가 아닌 myshop으로 주고 싶을시 그냥 component+("myshop")

@Component
public class ShopController {
	//@Autowired //같은 타입을 찾아서 자동주입
	
	//@Resource(name = "mysqlDao") //정확한 id를 찾아서 자동 주입 (첫글자는 소문자)
	
	MysqlDao dao;
	
	public ShopController(MysqlDao dao) {
		this.dao = dao;
	}
	
	public void add(String sang, int price)
	{
		ShopDto dto = new ShopDto();
		dto.setSangpum(sang);
		dto.setPrice(price);
		
		dao.insertShop(dto);
	}
	
	public void delete(String sang)
	{
		dao.deleteShop(sang);
	}

}
