package ex_interface;

public interface OrderRepository implements OrderReport{
	 
	public void save() {
		System.out.println("MySQL 주문내역 저장");
	}
}
