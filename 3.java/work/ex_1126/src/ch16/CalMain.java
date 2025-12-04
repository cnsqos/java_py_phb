package ch16;

public class CalMain{
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		
		//길이가 4인 정사각형의 넓이 구하여 출력하기
		double result = calc.areaRectangle(4);
		System.out.println("정사각형의 넓이 : " + result);
		//가로가 5, 세로가 10인 직사각형의 넓이를 구하여 출력하기
		result = calc.areaRectangle(5,10);
		System.out.println("직사각형의 넓이 : " + result);
		
		System.out.println(Calculator.pi);
		System.out.println(calc.pi);
		
		Calculator.plus(10, 5);
		
		
		
		
		
		
		
		
		
		
		
		
			
	}
}
