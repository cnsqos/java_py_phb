package exam;

public class Main {
	public static void main(String[] args) {
		
		NotificationService ns  = new NotificationService();
		
		//첫번째 인자로 Email,SMS객체를 전달
		EmailSender es = new EmailSender();
		SmsSender ss = new SmsSender();
		//두번째 인자로 메시지를 전달
		ns.notifyUser(es, "회원가입을 축하합니다.");
		ns.notifyUser(ss, "인증번호는 1234입니다");
		
		PayService ps = new PayService();
		
		Payment cp = new CardPayment();
		Payment kp = new KakaoPayPayment();
		
		ps.processPayment(cp, 10000);
		ps.processPayment(kp, 21000);
		
		
		
		
		
		
		
		
		
		
		
	}
}
