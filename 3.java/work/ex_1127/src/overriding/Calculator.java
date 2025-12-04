package overriding;

public class Calculator {

	
	public double areaCircle(double r) {
		System.out.println("부모클래스의 메서드 실행");
		return 3.14 * r * r;
	}
}
