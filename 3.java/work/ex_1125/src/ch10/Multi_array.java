package ch10;

import java.util.Random;

public class Multi_array {
	public static void main(String[] args) {
		//2차원 배열의 생성
		int[][] scores = {{80,90,96},{76,88}};
		
		//2차원 배열의 길이?
		System.out.println(scores.length);
		
		//첫번째 요소의 길이
		//scores[0] = {80,90,96};
		System.out.println(scores[0].length);
		//두번째 요소의 길이
		System.out.println(scores[1].length);
		
		//2차원 배열에서 데이터에 접근하는 방법
		//배열명[2차원 배열의 요소의 index][요소에서 데이터의 index]
		//96출력해보기
		System.out.println(scores[0][2]);
		
		//2차원 배열의 첫번째 요소의 데이터들의 평균 구하기
		int sum = 0;
		for(int i = 0; i<scores[0].length; i++) {
			sum += scores[0][i];
		}
		
		double avg = (double)sum/scores[0].length;
		System.out.println("평균 점수 : " + avg);
		
		//2차원 배열의 생성
		//자료형 [][] 변수명 = new 자료형 [길이][1차원 배열의 길이];
		
		int[][] arr = new int[3][3];
		
		//1차원 배열의 길이는 미리 지정하지 않아도 된다.
		//자료형[][] 변수명 = new 자료형[길이][];
		
		int[][] ar = new int[3][];
		//2차원 배열의 각각의 요소의 길이를 따로 설정할 수 있다.
		ar[0] = new int[2];
		ar[1] = new int[3];
		ar[2] = new int[1];
		
		int n = 0;
		for(int i = 0; i < ar.length; i++) {
			
			for(int j = 0; j < ar[i].length; j++) {
				ar[i][j] = n+=100;
				System.out.print(ar[i][j]+" ");
			}
			
			System.out.println();
		}
		
		//각 반의 학생들의 점수 저장을 위한 2차원 배열 생성하기
		//반은3개고 학생수는 1반은 4명, 2반은 2명, 3반은 6명
		int[][] mathscores = new int[3][];
		
		mathscores[0] = new int[4];
		mathscores[1] = new int[2];
		mathscores[2] = new int[6];
		
		//각 학생들의 점수를 난수로 넣기 (1 ~ 100 사이)
		for(int i = 0; i < mathscores.length; i++) {
			for(int j = 0; j < mathscores[i].length;j++) {
				mathscores[i][j] = new Random().nextInt(100)+1;
			}
		}
		
		//각 반의 평균 구하기
		for(int i = 0; i < mathscores.length; i++) {
			
			int total = 0;//각 반의 점수를 담기 위해 초기화(reset)
			
			for(int j = 0; j < mathscores[i].length;j++) {
				total += mathscores[i][j];
			}
			
			double avg2 = (double)total/mathscores[i].length;
			System.out.println((i+1)+"반의 평균 : " + avg2);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
