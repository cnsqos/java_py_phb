package ex_interface;

//주문내역을 저장하는 기능
public class OrderService {

	//프론트에서 넘어온 주문내역을 My SQL에 저장하기 
	private MySQLOrderRepository repository = new MySQLOrderRepository();
	
	public void createOrder() {
		repository.save();
	}
}
