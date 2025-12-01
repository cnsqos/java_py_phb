package exam;

// 전송만 한다.
public class NotificationService {
	void notifyUser(MessageSender sender, String message) {
		//어떤 종류의 전달방식이 오더라도 둘 다 send()메서드를 사용한다.
		sender.send(message);
	}	
}
