package try_catch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Try_catch3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("점수를 입력하세요 : ");
			int score = sc.nextInt();
			if(score >= 60) {
				System.out.println("합격입니다.");
			} else {
				System.out.println("불합격입니다.");
			}
		} catch (InputMismatchException e) {
			System.out.println("키보드 입력이 올바르지 않습니다.");
		} finally{
			//예외 발생유무와 상관없이 실행되는 영역
			//필요없다면 생략이 가능하다.
			//보통 외부 연동이나 예외가 발생해도 정상 종료되어야 할 구문들에서 사용된다.
			System.out.println("프로그램 종료");
			
			//데이터베이스와의 연결을 무조건 종료시킬 때 많이 사용을 한다.
		}
		
		
		
		
		
		
		
		
		
		
		
	}
}
