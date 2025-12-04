package collection;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		//Student 객체를 list에 저장할 수 있다.
		ArrayList<Student> list = new ArrayList<>();
		
		list.add(new Student("홍길동",90));
		list.add(new Student("김철수",75));
		list.add(new Student("이영희",88));
		
		for(Student s : list) {
			System.out.println(s.name + " " + s.score);
		}
		
		//가장 높은 점수를 받은 학생의 이름과 점수 출력하기
		
		Student top = list.get(0);
		
		for(Student s : list) {
			if(s.score > top.score) {
				top = s;
			}
		}
		
		System.out.println("이름 : " + top.name + " / " + top.score+"점");
		
		
		
		
		//유저의 정보를 키보드에서 입력받아 ArrayList에 추가를 한다.
		//아이디가 생성될 때 list에 이미 아이디가 저장되어 있다면
		//아이디가 중복됩니다 출력하고 다시 입력받기
		ArrayList<UserInfo> users = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		outer:while(true) {
			//아이디 입력
			System.out.print("아이디 생성 : ");
			UserInfo ui = new UserInfo();
			ui.setId(sc.next());
			
			//검증
			for(int i = 0; i < users.size(); i++) {
				if(ui.getId().equals(users.get(i).getId())) {
					System.out.println("아이디가 중복됩니다.");
					continue outer;
				}
			}
			//비밀번호 입력
			System.out.print("패스워드 입력 : ");
			ui.setPwd(sc.nextInt());
			
			//리스트에 추가
			users.add(ui);
			
			for(int i = 0; i< users.size(); i++) {
				System.out.println(users.get(i).getId());
				System.out.println(users.get(i).getPwd());
				System.out.println("---------------------");
			}
			
			if(users.size()==3) {
				break;
			}
		}
		
		//정수타입의 ArrayList arr을 만든다.
		//정수 10,20,30,40,50을 추가한다.
		//모든 요소의 합과 평균을 출력한다.
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(10);
		arr.add(20);
		arr.add(30);
		arr.add(40);
		arr.add(50);
		
		int sum = 0;
		for(int i : arr) {
			sum += i;
		}
		
		double avg = (double)sum / arr.size();
		
		//문자열 타입의 ArrayList words를 만든다.
		//문자열들을 추가한다.
		//3글자 이상의 문자열들을 longWords라는 ArrayList를
		//만들어서 저장한다.
		//"자바","파이썬","C","JavaScript","Go","Oracle"
		
		ArrayList<String> words = new ArrayList<String>();
		
		words.add("자바");
		words.add("파이썬");
		words.add("C");
		words.add("JavaScript");
		words.add("Go");
		words.add("Oracle");
		
		ArrayList<String> longWords = new ArrayList<String>();
		
		for(String s : words) {
			if(s.length() >= 3) {
				longWords.add(s);
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
