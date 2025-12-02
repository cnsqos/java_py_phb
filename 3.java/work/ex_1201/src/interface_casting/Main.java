package interface_casting;

public class Main {
	public static void main(String[] args) {
		//Vehicle -> Bus
		
		//인터페이스를 상위타입으로 본다.
		//인터페이스 타입의 참조변수에 구현객체가 대입될 수 있다.
		//자동타입변환이 일어난다.
		Vehicle vehicle = new Bus();
		
		//부모타입으로 바뀌었어도 오버라이드된 메서드가 호출된다.
		vehicle.run();
		
		//자식 클래스에 정의된 고유한 것들은 사용할 수 없다.
		//vehicle.checkFare();
		
		//자식 클래스에 정의된 내용을 사용하고 싶다면 자식타입으로 변환을 해야한다.
		Bus bus = (Bus)vehicle;
		bus.run();
		bus.checkFare();
		
		
		
		
		
		
		
		
		
		
	}
}
