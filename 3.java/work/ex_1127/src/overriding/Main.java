package overriding;

public class Main {
	public static void main(String[] args) {
		int r = 10;
		
		Calculator cal = new Calculator();
		cal.areaCircle(r);//부모클래스에 있는 메서드 실행
		
		Computer c= new Computer();
		c.areaCircle(r);//오버라이딩된 메서드가 실행
		
		CalPlus cp = new CalPlus();
		System.out.println("CalPlus : " + cp.getResult(10, 20));
		
		CalMinus cm = new CalMinus();
		System.out.println("CalMinus : " + cm.getResult(30, 15));
		
		
		
		
		
		
	}
}
