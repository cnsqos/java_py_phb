package exam;

public class KakaoPayPayment implements Payment{

	@Override
	public void pay(int amount) {
		System.out.println("카카오페이로 " + amount+"원 결제");
	}

}
