package superEx;

public class HybridCar extends Car{

	int electricGauge;
	
	public HybridCar(int gasGauge, int electricGauge) {
		super(gasGauge);
		this.electricGauge = electricGauge;
	}
	
	@Override
	void showCurrentGauge() {
		super.showCurrentGauge();
		System.out.println("잔여 전기량 : " + electricGauge);
	}

	
}
