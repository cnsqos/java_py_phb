package ex_abstract;

//Calculator를 상속받고 메서드 구현하기
public class GoodCalc extends Calculator {

	@Override
	public int add(int a, int b) {
		return a+b;
	}

	@Override
	public int sub(int a, int b) {
		return a-b;
	}

	@Override
	public double average(int[] a) {
		int sum = 0;
		for(int i : a) {
			sum += i;
		}
		double avg = sum / (double)a.length;
		return avg;
	}

}
