package package2;

import package1.*;

public class C {

	//A a; A클래스의 접근제한이 default기 때문에 안된다.
	B b; // public이라 된다.
	
	A a1 = new A(true);
	//A a2 = new A(1); 생성자가 default
	//A a3 = new A("문자열"); 생성자가 private
}







