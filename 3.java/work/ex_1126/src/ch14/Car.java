package ch14;

public class Car {
	//필드 선언(멤버 변수)
	String company = "현대자동차";
	String model;
	String color;
	int price;
	int maxSpeed;
	
	//기본생성자 선언하기
	public Car() {
		
	}
	
	//생성자 오버로딩
	public Car(String model) {
		this.model = model;
	}
	
	public Car(String model, String color) {
		this(model); //-> 위의 생성자를 호출
		this.color = color;
	}
	
	public Car(int maxSpeed, String model) {
		
	}
	
	public Car(String model, String color, int maxSpeed) {
		this(model,color);
		this.maxSpeed = maxSpeed;
	}
	
//	public Car(String model,String price) {
//		this(model,color);
//		this.maxSpeed = maxSpeed;
//	}
	
	//this() : 같은 클래스내의 다른 생성자를 호출
	
	
	
	
	
	
	
}
