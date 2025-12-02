package inner_class;

//외부 클래스
public class Outer {
	
	private int value = 10;

	//내부 클래스
	public class Inner{
		//외부 클래스스의 필드에 접근이 가능하다.
		public void print() {
			System.out.println("value = " + value);
		}
	}
	
	//정적 내부 클래스
	public static class StaticInnerClass{
		public void run() {
			System.out.println("정적 내부 클래스의 메서드 호출");
		}
	}
	
	//static이기 때문에 바깥 클래스의 객체 없이도 객체를 생성할 수 있는 클래스이다.
	//바깥 클래스의 필드에는 접근 할 수 없다.
	//대신 바깥 클래스의 static 멤버에는 접근할 수 있다.
	
	public void doWork() {
		//지역 클래스
		//메서드 내부에서 정의되는 클래스
		//메서드 내부에서 메서드를 정의하는것이 불가능하다.
		//메서드 안에서만 필요한 작은 클래스를 밖에 노출시키고 싶지 않을 때
		class LocalClass{
			void run() {
				System.out.println("메서드 안에서만 쓰는 지역 클래스");
			}
		}
		
		LocalClass local = new LocalClass();
		local.run();
		
	}
}






