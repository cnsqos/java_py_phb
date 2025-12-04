package ch07;

public class Continue {

	public static void main(String[] args) {
		//Continue
		//현재 반복을 건너뛰고 다음 반복을 실행한다.
		//for문은 증감식으로 이동하고, while문은 조건식으로 이동한다.
		
		for(int i = 1; i<=10;i++) {
			if(i%2 != 0) {
				continue;
			}
			System.out.println(i+" ");
		}
		
		for(int i = 1; i<=10;i++) {
			if(i%2 == 0) {
				System.out.println(i+" ");
			}
		}
		
		//불필요한 조건 검사를 줄일 수 있다.
		for(int i =1; i<=100; i++) {
			//10보다 크고, 50보다 작으면서, 3의 배수인 숫자
//			if( i> 10 && i < 50 && i %3 == 0) {
//				System.out.println(i);
//			}
			//필터링 단계가 깔끔해진다.
			if( i <= 10) {
				continue;
			}
			
			if( i >= 50) {
				continue;
			}
			
			if( i % 3 != 0) {
				continue;
			}
			
			
		}
		
//		int x = 0;
//		
//		while(x < 10) {
//			if(x % 2 != 0) {
//				continue;
//			}
//			System.out.println(x);
//			x++;
//		}
		
		//continue도 중첩일 때 바깥쪽 반복으로 돌아가고 싶다면 label을 붙인다.
		outer:for(int i =1; i <=3; i++) {
			for(int j = 1; j<=5; j++) {
				if(j ==2) {
					continue outer;
				}
				System.out.printf("i=%d, j=%d\n",i,j);
			}
		}
		

	}
}







