package ex_interface;

import java.util.List;

//MySql과 연결하는 코드
public class MySQLOrderRepository implements OrderRepository {

	@Override
	public void save() {
		System.out.println("MySQL 주문내역 저장");
	}
}
