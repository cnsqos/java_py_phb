package polymorphism;

public class HankookTire extends Tire{
	
	private static HankookTire hTire = new HankookTire();
	
	private HankookTire() {
		
	}
	
	public static HankookTire getInstance() {
		return hTire;
	}

	@Override
	public void roll() {
		System.out.println("한국 타이어가 회전합니다.");
	}
	
	@Override
	public void stop() {
		System.out.println("한국타이어 멈춤");
	}
}
