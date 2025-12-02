package inner_class;

public class Car {
	public static void main(String[] args) {
		 Tire tire1 = new Tire();
		 
		 tire1.roll();
		 
		 Tire tire2 = new HankookTire();
		 
		 tire2.roll();
		 
		 //익명 클래스
		 Tire tire3 = new Tire() {
			 @Override
			public void roll() {
				System.out.println("익명 자식 타이어가 굴러간다.");
			}
		 };
		 
		 tire3.roll();
		
	}

	
}








