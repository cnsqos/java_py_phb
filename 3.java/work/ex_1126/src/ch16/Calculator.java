package ch16;

public class Calculator {
	
	static double pi = 3.141592;

	//정사각형의 넓이
	double areaRectangle(double width) {
		return width * width;
	}
	
	//직사각형의 넓이
	//가로 세로의 길이가 다르다.
	double areaRectangle(double width, double height) {
		return width * height;
	}
	
	public static void plus(int x, int y) {
		System.out.println(x+y);
	}
}








