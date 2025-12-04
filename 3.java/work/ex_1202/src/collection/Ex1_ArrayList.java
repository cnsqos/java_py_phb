package collection;

import java.util.ArrayList;

//ArrayList는 List 인터페이스의 구현체(implements)
//배열처럼 index가 있다.
//크기의 제한이 없다.
//삽입,변경,삭제의 기능이 자유롭다.
//데이터의 크기를 특정할 수 없는 다량의 데이터를 저장할 때
//용이하게 사용할 수 있다.
public class Ex1_ArrayList {
	public static void main(String[] args) {
		//리스트 초기화
		ArrayList<String> list = new ArrayList<>();
		
		//리스트에 데이터 추가하기
		list.add("딸기");
		list.add("사과");
		list.add("망고");
		
		//리스트의 출력
		System.out.println(list);
		
		//원하는 위치에 데이터 넣기
		list.add(2,"수박");
		
		System.out.println(list);
		
		//데이터의 수정
		list.set(1, "복숭아");
		
		System.out.println(list);
		
		//데이터의 삭제
		list.remove(2);
		
		System.out.println(list);
		
		//ArrayList에 들어있는 요소 꺼내기
		System.out.println(list.get(0));
		
		//ArrayList의 크기
		//size();
		System.out.println(list.size());
		
		//특정 value를 포함하고 있는지 검사
		//contains()
		System.out.println(list.contains("바나나"));
		
		//리스트가 비어있는지 확인
		//isEmpty()
		System.out.println(list.isEmpty());
		
		//리스트의 모든 요소 삭제
		//clear();
		//list.clear();
		//System.out.println(list);
		
		//요소의 위치찾기
		//indexOf()
		System.out.println(list.indexOf("복숭아"));
		System.out.println(list.indexOf("포도"));
		
	}
}







