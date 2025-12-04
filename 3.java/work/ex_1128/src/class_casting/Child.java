package class_casting;

public class Child extends Parent {
	
	String field2;

	@Override
	public void method2() {
		System.out.println("자식이 오버라이딩한 메서드2 호출");
	}
	
	public void method3() {
		System.out.println("자식 클래스에만 있는 메서드3");
	}
}
