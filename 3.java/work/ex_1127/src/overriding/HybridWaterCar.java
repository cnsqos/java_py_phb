package overriding;

public class HybridWaterCar extends HybridCar {
	
	int waterGague;
	
	HybridWaterCar(int gasolineGague, int electricGague, int waterGague){
		super(gasolineGague,electricGague);
		this.waterGague = waterGague;
	}
	
	@Override
	void showCurrentGague() {
		super.showCurrentGague();
		System.out.println("잔여 물의량 : " + waterGague);
	}
	
//	HybridWaterCar클래스
//	HybridCar클래스를 상속
//	필드
//	int waterGague;
//
//	생성자를 통해 필드를 초기화 한다.
//
//	메서드는 오버라이딩 하여 잔여 가솔린,전기,물의양을 출력한다.

}
