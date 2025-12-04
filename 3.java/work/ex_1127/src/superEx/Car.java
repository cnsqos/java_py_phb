package superEx;

public class Car {

	int gasGauge;
	
	public Car(int gasGauge) {
		this.gasGauge = gasGauge;
	}
	
	void showCurrentGauge() {
		System.out.println("잔여 가스량 : " + gasGauge);
	}
}
