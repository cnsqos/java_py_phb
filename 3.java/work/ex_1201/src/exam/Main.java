package exam;

public class Main {
	public static void main(String[] args) {
		Playable p = new MusicPlayer();
        p.play();

	
	 DocumentProcessor dp = new DocumentProcessor();
     dp.print();  
     dp.sort();
     
     NotificationService ns = new NotificationService();
     EmailSender es = new EmailSender();
     SmsSender sms = new SmsSender();
     
     ns.notifyUser(es, "ㅎㅇ");
     ns.notifyUser(sms, "ㅂㅇ"); 
     
     PayService ps = new PayService();
     CardPayment cp = new CardPayment();
     KakaoPayPayment kp = new KakaoPayPayment();
     
     ps.processPayment(cp, 10000);
     ps.processPayment(kp, 20000);
     
     
     
	}
}
