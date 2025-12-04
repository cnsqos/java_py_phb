package ch05;

import java.util.Scanner;

public class If {
	public static void main(String[] args) {
		//if의 기본형
		//if(조건식){ 조건식이 참일 때 실행할 명령};
		
		//만약 실행해야 하는 명령이 하나라면 중괄호를 생략할 수 있다.
		//if(조건식) 조건식이 참일 때 실행할 명령;
		
		int score = 93;
		
		if(score >= 90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A입니다.");
		}
		
		if(score < 90) {
			System.out.println("점수가 90보다 작습니다.");
			System.out.println("등급은 B입니다.");
		}
		
		
		//정수형 변수 x가 10보다 크고 20보다 작을 때 true인 조건식 만들기 
		//if(x > 10 && x < 20);
		//문자형 변수 ch가 'x'또는 'X'일 때 true인 조건식
		//if(ch == 'x' || ch == 'X');
		//문자형 변수 ch가 알파벳일때 true이 조건식
		//if((ch>='a' && ch<='z') ||(ch>='A' && ch<='Z'));
		
		//if else
		//if(조건식){
		//	조건식이 참일 때 실행할 명령
		//} else {
		//	조건식이 거짓일 때 실행할 명령
		//}
		
		//if(조건식) 조건식이 참일 때 실행할 명령
		//	else 조건식이 거짓일 때 실행할 명령;
		
		
		//if -else if - else
		//비교해야 할 조건이 여러개일 때
		//if(조건식1){
		//	조건식1이 참일 때
		//} else if(조건식2){
		//	조건식1이 거짓이고 2가 참일 때
		//}else if(조건식3){
		//	조건식1,2가 거짓이고 3이 참일 때
		//}else if(조건식4){
		//	조건식1,2,3이 거짓이고 4가 참일 때
		//} else {
		//	어느 조건도 맞지 않을 때 실행할 명령
		//}
		
		int a = 3;
		int b = 4;
		int c = 5;
		
		//세 숫자를 비교해서 가장 큰 값 출력하기
		int max = a; //최고값을 담을 변수
		
		if(b > max) {
			max = b;
		}
		
		if(c > max) {
			max = c;
		}
		
		//개수를 셀 때 -> 개수를 담을 변수 만듦
		//총합을 구할 때 -> 총합을 담을 변수를 만듦
		//평균을 구할 때 -> 평균을 담을 변수를 만듦
		//글자를 뒤집어라 -> 뒤집은 글자를 담을 변수를 만듦
		
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디 입력 : ");
		String id = sc.next();
		String pw = "1234";
		
		//아이디가 admin이면서 비밀번호가 1234가 일치할 때 "로그인 성공"
		//일치하지 않으면 "로그인 실패"를 출력하기
		if(id.equals("admin") && pw.equals("1234")) {
			System.out.println("로그인 성공");
		} else {
			System.out.println("로그인 실패");
		}
		
		//문자열끼리 == -> 주소값을 비교한다.
		
		//불변의 법칙 같은 내용으로 정의된 문자열이 있으면 걔를 갖다가 쓴다.
		
		//내용물을 비교할 때는 equals()메서드를 사용하는 것이 맞다.
		
		String str = new String("admin");
		String str2 = new String("admin");
		
		System.out.println(str == str2);
		System.out.println(str.equals(str2));
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
