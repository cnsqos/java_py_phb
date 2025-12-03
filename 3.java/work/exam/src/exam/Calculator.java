package exam;

public class Calculator {	

		   public int add(int a, int b) {
			   return a + b; 
		   }
		   public int subtract(int a, int b) {
			   return a - b;
		   }
		   public int multiply(int a, int b) {
			   return a * b;
		   }
		   
		   public double divide(int a, int b) {
		       if (b == 0) return 0;
		       return (double) a / b;
		   }
		}



//2번. 메서드 구현 및 반환값 활용 (10점)
//요구사항
//
//Calculator 클래스를 작성한다
//다음 메서드를 작성한다
//int add(int a, int b) → a + b 반환
//int subtract(int a, int b) → a - b 반환
//int multiply(int a, int b) → a * b 반환
//double divide(int a, int b) → a / b 결과를 실수로 반환
//b가 0이면 0을 반환하도록 한다 (예외 처리는 사용하지 않는다)
//main 메서드에서 Calculator 객체를 생성하고 위 네 메서드를 각각 한 번씩 호출하여 결과를 출력하는 코드를 작성하라