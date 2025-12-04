package inherit;

//Animal클래스의 멤버 변수와 메서드를 상속받는다.
public class Dog extends Animal{

	//자식만의 고유한 내용을 정의할 수 있다.
	public void bark() {
		System.out.println(name+"가(이) 멍멍 짖는다.");
	}
}
