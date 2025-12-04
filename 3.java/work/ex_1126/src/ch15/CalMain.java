package ch15;

public class CalMain {
	public static void main(String[] args) {
		//클래스에 속해있는 함수는 독립적으로 실행할 수 없다.
		
		//객체를 생성하고 객체를 통해서 호출해야 한다.
		Calculator c = new Calculator();
		
		c.powerOn();
		c.powerOff();
		
		//plus 메서드 호출하여 5와 6을 인자로 전달하고
		//덧셈 결과를 result1변수에 대입하기
		
		int result1 = c.plus(5,6);
		System.out.println("result1 : " + result1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
