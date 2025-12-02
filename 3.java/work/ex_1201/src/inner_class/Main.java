package inner_class;

import inner_class.Button.OnClickListener;

public class Main {
	public static void main(String[] args) {
		Outer outer = new Outer();
		
		//내부클래스의 객체 만들기
		Outer.Inner inner = outer.new Inner();
		inner.print();
		
		//실무에서 크게 많이 쓰이지는 않는다.
		
		User user = new User.Builder()
				.username("홍길동")
				.email("gildong123@gmail.com")
				.age(20)
				.build();
		
		
		RemoteControl rc = new RemoteControl() {
			@Override
			public void turnOn() {
				System.out.println("TV를 켭니다.");
			};
			
			@Override
			public void turnOff() {
				System.out.println("TV를 끕니다.");
			};
		};
		
		rc.turnOn();
		rc.turnOff();
		
		Calculator cc = new Calculator() {
			
			@Override
			public int calc(int x) {
				return x*x;
			}
		};
		
		System.out.println(cc.calc(5));
		
		Button b = new Button();
		
		b.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick() {
				System.out.println("버튼이 클릭되었습니다!");
			}
		});
		
		b.click();
		
	}
}
