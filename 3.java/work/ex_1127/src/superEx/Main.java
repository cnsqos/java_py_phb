package superEx;

public class Main {
	public static void main(String[] args) {
		Dog d= new Dog("뽀삐",3);
		d.info();
		
		HybridWaterCar hwc = new HybridWaterCar(15, 30, 25);
		
		hwc.showCurrentGauge();
	}
}
