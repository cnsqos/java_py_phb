package inner_class;

public class Main {
	public static void main(String[] args) {
		Outer outer = new Outer();
		
		//내부클래스의 객체 만들기
		
		Outer.Inner inner = outer.new Inner();
		inner.print();
		
		//실무에서 잘 안씀
		
		
		
		User user = new User.Builder()
		        .username("홍길동")
		        .email("hong@test.com")
		        .age(20)
		        .build();
		
		
		
		RemoteControl rc = new RemoteControl(){
			
			@Override
			public void turnOn() {
				System.out.println("ㅌㅂ를 켭니다.");
			}
			
			@Override
			public void turnOff() {
				System.out.println("ㅌㅂ를 끕니다");
			}		
		};

		rc.turnOn();
		rc.turnOff();
		
		
		Calculator c = new Calculator() {
			
		@Override
		public int calc(int x) {
			return x*x;
		}
			
		};
		
		System.out.println(c.calc(5));
		
		
		
		
		 Button button = new Button();
      
	     button.setOnClickListener(new Button.OnClickListener() {
	    	 
	            @Override
	            public void onClick() {
	                System.out.println("버튼이 클릭되었습니다!");
	            }
	        });
		
		
	}
}
