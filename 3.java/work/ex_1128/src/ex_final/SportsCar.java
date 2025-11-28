package ex_final;

public class SportsCar extends Car{
	
	@Override
	public void speedUp() {
		speed += 10;
	}
	
	//final로 선언된 stop()메서드는 오버라이딩 할 수 없다.
	
	//부모클래스의 메서드가 final로 지정되면 자식이 오버라이딩 할 수 없다.
	
}
