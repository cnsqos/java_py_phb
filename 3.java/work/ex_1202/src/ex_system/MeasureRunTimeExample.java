package ex_system;

public class MeasureRunTimeExample {
	public static void main(String[] args) {
		long time1 = System.currentTimeMillis();
		int sum = 0;
		for(int i = 1; i <=1000000; i++) {
			sum +=i;
		}
		long time2 = System.currentTimeMillis();
		System.out.println("총합 : " + sum);
		System.out.println("계산에 " + (time2 - time1)+" ms가 소요되었습니다.");
	}
}
