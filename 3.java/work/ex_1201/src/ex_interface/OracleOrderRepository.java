package ex_interface;

//Oracle과 연결하는 코드
public class OracleOrderRepository implements OrderRepository {

	@Override
	public void save() {
		System.out.println("오라클로 주문내역 저장");
	}
}
