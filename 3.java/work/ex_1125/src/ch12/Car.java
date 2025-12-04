package ch12;

public class Car{
	//필드
	//각 객체들이 가지는 속성
	String model;
	boolean start;
	int speed;
	String color;
	
	public void carInfo() {
		System.out.println(this.model);
		System.out.println(this.start);
		System.out.println(this.speed);
		System.out.println(this.color);
	}
}


