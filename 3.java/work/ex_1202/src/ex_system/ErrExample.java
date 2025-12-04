package ex_system;

public class ErrExample {
	public static void main(String[] args) {
		try {
			//에러가 날 수도 있는 코드를 작성
			int value = Integer.parseInt("1oo");
		} catch (Exception e) {
			//에러가 발생했을 때 뭘 할건데?
			System.err.println("[에러내용]");
			System.err.println(e.getMessage());
			//out 필드 : 콘솔에 원하는 문자열을 출력할 수 있게 해준다.
			//err 필드 : out과 동일한데, 차이점은 콘솔 종류에 따라 에러 내용이 빨간색으로 출력된다.
		}
	}
}
