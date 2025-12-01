package ex_interface;

//인터페이스에 포함될 수 있는 것
public interface MyInterface {
	
	//상수(상수명을 쓸 때 대문자로 작성한다.
	//어차피 상수 밖에 못와서 생락가능 final
	public static final int MAX_COUNT = 10;
	
	//추상메서드
	public abstract void dowork();
	
	//default 메서드
	
	default void log(String msg) {
		System.out.println("LOG : " + msg);
	}
	
	//static 메서드
	static void printInfo() {
		System.out.println("인터페이스 정보 출력");
	}
	
}
