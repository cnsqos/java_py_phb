package ch16;

import java.util.Random;

public class Graph {
	public static void main(String[] args) {
		int[] num = new int[100]; //난수들을 담을 배열
		int[] count = new int[10]; //난수가 몇개씩 나왔는지 담을 배열
		
		for(int i = 0; i < num.length; i++) {
			System.out.print((num[i] = new Random().nextInt(10))+" ");
			
		}
		System.out.println();
		
		//각 난수가 몇개씩 나왔는지 세기
		for(int i =0; i < num.length; i++) {
			count[num[i]]++;
		}
		
		//count배열을 가지고 그래프 그리기
		
		PrintGraph pg = new PrintGraph();
		for(int i = 0; i < count.length; i++) {
			System.out.println(i+"의 개수 : " + pg.print('#', count[i])+" " + count[i]);
		}
		
		
		
		
		
		
		
		
		
		
	}
}
