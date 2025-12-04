package ch05;

import java.util.Scanner;

public class ExSwitch {
	public static void main(String[] args) {
		
		//switch의 기본형
		//switch(비교값){
		//	case 조건값1:
		//		비교값과 조건값1이 일치할 때 실행할 문장.
		//		break;
		//	case 조건값2:
		//		비교값과 조건값2이 일치할 때 실행할 문장.
		//		break;
		//	case 조건값3:
		//		비교값과 조건값3이 일치할 때 실행할 문장.
		//		break;
		//	case 조건값4:
		//		비교값과 조건값4이 일치할 때 실행할 문장.
		//		break;
		//	default:
		//		비교값과 일치하는 조건값이 없을 때 실행할 문장.
		//		break;
		
		//키보드에서 1~12사이의 월(月)을 입력받아서 month 변수에 저장
		//해당 월이 몇일까지 있는지 출력하세요
		//ex) 5월 ->  5월은 31일까지 있습니다.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("월 입력 : ");
		int month = sc.nextInt();
		
		switch(month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 11:
		case 12:
			System.out.printf("%d월은 31일까지 있습니다.\n",month);
			break;
		case 2:
			System.out.printf("%d월은 28일까지 있습니다.\n",month);
			break;
		case 4:
		case 6:
		case 9:
		case 10:
		System.out.printf("%d월은 30일까지 있습니다.\n",month);
			break;
		}
		
		//계산기 만들기
		//정수 두개를 키보드를 통해 입력받는다.
		//연산자도 키보드로 입력받아 문자열로 저장한다
		//switch를 이용하여 정수의 연산을 수행하는 코드를 작성해보자
		
		//실행 결과
		//정수1 : 10
		//정수2 : 7
		//연산자 : *
		//결과 : 10 * 7 = 70
		
		//정수를 0으로 나누려하면 0으로 나눌 수 없습니다 라고 출력하기
		
		System.out.print("정수1 : ");
		int n1 = sc.nextInt();
		System.out.print("정수2 : ");
		int n2 = sc.nextInt();
		System.out.print("연산자 : ");
		String op = sc.next();
		
		switch(op) {
		case "+":
			System.out.printf("결과 : %d %s %d = %d\n",n1,op,n2,n1+n2);
			break;
		case "-":
			System.out.printf("결과 : %d %s %d = %d\n",n1,op,n2,n1-n2);
			break;
		case "/":
			if(n2 == 0) {
				System.out.println("정수를 0으로 나눌 수 없습니다.");
			} else {
				System.out.printf("결과 : %d %s %d = %d\n",n1,op,n2,n1/n2);	
			}
			break;
		case "*":
			System.out.printf("결과 : %d %s %d = %d\n",n1,op,n2,n1*n2);
			break;
		}
		
		
		
		
		
		
		
	}
}
