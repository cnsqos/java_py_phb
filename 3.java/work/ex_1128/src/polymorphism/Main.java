package polymorphism;

public class Main {
	public static void main(String[] args) {
		//자동차 객체를 만든다.
		Car myCar = new Car();
		
		//Car클래스의 필드인 tire에 Tire객체를 대입
		myCar.tire = new Tire();
		myCar.run();
		
		//HankookTire 객체를 대입
		myCar.tire = HankookTire.getInstance();
		myCar.run();
		
		myCar.tire = new KumhoTire();
		myCar.run();
		
		myCar.tire = HankookTire.getInstance(); //동일한 객체를 호출
		myCar.stop();
		
		Driver driver = new Driver();
		
		//Bus bus = new Bus();
		//driver.drive(bus);
		driver.drive(new Bus());
		
		//Taxi taxi = new Taxi();
		//driver.drive(taxi);
		driver.drive(new Taxi());
		
		
		
		
		
	}
}
