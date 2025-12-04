package ch05;

import java.util.Scanner;

public class For {
	public static void main(String[] args) {
		//1 부터 10까지 출력하는 for문 작성하기
		//근데 가로로 출력하기
		//1 2 3 4 5 6 7 8 9 10
		
		//10부터 1까지 출력하는 for문 작성하기
		
		//1부터 10까지 3의 배수만 출력하기
		//3,6,9 -> 3으로 나눈 나머지가 0이면 3의 배수이다.
		for(int i = 1; i <=10; i++) {
			//3의 배수인지 검증
			if(i % 3 == 0) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
		//1부터 10까지 총합구하기
		
		//키보드에서 숫자하나를 입력받고 구구단 출력하기
		// 5 x 1 = 5
		// 5 x 2 = 10
		// 5 x 3 = 15
		//...
		
		//키보드에서 숫자 두개를 입력받아서
		//x부터 y까지의 총 합 구하기
		//x가 y보다 크다면 값을 서로 교환해서 총합 구하기
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("첫번째 숫자 입력 : ");
//		int x = sc.nextInt();
//		
//		System.out.print("두번째 숫자 입력 : ");
//		int y = sc.nextInt();
//		
//		if(x > y) {
//			int temp = x;
//			x = y;
//			y = temp;
//		}
//		
//		int total = 0;
//		for(int i = x; i <= y; i++) {
//			total += i;
//		}
		
		//1 ~ 20까지의 정수 중 2의 배수가 아니면서 3의 배수가 아닌 수의 총합을
		//구하세요
		int sum = 0;
		for(int i = 1; i <=20; i++) {
			if(i % 2 != 0 && i % 3 !=0) {
				sum += i;
			}
		}
		System.out.println("총합 : " + sum);
		
		
		//int 타입의 num 변수에 12345를 대입한다.
		//각 자리수의 합을 구한 결과를 출력하는 코드 작성하기
		// 5+ 4+ 3+ 2+ 1 = 15
		int num = 12345;
		int total2 = 0;
		
		while(num > 0) {
			total2 += num % 10; // 0 + 5 + 4 + 3 + 2 + 1 
			num = num / 10;//1234 123 12 1 0
		}
		System.out.println(total2);
		
		//1 + (1 + 2) + (1 + 2 + 3) + (1 + 2 + 3 +4) + ...(1 + ...+10)
		//의 결과를 계산하시오
		
		int total = 0;
		sum = 0;
		
		for(int i =1; i<=10; i++) {
			sum +=i; //1+2+3
			total += sum;//1+ (1+2) +(1+2+3)...
		}
		
		System.out.println(total);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
