package ch12;

public class CarExample {
	public static void main(String[] args) {
		//자동차 객체 생성하기
		//변수명 c1
		Car c1 = new Car();
		//클래스에 포함된 필드들을 출력하기
		c1.model = "소나타";
		c1.start = false;
		c1.speed = 60;
		c1.color = "white";
		System.out.println(c1.model);
		System.out.println(c1.start);
		System.out.println(c1.speed);
		

		System.out.println(c1.color);
		
		//자동차 객체 c2 만들기
		//c2의 필드값 출력하기
		Car c2 = new Car();
		c2.model = "아반떼";
		c2.start = false;
		c2.speed = 120;
		c2.color = "gray";
		
		c2.carInfo();
		
		System.out.println(c2.toString());
		
		
		
		
		
		
		
	}
}
