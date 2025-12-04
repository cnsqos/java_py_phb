package getter_setter;

public class Main {
	public static void main(String[] args) {
		Car c = new Car();
		//자동차 객체의 speed 필드에 접근할 수 있다.
		//속도는 음수가 될수 없다!!!
		//-150.0도 실수이기 때문에 문법적인 에러는 없다.
		//c.speed = -150.0;
		
		c.setSpeed(150.0);//속도를 세팅
		
		double speed = c.getSpeed(); //세팅된 필드의 값을 얻어올 수 있다.
		System.out.println("차량의 속도 : " + speed);
		
		//getter & setter를 사용하면 좋은 점
		//값에대한 검증을 할 수 있다.
		
		//getter만 제공하여 읽기 전용으로 만들 수 있다.
		//ex)주민등록 번호는 바뀔일이 거의 없다.
		
		//필드를 노출시키지 않을 수 있다.
		
		Score s = new Score();
		
		s.setKor(95);
		s.setEng(88);
		s.setMath(59);
		
		System.out.println("국어 : " + s.getKor());
		System.out.println("영어 : " + s.getEng());
		System.out.println("수학 : " + s.getMath());
		System.out.println("총점 : " + s.getTotal());
		System.out.println("평균 : " + s.getAverage());
		
		
		
		
		
		
		
		
	}
}
