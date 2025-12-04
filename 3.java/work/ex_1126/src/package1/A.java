package package1;

//A클래스의 접근 제한은 default로 설정이 되어있고
//같은 패키지 내에서만 접근이 가능하다.
public class A {
	public int field1 = 1;
	int field2 = 1;
	private int field3 = 1;
	
	public void method1() {};
	void method2() {};
	private void method3() {};
	
	public A() {
	
	}

	public A(boolean b) {
		
	}
	
	A(int b){
		
	}
	
	private A(String s) {
		
	}
}
