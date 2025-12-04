package ch03;

public class Operator2 {
	public static void main(String[] args) {
		//이항연산자
		//피연산자가 2개인 연산자
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
		System.out.println(result);
		
		//비교연산자
		//'A'가 65로 변환되어 비교한다.
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
		
		boolean result3 = (limit-age) >= 5 && age > 30;
		System.out.println("&&연산 결과 : " + result3);
		
		//비트 논리 연산자
		//2진수 차원의 논리 연산자
		//피연산자가 1,0 이라는것과 산출된 결과가 1,0 이라는 것
		//1 -> true, 0 -> false
		// & 두 항이 모두 1이면 true, 아니면 false
		// | 둘 중 하나라도 1이면 true, 아니면 false
		// ^ 두 항이 달라야 true, 같으면 false
		// ~ 1을 0으로, 0을 1로 만든다.
		
		int a = 10; //1010 -> 00000000 00000000 00000000 00001010
		int b = 7; //0111
		//8bit -> 1byte
		//int -> 4byte -> 32bit
		
		int c = a & b; //0010
		System.out.println(c);
		
		c = a | b; //1111
		System.out.println(c);
		
		c = a ^ b; //1101
		System.out.println(c);
		
		//2진수는 음수를 표현할 수 없다
		//비트의 맨 앞자리는 수의 표현이 아닌 부호의 표현으로 쓰기로 약속을 했다.
		//1이면 음수, 0이면 양수
		
		int i1 = 7; //0111
		System.out.println(~i1);//-(7+1);
		
		int result1 = i1 << 1;
		
		System.out.println(result1);
		
		
		
		
		
		
		
		
		
		
		
	}
}
