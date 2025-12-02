package ex_interface;

//인터페이스간 상속도 가능하다.
public interface A {
	void methodA();
}

interface B extends A{
	void methodB();
}
