package ch_14;

public class CarMain {
	public static void main(String[] args) {
		//기본생성자를 통해 객체 생성하기
		Car c1 = new Car();
		System.out.println("c1.company : " + c1.company);
		System.out.println("--------------------");
		
		//model을 인자로 받는 생성자
		Car c2 = new Car("소나타");
		System.out.println("c2.company : " + c2.company);
		System.out.println("c2.model : " + c2.model);
		System.out.println("--------------------");
		
		
		//model과 color를 인자로 받는 생성자
		
		Car c3 = new Car("아반떼","white");
		System.out.println("c3.company : " + c3.company);
		System.out.println("c3.model : " + c3.model);
		System.out.println("c3.color : " + c3.color);
		System.out.println("--------------------");
		
		//model,color,maxSpeed를 인자로 받는 생성자.
		
		Car c4 = new Car("펠리세이드","black", 200);
		System.out.println("c4.company : " + c4.company);
		System.out.println("c4.model : " + c4.model);
		System.out.println("c4.color : " + c4.color);
		System.out.println("c4.color : " + c4.maxSpeed);
		
	}
}
