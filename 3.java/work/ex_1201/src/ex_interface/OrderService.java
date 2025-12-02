package ex_interface;

//주문내역을 저장하는 기능
//어떤 DBMS를 사용하던지 상관없이 "주문을 저장하는 역할"에 충실하게 된다.
public class OrderService {
	
	//프론트에서 넘어온 주문내역을 MySQL에 저장하기 위해서 save()메서드를 호출해야 함
	//나중에 OracleOrderRepository로 바꾸고 싶으면 OrderService 코드를 뜯어 고쳐야함
	//private MySQLOrderRepository repository = new MySQLOrderRepository();
	
	//참조 변수를 선언
	//MySQL연결 객체
	//Oracle연결 객체
	private OrderRepository repository;
	
	//내가 코드를 고쳐야 하는 곳이 많다 -> 결합도가 높다. -> 결합도를 낮춰야 함
	
	//주문을 저장할 DBMS를 고르는 것은 OrderService객체를 만들 때 설정
	public OrderService(OrderRepository repository) {
		this.repository = repository;
	}
	
	public void createOrder() {
		repository.save();
	}
}
