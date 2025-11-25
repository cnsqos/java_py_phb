package ch10;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Exam1 {
	public static void main(String[] args) {
		//단일 문자 배열에 단어와 숫자를 섞어 넣는다.
	      char[] cards = {'1','L','O','2','V','3','E'};
	      String myWord = "";
		
	      //알파벳만 추출해서 myWord넣고 출력하기

	      //반복문 이용해서 순회하세요
	      
	      //요소가 알파벳인지 판별하세요
	      
	      //알파벳이면 myWord에 넣으세요
	      
	      
		for (int i = 0; i < cards.length; i++) {
		    if ((cards[i] >= 'A' && cards[i] <= 'Z')) {
		        myWord += cards[i];
		    }
		}
		
		System.out.println(myWord);
		
		//키보드에서 배열의 길이를 입력받는다.
		//입력받은 배열의 길이만큼 알파벳을 요소로 넣고 출력해주세요
		//예시
		//배열의 길이를 정해주세요 : 5
		//ABCDE
		//---------------------
		
//		Scanner sc = new Scanner(System.in);
//
//        System.out.print("배열의 길이를 정해주세요: ");
//        int length = sc.nextInt();  // 배열 길이 입력
//
//        char[] letters = new char[length];  // 입력받은 길이로 배열 생성
//
//        char ch = 'A';
//        
//        
//        // 알파벳 채우기
//        for (int i = 0; i < letters.length; i++) {
//            letters[i] = ch++;  // 'A'부터 시작해서 순서대로
//        }
//
//        // 배열 출력
//        System.out.println(Arrays.toString(letters));
        
        //---------------------
        
        System.out.println("----------------");
        
        //변수 money에 10 ~ 5000사이의 난수를 발생시켜 넣는다.
        //단 1의자리는 반드시 0이 되도록 한다.
        //ex) 3450, 2100, 60
        
        //발생된 난수 money를 동전으로 바꾸면 각 동전이 몇 개씩 필요한지 출력
        
        //가능한 적은 수의 동전을 사용한다.
        
        int[] coin = {500,100,50,10};
        
     // 10 ~ 5000 사이 난수 생성, 1의 자리는 0으로 만들기
        
        
        int money = (new Random().nextInt(500) + 1) * 10;

        System.out.println("금액: " + money);

        // 각 동전 개수 계산
        for (int i = 0; i < coin.length; i++) {
            int count = money / coin[i];   // 현재 동전으로 몇 개 필요한지
            money %= coin[i];              // 남은 금액 계산
            System.out.println(coin[i] + "원: " + count + "개");
        }
        
        //배열의 모든 요소의 합 구하기
        int[][] arr = {
        		{1,2,3},
        		{4,5,6,7,8},
        		{9},
        		{10,11,12,13},
        		{14,15},
        		{16,17,18,19,20}
        };
        
        
        int sum = 0;

	    
	    for (int i = 0; i < arr.length; i++) {
	        for (int j = 0; j < arr[i].length; j++) {
	             sum += arr[i][j];
	        }
	    }
	    
	    //배열의 길이만큼(6번) 돌면서 더해야함.
	    //arr의 몇 번째 요소이냐. 그 요소의 길이가 몇이냐.
	
	    System.out.println("합: " + sum);
	    
	    
	    // 1~45사이의 난수를 발생시켜 로또번호 6개를 배열에 저장하는 프로그램 만들기
	    // 겹치는 것은 들어가면 안됨
	    
	    
	    	int[] lotto = new int[6];  
	        outer : for(int i = 0; i < lotto.length;) {
	        	lotto[i] = new Random().nextInt(45)+1;
	        	for(int j = 0; j< i; j++) {
	        		if(lotto[i] == lotto[j]) {
	        			continue outer;
	        		}
	        	}
	        	System.out.println(lotto[i] + " ");
	        	i++;
        	}
	        
	        
	        
		}
	}

