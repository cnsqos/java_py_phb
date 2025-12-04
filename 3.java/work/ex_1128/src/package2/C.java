package package2;

//a클래스 import하기
import package1.A;

public class C {
	//A클래스와 다른 패키지에 있기 때문에 protected로 선언된
	//필드, 생성자, 메소드에 접근할수 없다.
	public void method() {
		//A a = new A(); //X
		//a.field = "value"; //X
		//a.method(); //X
	}
}
