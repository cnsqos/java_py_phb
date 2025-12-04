package singleton;

//디자인 패턴
//코드를 작성하는 방법론

//리모컨
public class Remocon {
	
	//private 접근 권한을 갖는 정적 필드 선언과 초기화
	//리모컨을 1개 만듦(static 때문에 한번만 메모리에 올라감)
	private static Remocon remocon = new Remocon();
	
	//private 접근 권한을 갖는 생성자
	//리모컨을 함부로 만들지 못하게 막음
	private Remocon() {
		
	}
	
	//위에서 만든 리모컨을 제공해주는 메서드
	public static Remocon getInstance() {
		return remocon;
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
