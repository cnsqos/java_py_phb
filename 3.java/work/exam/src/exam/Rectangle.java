package exam;

public class Rectangle extends Shape {
	double width;
	double height;
	
	
	public Rectangle(double width, double height) {
	       this.width = width;
	       this.height = height;
	}

	public double area() {
	       return width * height;
	}
}

//Rectangle 클래스
//Shape를 상속
//필드: double width, double height
//생성자: 두 필드를 초기화하는 생성자
//area() 구현 → width * height 반환
