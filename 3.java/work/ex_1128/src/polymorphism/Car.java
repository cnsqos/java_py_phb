package polymorphism;

//자동차
public class Car {

	//필드로 선언을 한다.
	Tire tire;//null 객체형 변수는 기본값이 null
	//Tire 타입으로 만들 수 있는 객체는 전부 들어올 수 있다.
	int i;//0
	
	//메서드 선언
	public void run() {
		//tire 필드에 대입된 객체의 roll()메서드를 호출
		tire.roll();
	}
	
	public void stop() {
		tire.stop();
	}
}





