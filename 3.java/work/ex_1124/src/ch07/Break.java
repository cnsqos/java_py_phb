package ch07;

import java.util.Random;
import java.util.Scanner;

public class Break {
	public static void main(String[] args) {
		//break
		//반복문을 의도족으로 종료할 때 사용하는 키워드
		
		
		while(true) {
			int rand = new Random().nextInt(10)+1;
			System.out.println(rand);
			if(rand == 6) {
				break;
			}
		}
		System.out.println("프로그램 종료");
		
		
		//난수 생성해서 맞추는 up,down 퀴즈 프로그램
		//기회를 10번만 주기
		// 1. 1~50 사이의 난수 생성하기
		
		//for문을 이용해서 up,down 퀴즈 프로그램 만들기
		//정답이 난수보다 크면 down 출력
		//정답이 난수보다 작으면 up 출력
		//정답을 맞추면 반복문 종료
		//기회는 10번(10번 이내에 맞추면 더이상 반복을 수행하지 않고 종료)
		
		
		System.out.println("---------------------");
		
		
        Scanner sc = new Scanner(System.in);
        
        int answer = new Random(). nextInt(50)+1;
        
        boolean isMatched = false;
      
        int guess = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("숫자 입력: ");
            guess = sc.nextInt();

            if (guess > answer) {
                System.out.println("down");
            } else if (guess < answer) {
                System.out.println("up");
            } else {
                System.out.println("정답");
                System.out.println((i+1)+"번째에 맞췄습니다.");
                isMatched = true;
                break;
            }		
        }
        
        if(!isMatched) {
        	System.out.println("정답을 맞추지 못했습니다.");
        }
        
        
        //중첩 반복문에서 break;
        //break문은 가까운 반복문을 종료하고 outer 반복문은 종료시키지 않는다.
        //중첩된 반복문에서 바깥쪽 반복문까지 종료시키려면 outer 반복문에 라벨을 붙이고
        //break 쪽에도 라벨을 단다.
        
        Outter:for(char upper = 'A'; upper <='Z'; upper++) {
        	for(char lower='a'; lower <='z'; lower++) {
        	System.out.println(upper + "-" + lower);
        	if(lower=='g') {
        		break Outter;
        		}
        	}
        }
        System.out.println("프로그램 실행종료");
	}
}
