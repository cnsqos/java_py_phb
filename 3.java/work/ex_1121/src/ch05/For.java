package ch05;

import java.util.Scanner;

public class For {
	public static void main(String[] args) {
		//1 부터 10까지 출력하는 for문 작성하기
		//근데 가로로 출력하기
		//1 2 3 4 5 6 7 8 9 10
	
		
//		for (int i = 1; i <= 10; i++) {
//            System.out.print(i + " ");
//        }
//        
//		
//		
//		//10부터 1까지 출력하느 for문 작성하기
//		
//		for (int i = 10; i >= 1; i--) {
//            System.out.print(i + " ");
//        }
//		
//		
//		//1부터 10까지 3의 배수만 출력하기
//	
//		for (int i = 1; i <=10; i++) {
//			if (i % 3 == 0)
//			System.out.print(i + " ");
//		}
//		
//		//1부터 10까지 총합구하기
//		
//        int sum = 0;
//        
//        for (int i = 1; i <= 10; i++) {
//            sum += i;
//        }
//        System.out.print(sum);
//        
//        
//		//키보드에서 숫자하나를 입력받고 구구단 출력하
//        
//        Scanner scanner = new Scanner(System.in);
//        
//        System.out.print("몇 단: ");
//        int num = scanner.nextInt();
//        
//        System.out.println(num + "단");
//        
//        for (int i = 1; i <= 9; i++) {
//            System.out.println(num + " x " + i + " = " + (num * i));
//        }
//        
//        
//        //키보드에서 숫자 두개를 입력받아서
//        //x 부터 y까지의 총 합 구하기
//        
//        Scanner sc = new Scanner(System.in);
//        
//        System.out.print("x : ");
//        int x = sc.nextInt();
//
//        System.out.print("y : ");
//        int y = sc.nextInt();
//
//        int ssum = 0;
//        
//        for (int i = x; i <= y; i++) {
//            ssum += i; // sum = sum + i
//        }
//
//        System.out.println(x + y + ssum);
        
        
        //1 ~ 20까지의 정수 중 2의 배수가 아니면서 3의 배수가 아닌 수의 총합을 구하세요
        
//        int sum = 0;
//        
//		for (int i = 1; i <=20; i++) {
//			if (i % 2 != 0 && i % 3 != 0) {
//				sum += i;
//			}
//			
//			System.out.print(sum);
//		}
        
		//int 타입의 num 변수에 12345를 대입한다.
		//각 자리수의 합을 구한 결과를 출력하는 코드 작성하기
		// 1 + 2 + 3 + 4 + 5 = 15
		
//		int num = 12345;
//		int total2 = 0;
//		
//		while(num > 0) {
//			total2 += num%10; // 0+5
//			num = num /10; //1234
//		}
//		System.out.println(total2);
		
		
		//1+ (1 + 2) + (1+2+3) + (1+2+3+4) + ...(1+...+10) 의 결과를 계산하시오
		
		int total3 = 0;
		int sum = 0;
		
		for (int i = 1; i <=10; i++) {
			sum += i;
			total3 += sum;
		}
		System.out.println(total3);
		
	}
}
