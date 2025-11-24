package ch08;

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

	        System.out.print("문자열 입력: ");
	        String word = sc.next();

	        int count = 0;
	        
	        for (int i = 0; i < word.length(); i++) {
	        	char ch = word.charAt(i);
	        	if(ch == 'a') {
	        		count++;
	        	}
		    }
		    System.out.println("a의 개수: " + count);
	
		    
		    //문자열을 입력받아서 뒤집어서 출력해주세요
		    //hello -> olleh
		    
		    Scanner sc1 = new Scanner(System.in);

	        System.out.print("문자열 입력: ");
	        String word2 = sc1.next();

	        String reversed = "";

	        // 문자열 뒤에서부터 앞으로 돌면서 문자 추가
	        for (int i = word2.length() - 1; i >= 0; i--) {
	            reversed += word2.charAt(i);
	        }

	        System.out.println("뒤집은 문자열: " + reversed);
	        
	        
	        
	        //키보드에서 이메일을 입력받고 아이디 부분만 출력하기
	        
	        Scanner sc2 = new Scanner(System.in);

	        System.out.print("이메일 입력하세요 : ");
	        String email = sc2.next();
	        
	        String id = email.substring(0,email.indexOf("@"));
	        System.out.println("아이디: " + id);
	        
	    	        
	        
	        
	}
}
