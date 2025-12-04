package ex_system;

public class InExample {
	public static void main(String[] args) throws Exception {
		//자바는 키보드로부터 입력된 키를 읽기 위해 System클래스에서
		//in 필드를 제공한다
		//in 필드를 이용해서 read()메서드를 호출하면 입력된 키의 코드값을 얻을 수 있다.
		int speed = 0;
		int keyCode = 0;
		
		while(true) {
			if(keyCode != 13 && keyCode != 10) {
				if(keyCode == 49) { //숫자 1키를 읽었을 경우
					speed++;
				} else if( keyCode == 50) { //숫자 2키를 읽었을 경우
					speed--;
				} else if( keyCode == 51) { //숫자 3 키를 읽었을 경우
					break;
				}
				System.out.println("--------------------------------");
				System.out.println("1. 증속 | 2. 감속 | 3. 중지");
				System.out.println("--------------------------------");
				System.out.println("현재 속도 = " + speed);
				System.out.println("선택:");
			}
			
			//키를 하나씩 읽는다.
			keyCode = System.in.read();
		}
		System.out.println("프로그램 종료");
	}
}









