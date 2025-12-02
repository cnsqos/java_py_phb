package ex_interface;

public class Main {
	public static void main(String[] args) {
		//인터페이스는 직접 객체로 만들 수 없다.
		Dog d = new Dog();
		
		d.eat();
		d.sleep();
		
		//Dog입장에서는 "Animal 규격을 따르는 객체"가 된 것이라서, Animal 타입으로 
		//타입변환이 가능하다.
		
		Animal a = d;
		
		a.eat();
		a.sleep();
		
		
		//상수의 사용
		System.out.println("MyInteface의 상수 MAX_COUNT : " + MyInterface.MAX_COUNT);
		//static 메서드의 사용
		MyInterface.printInfo();
		
		MyInterface mi = new MyService();
		
		//추상메서드 구현체의 사용
		mi.doWork();
		//디폴트 메서드의 사용
		mi.log("디폴트 메서드 출력");
		
		OrderService os = new OrderService(new MySQLOrderRepository());
		
		
		
		
		
	}
}
