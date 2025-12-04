package ch15;

public class Computer {

	//가변 길이 매개변수
	public int sum(int...values) {
		int sum = 0;
		for(int i : values) {
			sum += i;
		}
		
		return sum;
	}
}



