package ch15;

public class Calculator {

	//리턴값이 없는 powerOn메서드 만들기
	//매개변수 없음
	//기능 : "전원을 켭니다" 문자열 출력
	public void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	
	public void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	
	//두 수를 더하는 plus 메서드 만들기
	//반환형 : int
	//매개변수 : 정수형 변수 2개
	//기능 : 두 수를 더하여 반환
	public int plus(int x, int y) {
		return x + y;
	}
	
	//두 수를 나누는 divide 메서드 작성하기
	//반환형 : double
	//매개변수 : 두 개의 정수형 변수
	//기능 : 두 수를 나눠서 반환
	public double divide(int x, int y) {
		return (double)x/y;
	}
	
	
	
	
	
	
	
	
}
