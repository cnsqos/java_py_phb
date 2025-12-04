package try_catch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Try_catch2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			int[] cards = {4,5,1,2,7,8};
			System.out.print("몇번째 카드를 뽑으시겠습니까? >>");
			
			int cardIndex = sc.nextInt();
			System.out.println("뽑은 카드 번호는 : " + cards[cardIndex]);
		//여러개의 catch구문을 작성하여 특정 예외마다 처리를 달리 할 수 있다.
		} catch (InputMismatchException e) {
			System.out.println("잘못 입력하셨습니다. 숫자만 가능합니다.");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("해당 번호의 카드는 없습니다.");
		}
		
		System.out.println("프로그램 종료");
		
		
		
		
		
	}
}
