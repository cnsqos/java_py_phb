package ex_interface;

public class MyService implements MyInterface{

	@Override
	public void doWork() {
		System.out.println("실제 작업을 수행한다.");
	}

}
