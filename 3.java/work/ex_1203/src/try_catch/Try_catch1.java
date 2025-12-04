package try_catch;

import java.util.Scanner;

public class Try_catch1 {
	public static void main(String[] args) {
		
		//NullPointerException
		//참조변수는 있는데 객체가 메모리에 할당되지 않았는데 내가 사용하려고 할 때
		//String[] strArray = null;
		//System.out.println(strArray[0]);
		
		//NumberFormatException
		//잘못된 문자열을 숫자로 변환하려고 할 때 발생하는 예외
		//String str01 = "11.1";
		//문자열을 정수로 변환
		//int num01 = Integer.parseInt(str01);
		
		//ArrayIndexOutOfBoundsException
		//배열에서 인덱스(index)범위를 초과해 사용할 때 발생한다.
//		int[] arr = {1,6,7,9,10};
//		System.out.println(arr[6]);
		
		//ArithmeticException
		//정수를 0으로 나누려고 할 때 발생
//		int result = 10/0;
//		System.out.println(result);
		
		Scanner sc = new Scanner(System.in);
		
		
		//try-catch
		try {
			//예외가 발생할 가능성이 있는 코드
			System.out.print("정수를 입력하세요 : ");
			int score = sc.nextInt();
			
			if(score >= 65) {
				System.out.println("합격입니다.");
			} else {
				System.out.println("불합격입니다.");
			}
		} catch (Exception e) {
			//예외가 발생했을 때 처리할 코드
			System.out.println("키보드 입력이 잘못되었습니다.");
		}
		
		//예외가 발생하게 되면 JVM이 예외를 분석하여 알맞은 예외 클래스를 생성한다.
		//생성된 예외 객체를 발생한 지점으로 보낸다.
		//catch메서드의 매개변수로 들어가게 된다.
		//시스템으로부터 넘어오는 예외 클래스를 처리한다.
		
		
		
		
		
		
		
		
		
		
	}
}
