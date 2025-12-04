package ch04;

import java.util.Scanner;

public class Exam1 {
	public static void main(String[] args) {
//		과수원이 있다.
//
//		배, 사과, 오렌지를 키우고 있는데 하루에 생산되는 양은 각각 5,  7,   5개이다.
//		과수원에서 하루에 생산되는 총 개수를 출력하고, 시간당 전체 과일의 평균 생산 갯수를 출력하시오. 
//		평균값을 담는 변수는 float으로 할 것.
		
		int pear = 5;
		int apple = 7;
		int orange = 5;
		
		int total = pear + apple + orange;
		
		float avg = total/24f;
		
		System.out.printf("하루 총 생산량 :  %d, 평균 %.3f\n",total,avg);
		
		
//		상자 하나에는 농구공이 5개가 들어갈 수 있다.
//		만일 농구공이 23개라면 몇개의 상자가 필요한가?
		
		int ball = 23;
		
		int box = ball % 5 == 0 ? ball/5 : ball/5 + 1;
		
		System.out.println("상자의 개수 : " + box);
		
//		국어,영어,수학에 대한 점수를 키보드를 이용해 정수로 입력받고
//		1. 세 과목에 대한 합계 출력하기
//		2. 평균 출력하기 (합계/3.0)
//
//		세 과목의 점수와 평균을 가지고 합격 여부를 처리하는데
//		세 과목의 점수가 각각 40점 이상이면서 평균이 40점 이상일때 합격
//		아니면 불합격
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		int kor = sc.nextInt();
		System.out.print("영어 : ");
		int eng = sc.nextInt();
		System.out.print("수학 : ");
		int math = sc.nextInt();
		
		//1. 총점
		int sum = kor + eng + math;
		
		//2. 평균
		avg = sum / 3.0f;
		
		//패스 논패스 여부
		String result = (kor >= 40 && math >= 40 && eng >= 40 && avg >=40) ? "합격" :"불합격";
		
		System.out.println("1. 총점 : " + sum);
		System.out.println("2. 평균 : " + avg);
		System.out.println("3. 합격여부 : " + result);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
