package ex_final;

public class Car {

	int speed;
	
	public void speedUp() {
		speed +=1;
	}
	
	public final void stop() {
		System.out.println("차를 멈춤");
		speed = 0;
	}
}
