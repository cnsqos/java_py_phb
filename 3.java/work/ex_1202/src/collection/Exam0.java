package collection;

import java.util.ArrayList;

public class Exam0 {
	
	public static void main(String[] args) {
		
	
	//정수타입의 ArrayList arr을 만든다.
	//정수10,20,30,40,50을 추가한다.
	//모든요소의 합과 평균을 출력한다.
	
        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(50);

        // 합계 구하기
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }

        // 평균 구하기
        double avg = sum / (double) arr.size();

        System.out.println("합계 : " + sum);
        System.out.println("평균 : " + avg);
        
        
    	//문자열 타입의 ArrayList words를 만든다.
    	//문자열들을 추가한다.
    	//3글자 이상의 문자열을 longWords라는 ArrayList를 만들어서 저장한다.
    	//"자바","파이썬","C","JavaScript","Go","Oracle"
    	
    	ArrayList<String> words = new ArrayList<>();

     
        words.add("자바");
        words.add("파이썬");
        words.add("C");
        words.add("JavaScript");
        words.add("Go");
        words.add("Oracle");

    	
        
        ArrayList<String> longWords = new ArrayList<>();

        
        for (String w : words) {
            if (w.length() >= 3) {
                longWords.add(w);
            }
        }

        // 결과 출력
        System.out.println("3글자 이상 단어: " + longWords);
    }
         
       
}
	

