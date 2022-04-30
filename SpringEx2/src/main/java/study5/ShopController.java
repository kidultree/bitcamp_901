package study5;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import study4.ShopDto;

//@Component("myshop") 
//���̵� : shopController�� �ƴ� myshop���� �ְ� ������ �׳� component+("myshop")

@Component
public class ShopController {
	//@Autowired //���� Ÿ���� ã�Ƽ� �ڵ�����
	
	//@Resource(name = "mysqlDao") //��Ȯ�� id�� ã�Ƽ� �ڵ� ���� (ù���ڴ� �ҹ���)
	
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