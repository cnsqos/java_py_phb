package exam;

public class CardPayment implements Payment{

	@Override
	public void pay(int amount) {
		System.out.println("카드로 " + amount + "원 결제");
	}
}


//인터페이스 : Payment
//- void pay(int amount);
//
//클래스 : CardPayment, KakaoPayPayment (Payment 구현하기)
//Card : "카드로 xx원 결제"
//Kakao : "카카오페이로 xx원 결제"
//
//결제기능을 가지고 있는 PayService 클래스 
//public void processPayment(Payment payment, int amount)
//
//Main에서 다음의 결과가 나오도록 작성하기
//CardPayment로 10000원 결제
//KakaoPayPayment로 20000원 결제