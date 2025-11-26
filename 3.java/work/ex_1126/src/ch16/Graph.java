package ch16;

import java.util.Random;

public class Graph {
//	Graph클래스를 만들고 main()메서드를 갖는다.
//	0~9사이의 난수를 100개 저장하는 배열을 만들고,
//	해당 배열이 가지고 있는 0 ~9사이의 난수가 몇개씩 있는지 판별하고
//	그래프화 한다.
//	발생한 난수의 그래프화 작업은 PrintGraph클래스에서 print메서드를
//	만들어서 작업한다.
//
//	결과:
//	0507...... //난수 100개
//	0의 갯수 : ############ 12
//	1의 갯수 : ######### 9
//	2의 갯수 : ########### 11
//	3의 갯수 : ######## 8
//	4의 갯수 : ############## 14
//	5의 갯수 : ####### 7
//	6의 갯수 : ######### 9
//	7의 갯수 : ############# 13
//	8의 갯수 : ####### 7
//	9의 갯수 : ########## 10
	
	
	public static void main(String[] args) {
        Random rand = new Random();
        int[] number = new int[100]; // 0~9 난수 100개 저장
        int[] count = new int[10];   // 0~9 각 숫자 카운트

        System.out.print("난수 100개: ");
        for (int i = 0; i < number.length; i++) {
        	
            number[i] = rand.nextInt(10); // 0~9 난수
            System.out.print(number[i]);
            count[number[i]]++;          // 해당 숫자 카운트
        }
        System.out.println(); // 줄바꿈

        // 그래프 출력
        PrintGraph pg = new PrintGraph();
        pg.print(count);
    }
}
