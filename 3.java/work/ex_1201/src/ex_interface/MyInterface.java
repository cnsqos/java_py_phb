package ex_interface;

//인터페이스에 포함될 수 있는 것
public interface MyInterface {

	//상수
	//상수명을 쓸 때 대문자로 작성을 한다.
	//인터페이스는 어차피 상수밖에 못오기 때문에 public static final 생략 가능하다.
	public static final int MAX_COUNT = 10;
	
	//추상메서드
	public abstract void doWork();
	
	//default 메서드
	default void log(String msg) {
		System.out.println("LOG : " + msg);
	}
	
	//static 메서드
	static void printInfo() {
		System.out.println("인터페이스 정보 출력");
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
