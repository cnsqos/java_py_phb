package ch03;

public class Operator1 {
	public static void main(String[] args) {
		//부호 연산자
		int x = -100;
		x = -x;
		System.out.println("x : " + x);
		
		//증감연산자
		//++, -- 1씩 증가시키거나 1씩 감소시키는 연산자
		
		//전위연산
		int a = 3;
		System.out.println(++a);
		//후위연산
		System.out.println(a++); //사용되고 1을 더한다.
		System.out.println(a); //1 증감이 반영되어 나온다.
		
		//! not
		// true -> false, false -> true
		boolean isTrue = true;
		
		System.out.println(!isTrue); //이때만 반영이 되는것
		System.out.println(isTrue);
		
		
	}
}
