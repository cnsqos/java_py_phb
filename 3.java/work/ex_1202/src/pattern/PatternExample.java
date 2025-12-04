package pattern;

import java.util.regex.Pattern;

public class PatternExample {
	public static void main(String[] args) {
		//정규표현식
		//문자열이 내가 정한 형식에 맞는지 검증하는 표현식
		//[] -> 문자 일치하는 문자가 1개 있는지 검증 
		//ex) [abc] -> a,b,c만 허용하는 한글자
		//문자 범위
		//0-9 : 0~9 중 숫자 하나
		//a-z : 소문자 중 하나
		//A-Z : 대문자 중 하나
		
		//축약문자
		// \\d : [0-9]
		// \\D : 숫자가 아닌것
		// \\w : 영문자 + 숫자
		// \\W : 영문자 + 숫자 제외
		
		//수량(몇 번 나오는지)
		// * : 0번 이상
		// + : 1번 이상
		// ? : 0번 또는 1번
		// {n} : 정확히 n번
		// {n,} : n번 이상
		// {n,m} : n번 이상 m번 이하
		
		//위치
		// ^ : 문자열의 시작
		//ex) ^abc : abc로 시작해야 한다.
		// $ : 문자열의 끝
		//ex) abc$ : abc로 끝나야 한다.
		
		//자주 쓰이는 패턴
		//^ ... $
		//ex) ^[0-9]+$ : 전체 문자열에서 숫자가 1개 이상이어야 한다.
		
		String reg = "[a-z]+";
		String data = "hello";
		//Pattern클래스
		//matches(정규표현식,데이터);
		//문자열 전체랑 정규식이 일치해야 한다.
		boolean result = Pattern.matches(reg, data);
		System.out.println("결과 : " + result);
		
		//아이디 형식
		//영어(소문자,대문자 상관없이)로 시작하고, 그 뒤는 영어+숫자를 섞어서 
		//4자리에서 12자리
		
		String regex = "^[a-zA-Z][a-zA-Z0-9]{3,11}$";
		//^[a-zA-Z] : 아이디의 첫 글자는 반드시 영문자여야 한다.
		//[a-zA-Z0-9]{3,11} : 영문 또는 숫자가 3 ~11글자를 만족해야 한다.
		String id = "gildong123";
		
		if(Pattern.matches(regex, id)) {
			System.out.println("아이디 형식이 올바릅니다.");
		} else {
			System.out.println("아이디 형식이 올바르지 않습니다.");
		}
		
		//전화번호
		//010-1234-1234
		//^(010|011) : 무조건 010 또는 011로 시작해야한다.
		//-? : -가 있어도되고 없어도 된다.
		//[0-9]{4} : 0-9 4글자
		regex = "^(010|011)-?[0-9]{4}-?[0-9]{4}$";
		data = "010-1234-1234";
		System.out.println("전화번호 형식 : " + Pattern.matches(regex, data));
		
		//이메일 표현식 만들기
		//( + 활용하기)
		//아이디 부분 : 영문 소문자와 숫자만 가능
		//@ 뒤 도메인 : 영문 소문자만 가능
		//.뒤 : 영문 소문자 2~3글자만 가능(.com,.net, .kr)
		regex = "^[a-z0-9]+@[a-z]+.[a-z]{2,3}$";
		String email = "gildong123@gmail.com";
		System.out.println(Pattern.matches(regex, email));
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
