package overriding;

public class Main {
	public static void main(String[] args) {
		int r = 10;
		
		Calculator cal = new Calculator();
		cal.areaCircle(r);

		Computer c = new Computer();
		c.areaCircle(r);

		Student student = new Student();
		student.introduce();

		
		CalPlus cp = new CalPlus();
		System.out.println("CalPlus : " + cp.getResult(20, 10));
	    
		CalMinus cm = new CalMinus();
		System.out.println("CalMinus : " + cm.getResult(20, 10));
		
		
		HybridWaterCar hwc = new HybridWaterCar(15, 30, 25);
        hwc.showCurrentGague();
		
		
	}
}
