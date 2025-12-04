package class_casting;

public class Main {
	public static void main(String[] args) {
		
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		dog.sound();
		cat.sound();
		
		//자동형변환
		//byte -> short -> int -> long
		long l = 100;//int가 long보다 작으니까 자동형변환이 된다.
		double d = 100;//int가 double보다 작으니까 자동형변환이 된다.
		
		//Animal(부모클래스) -> 상위타입
		//Dog,Cat(자식클래스) -> 하위타입
		
		Animal a1 = new Dog(); //Dog타입의 객체를 Animal타입의 변수에 넣을 수 있다.
		Animal a2 = new Cat();
		
		a1.sound();
		a2.sound();
		
		//부모 타입으로 타입변환을 하는 이유
		//1. 자식 객체를 부모 타입의 변수에 넣어서 다루면, 코드를 더 통일성 있게
		//관리할 수 있다.
		//2. 상속만 하면 자식 클래스마다 변수를 따로 만들어야 한다.
		//부모타입으로 관리하면 하나의 부모 타입 배열이나 리스트에 담아 관리할 수 있다.
		
		Animal[] animals = { new Dog(), new Cat()};
		
		for( Animal a : animals) {
			a.sound();
		}
		
		//자식객체를 생성
		Child child = new Child();
		
		//부모타입으로 변환
		Parent parent = child;
		
		parent.field1 = "data1";
		parent.method1(); //부모클래스에 있는 메서드 호출
		parent.method2(); //자식클래스에 오버라이딩된 메서드가 호출
		//부모타입으로 변환하면 자식클래스에 정의한 내용은 쓸 수 없다.
		//parent.field2 = "data2";
		//parent.method3(); (호출 불가능)
		
		//자식것을 못쓰는 이유
		//자바는 "참조 변수의 타입"을 기준으로 접근 가능한 멤버가 결정된다.
		//부모 클래스에는 자식 멤버의 정보가 없다.
		
		
		//자식 객체의 메서드가 호출되는 이유
		//메서드는 실행 시점에서 성격이 결정되는 동적바인딩이기 때문이다.
		//컴파일 시점에서는 실행되는 메서드가 부모클래스의 것인지 자식클래스의 것인지
		//알기가 어렵다.
		//실행 시점에 동적 바인딩이 일어나 부모가 자식 클래스의 멤버함수에 접근하여
		//실행할 수 있다.
		
		//자식 타입으로 강제 타입변환
		Child child2 = (Child)parent;
		
		child2.field2 = "data2";
		child.method3();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
