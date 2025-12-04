package ch16;

import java.util.Scanner;

public class Exam1 {

	//배열의 최대값을 찾는 maxFinder메서드 만들기!!
	//최대값을 찾아서 반환하기
	public void maxFinder(int[] arr) {
		int max = 0;
		for(int v : arr) {
			if(v > max) {
				max = v;
			}
		}
		
		System.out.println("최대값 : "+ max);
	}
	
	//원의 넓이를 구하는 circleArea메서드 만들기
	//원의 넓이 : 3.14 * r * r
	//반환하기
	public double circleArea(int r) {
		return 3.14 * r * r;
	}
	
	//원의 둘레를 구하는 circleRound메서드 만들기
	//원의 둘레 : 2 * 3.14 * r
	//출력하고 끝내기
	public void circleRound(int r) {
		double round = 2 * 3.14 * r;
		System.out.println("원의 둘레 : " + round);
	}
	
	//화씨를 섭씨로 바꾸는 fToc
	//화씨 -> 섭씨 : (화씨-32)/1.8
	//함수를 실행하면 온도를 입력받아서 출력하기
	public void fToc() {
		Scanner sc = new Scanner(System.in);
		double faher;
		System.out.print("화씨를 입력하세요 : ");
		faher = sc.nextInt();
		
		double cel = (faher - 32)/1.8;
		System.out.println("섭씨로 변환한 온도 : " + cel);
	}
	
	
	
	
	
	//숫자 두개와 연산자를 매개변수로 받아서 사칙연산을 하는 calc메서드 만들기
	//매개변수 : 정수 2개, 문자열 1개
	public int calc(int n1, int n2, String str) {
		if(str.equals("+")) {
			return n1 + n2;
		} else if(str.equals("-")) {
			return n1 - n2;
		} else if(str.equals("*")) {
			return n1 * n2;
		} else if(str.equals("/")) {
			return n1 / n2;
		} else {
			System.out.println("연산기호가 올바르지 않습니다.");
			return -1;
		}
	}
	
	
	
	
	
	
	
	
	
}
