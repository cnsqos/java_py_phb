package ch08;

import java.util.Arrays;
import java.util.Scanner;

public class Exam1 {
	public static void main(String[] args) {
		//문자의 개수세기
		//키보드에서 한글,영문을 무작위로 입력받는다.
		//입력받은 문자열에서 소문자 a의 개수를 구하세요
		
		//1. 문자열에는 index가 존재한다.
		//2. charAt(index)로 하나씩 잘라서 a인지 확인한다.
		//3. a라면 count를 한다.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 입력 : ");
		String word = sc.next();
		int count = 0;
		for(int i = 0; i< word.length(); i++) {
			char ch = word.charAt(i);
			if(ch == 'a') {
				count++;
			}
		}
		
		System.out.println("a의 개수 : " + count);
		
		
		//문자열을 입력받아서 뒤집어서 출력해주세요
		//hello -> olleh
		String original = sc.next();
		String reversed = "";
		
		for(int i = original.length()-1; i>= 0; i-- ) {
			reversed +=original.charAt(i);
		}
		
		System.out.println(original);
		System.out.println(reversed);
		
		//키보드에서 이메일을 입력받고 아이디 부분만 추출하기
		System.out.print("이메일을 입력하세요 : ");
		String email = sc.next();
		
		//아이디는 몇글자 일지는 모르겠으나 '@'의 위치를 찾아서 그 앞까지 자르면
		//"abc@gmail.com"
		//"abcd@gamil.com"
		//"abcde@gmail.com";
		String id = email.substring(0,email.indexOf("@"));
		System.out.println(id);
		
		
		
		
		
		
	}
}
