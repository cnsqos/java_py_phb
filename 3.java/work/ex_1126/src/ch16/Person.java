package ch16;




public class Person {
	static final String NAME = "홍길동";
	static final int AGE;
	
	static {
		//static과 관련된것들을 초기화 해줄 수 있다.
		//클래스가 처음 메모리에 올라갈 때 딱 한 번 실행되는 초기화 구간
		//클래스 단위로 한 번만 해야 하는 작업을 넣는곳
		//NAME = "박길동";
		AGE = 20;
	}
}
