package board.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

//2개의 인터페이스 중 하나 아무거나 사용 가능

//public interface MyCarDaoInter extends CrudRepository<MyCarDto, Long>{}
public interface MyCarDaoInter extends JpaRepository<MyCarDto, Long>{

}