package exam;

public class Printer {


		public void print(String message) {
	       System.out.println(message);
	   }

	   public void print(int value) {
	       System.out.println("정수: " + value);
	   }

	   public void print(double value) {
	       System.out.println("실수: " + value);
	   }
	
}


//4번. 메서드 오버로딩 (10점)
//요구사항
//
//Printer 클래스를 작성한다
//다음 메서드를 오버로딩하여 작성한다
//void print(String message) → 매개변수로 받은 문자열을 출력
//void print(int value) → “정수: 10”을 출력
//void print(double value) → “실수: 3.14 ”을 출력
//main 메서드에서 Printer 객체를 생성하고 문자열, 정수, 실수를 각각 한 번씩 print 메서드로 출력하는 코드를 작성하라