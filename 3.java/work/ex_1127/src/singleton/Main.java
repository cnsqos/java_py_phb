package singleton;

public class Main {
	public static void main(String[] args) {
		Counter c1 = Counter.getInstance();
		Counter c2 = Counter.getInstance();
		
		c1.increment();
		c2.increment();
		c2.increment();
		
		//c1, c2의 count값 조회하기
	}
}
