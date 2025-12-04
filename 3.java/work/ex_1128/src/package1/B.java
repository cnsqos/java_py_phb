package package1;

public class B {

	//접근제한자 : public
	//반환타입 : void
	//메서드명 : method
	
	public void method() {
		//같은 패키지에 있기 때문에 필드,메소드,생성자에 접근이 가능하다.
		A a = new A(); 
		a.field = "value";
		a.method();
		
	}
}
