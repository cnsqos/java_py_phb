package ex_Math;

public class MathExample {
	public static void main(String[] args) {
		//Math클래스에 있는 내용은 모두 static이기 때문에 객체를 만들어줄 필요가 없다.
		
		//ceil() : 올림
		double v1 = Math.ceil(5.3);
		
		System.out.println(v1);
		
		//floor() : 내림
		double v2 = Math.floor(5.3);
		System.out.println(v2);
		
		//max()
		//큰값 찾기
		long v3 = Math.max(3, 7);
		System.out.println(v3);
		
		//min()
		//작은값 찾기
		long v4 = Math.min(3, 7);
		System.out.println(v4);
		
		//round()
		//반올림
		double v5 = Math.round(12.3456);
		System.out.println(v5);
		
		//소수점 이하 두자리 얻기
		double value = 12.3456;
		double temp1 = value * 100;
		long temp2 = Math.round(temp1);
		double v6 = temp2 / 100.0;
		System.out.println(v6);
		
		//random()
		//0.0과 1.0 사이의 double 타입의 난수를 반환한다.
		//1 ~ 30사이의 난수 1개
		int num = (int)(Math.random() * 30) + 1;
		
		System.out.println("난수 : " + num);
		
		
		
		
		
		
		
		
		
		
		
	}
}
