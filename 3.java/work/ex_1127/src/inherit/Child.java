package inherit;

public class Child extends Parent{
	
	int c = 20;
	
	//부모클래스의 생성자가 매개변수를 가지면 자식 클래스에서 생략할 수 없다
	public Child(int p) {
		super(p); //부모클래스의 생성자를 의미(생략 가능)
	}
	
	public void childMethod() {
		System.out.println("자식 메서드");
	}

}
