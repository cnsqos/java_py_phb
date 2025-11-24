package ch09;

public class ArrayExample1 {
	public static void main(String[] args) {
		String[] season = {"Spring","Summer","Fall","Winter"};
		
		//배열의 요소에 접근하는 법
		//변수명[index] -> 변수처럼 사용
		//season[0] -> "Spring"이 들어있음
		
		System.out.println(season[0]);
		System.out.println(season[1]);
		System.out.println(season[2]);
		System.out.println(season[3]);
		
		//인덱스 1번의 요소의 값을 변경
		//"여름"
		
		season[1] = "여름";
		System.out.println(season[1]);
		
		
		
		int[] scores = {83,90,87};
		
		//총합과 평균 구하기 
		
		
		int sum = 0;

		for (int i = 0; i < scores.length; i++ ) {
			sum += scores[i];
		}
		System.out.println("총합: " + sum);
		
		int avg = sum / scores.length;

		System.out.println("평균: " + avg);
		
		
		
		
		//짝수의 개수와 홀수의 개수를 출력하세요
		int[] arr = { 7, 14, 23, 38, 41, 56, 63, 72, 89, 100 };
		
		
		int evenCount = 0;
		int oddCount = 0; 

		for (int i = 0; i < arr.length; i++) {
		    if (arr[i] % 2 == 0) {
		        evenCount++;
		    } else {
		        oddCount++;
		    }
		}

		System.out.println("짝수의 개수: " + evenCount);
		System.out.println("홀수의 개수: " + oddCount);
		
		
		
		
	}
}
