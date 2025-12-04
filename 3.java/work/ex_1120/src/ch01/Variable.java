package ch01;

public class Variable {
	public static void main(String[] args) {
		//변수의 선언
		//자료형 변수명;
		int age;
		
		//값의 대입
		//변수명 = 값;
		age = 30;
		System.out.println(age);
		//대입에는 제한이 없다.
		//대입을 새로 하면 이전에 저장된 값은 없어진다.
		age = 25;
		System.out.println("새로운 값 : " + age);
		
		
		//헝가리안 표기법
		//변수명 앞에 데이터 타입 표기하는것
		//boolean -> b
		//int -> n
		//String -> str
		
		//변수는 출력문이나 연산식에 사용된다.
		int value = 0;
		
		//value에 10을 더한 값을 초기값으로 지정한다.
		int result = value + 10;
		System.out.println(result);
		
		//변수는 또 다른 변수에 대입되어 메모리 간에 값을 복사할 수 있다.
		int x = 10;
		int y = x;
		
		//두 값을 교환하려면 어떻게 해야 할까
		int a = 3;
		int b = 5;
		System.out.println("a : " + a + " b : " + b);
		int c = b;
		b = a;
		a = c;
		System.out.printf("a : %d, b : %d\n", a,b);
	
		//지갑에 있는 돈을 wallet 변수에 저장한다.
		//통장에 있는 돈을 bank 변수에 저장한다.
		//지갑에는 20000원이 들어있다.
		//통장에는 10000원이 들어있다.
		
		//지갑에서 5000원을 빼서 통장에 옮기는 코드 작성하기
		int wallet = 20000;
		int bank = 10000;
		
		wallet = 20000 - 5000;
		bank = 10000 + 5000;
		
		System.out.println("지갑에 남은 돈 : " + wallet);
		System.out.println("통장에 남은 돈 : " + bank);
		
		
		
		
		
		
		
		
		
		
		
	}
}
