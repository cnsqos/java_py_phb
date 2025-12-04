package package2;

import package1.A;
//A클래스 상속하기
public class D extends A{

	//기본생성자 만들기
	public D() {
		super();// -> A() 생성자를 호출하는게 가능하다.
	}
	
	public void method1() {
		//상속받은 내용을 "내 것 처럼 쓸 수 있다"는 걸 보여주기 위해서 this를 쓸 수 있다.
		this.field = "value"; //상속받은 필드에 접근
		this.method(); //상속받은 메서드에 접근
	}
	
	public void method2() {
		//protected 접근제한은 자식클래스에서는 super()로 호출이 가능하나
		//그냥 new A()로 객체를 만드는것은 다른 패키지에서는 허용되지 않는다.
		A a = new A();
	}
	
	
	
	
	
	
}
