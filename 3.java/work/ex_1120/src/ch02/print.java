package ch02;

public class Print {
	public static void main(String[] args) {
		//데이터의 출력
		//System클래스
		System.out.println("Welcome");//출력을 한 뒤 줄바꿈
		System.out.print("Java World\n"); //내용을 출력한다.
		
		//printf()
		//값의 자료형에 따라 서식문자를 이용해 문자열 속에서 데이터를 출력할 수 있다.
		//%d : 정수의 서식문자(10진수)
		//%o : 8진수
		//%x : 16진수
		//%f : 실수
		//%s : 문자열
		//%c : 문자
		//%b : 논리형
		
		String name = "홍길동";
		int age = 30;
		String address = "인천시 부평구";
		double height = 184.8;
		
		System.out.printf("제 이름은 %s입니다.\n",name);
		System.out.printf("제 나이는 %d살입니다.\n",age);
		System.out.printf("저희 집은 %s입니다.\n",address);
		System.out.printf("제 키는 %.1fcm입니다.\n",height);
		
		int x = 15;
		int y = 10;
		//10과 5의 합은 15입니다.
		//하드코딩
		System.out.printf("%d과 %d의 합은 %d입니다.\n",x,y,x+y);
		
		
		
		
		
		
	}
}
