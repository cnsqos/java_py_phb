package inherit;

public class Main {
	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.name = "노루";
		animal.eat();
		animal.sleep();
		//animal.bark();
		Dog dog = new Dog();
		
		//Animal클래스를 상속받은 Dog클래스는
		//Animal클래스가 가지고 있는 멤버를 모두 사용할 수 있다.
		dog.name = "바둑이";
		dog.eat();
		dog.sleep();
		dog.bark();
		
		Bird bird= new Bird();
		bird.name="피죤";
		bird.eat();
		bird.sleep();
		bird.fly();
		
		Child child = new Child(10);
		
		
		
		
		
	}
}
