package exam;

//Email로 보내던지 SMS 보내던지간에 방법은 잘 모르겠고
//"전송은 해줄게" 하는 역할만 한다.
public class NotificationService {

	public void notifyUser(MessageSender sender, String message) {
		//어떤 종류의 전달방식이 오더라도 둘 다 send()메서드를 사용한다.
		sender.send(message);
	}
}












