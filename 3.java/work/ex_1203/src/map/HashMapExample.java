package map;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapExample {
	public static void main(String[] args) {
		//HashMap
		//Map 인터페이스를 구현하는 자식 클래스 중 가장 많이 사용하는 클래스
		//key,value를 한쌍을 요소로 갖는다.
		//key와 value의 제네릭타입을 각각 설정해줘야 한다.
		
		HashMap<Integer, Character> map = new HashMap<Integer, Character>();
		
		//map에 데이터 추가하기
		//put(key,value);
		map.put(1, 'A');
		map.put(2, 'B');
		map.put(3, 'C');
		map.put(4, 'D');
		
		System.out.println(map);
		
		//map에 저장되는 key는 중복될 수 없다.
		//value는 중복이 될 수 있다.
		map.put(5, 'A');
		
		map.put(1, 'F');//같은 이름을 가진 key가 있다면 value를 갱신하게 된다.
		
		System.out.println(map);
		
		//요소의 삭제
		//remove(key)
		map.remove(3);
		System.out.println(map);
		
		//map의 크기
		//size()
		System.out.println("map의 크기 : " + map.size());
		
		//map에서 value 꺼내기
		//get(key)
		char res = map.get(1);
		System.out.println(res);
		
		//getOrDefault(key,defaultValue);
		//get()은 없으면 null을 반환한다.
		//getOrDefault()는 없으면 기본값을 반환하기 때문에 실무에서 자주 쓰인다.
		Character v1 = map.getOrDefault(9,'0');
		
		
		//비어있는지 검증
		//isEmpty()
		if(!map.isEmpty()) {
			System.out.println("map은 비어있지 않습니다.");
		}
		
		//map 특정 key가 들어있는지 검증
		//containsKey(key)
		System.out.println(map.containsKey(1));
		
		//map에 특정 value가 들어있는지 검증
		//containsValue(value)
		System.out.println(map.containsValue('F'));
		
		
		HashMap<String, Integer> users = new HashMap<String, Integer>();
		users.put("kim", 1111);
		users.put("lee", 2222);
		users.put("park", 3333);
		
		//아이디와 비밀번호를 입력받는다.
		
		//로그인 기능 만들기
		
		//아이디(key)가 없으면 "아이디가 존재하지 않습니다."
		//비밀번호가 일치하지 않을 때 "비밀번호 불일치";
		//아이디와 비밀번호가 일치하면 "로그인 성공"
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("id : ");
		String id = sc.next();
		System.out.print("pw : ");
		int pw = sc.nextInt();
		
		if(!users.containsKey(id)) {
			System.out.println("아이디가 존재하지 않습니다.");
		} else {
			if(users.get(id) != pw) {
				System.out.println("비밀번호 불일치");
			} else {
				System.out.println("로그인 성공");
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
