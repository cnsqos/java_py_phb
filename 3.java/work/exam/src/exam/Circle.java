package exam;

public class Circle extends Shape{
	double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double area() {
	       return 3.14 * radius * radius;
	}
}


//Circle 클래스
//Shape를 상속
//필드: double radius(반지름)

//생성자: 반지름을 초기화하는 생성자

//area() 구현 → 3.14 * radius * radius 반환
//
//main 메서드에서
//Shape 타입 배열을 만들어 가로 4, 세로 5인 Rectangle 반지름 3인 Circle 를 넣고, 각 도형의 넓이를 출력하는 코드를 작성하라
//