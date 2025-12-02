package app;

//A,B클래스는 module_a에서 옴
import pack1.A;
import pack2.B;
//C클래스는 module_b에서 왔다.
import pack3.C;

public class Main {
	public static void main(String[] args) {
		A a = new A();
		a.method();
		
		B b = new B();
		b.method();
		
		C c = new C();
		c.method();
	}
}
