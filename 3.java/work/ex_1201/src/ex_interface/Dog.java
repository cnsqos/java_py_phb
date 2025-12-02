package ex_interface;

//인터페이스를 구현한 클래스는 추상메서드를 반드시 오버라이드 해야한다.
public class Dog implements Animal{

	@Override
	public void eat() {
		System.out.println("개가 밥을 먹는다.");
	}

	@Override
	public void sleep() {
		System.out.println("개가 잠을 잔다.");
	}

}
