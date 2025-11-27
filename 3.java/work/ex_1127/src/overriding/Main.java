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
		cp.getResult(30, 15);
	    
	        
	}
}
