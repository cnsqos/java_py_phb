package exam;

public interface MessageSender {
	void send(String msg);
}

//인터페이스 : MessageSender
//- void sned(String msg);
//
//클래스 : EmailSender, SmsSender (인터페이스 구현)
//Email : "이메일 발송 <메시지>"
//SMS : "SMS 발송 <메시지>"
//
//NotificationService 클래스를 만들고
//void notifyUser(MessageSender sender, String message) 메서드 만들기
//
//Main에서 EmailSender, SmsSender 테스트하기