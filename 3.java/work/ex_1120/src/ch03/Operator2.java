package ch03;

public class Operator2 {
	public static void main(String[] args) {
		//이항연산자
		//피연산자가 2개인 연사자
		//일반적으로 연산자를 가운데 두고 피연산자가 왼쪽, 오른쪽에 배치된다.
		
		int x = 10;
		int y = 7;
		
		int result = x + y;
		System.out.println(result);
		result = x - y;
		System.out.println(result);
		result = x * y;
		System.out.println(result);
		result = x / y;
		System.out.println(result); //몫만 나온다.
		result = x % y;
		System.out.println(result); //나머지만 나온다.
		
		//비교연산자
		//'A'가 65로 변환되어 비교한다.
		// true or false
		System.out.println('A' == 65);
		
		boolean result2 = x > y;
		System.out.println(result2);
		
		result2 = x <= y;
		System.out.println(result2);
		
		//문자열은 ==을 이용해 동등비교 할 수 없다.
		//대신 equals()메서드를 통해서 비교한다.
		//문자열 값이 같은지 비교
		
		result2 = "자바".equals("java");
		System.out.println("문자열 비교 : result2");
		
		//논리 연산자
		
		int age = 30;
		int limit = 35;
		
		boolean result3 = (limit-age) >=5 && age >30;
		System.out.println("&&연산 결과 : " + result3);
	}
}
