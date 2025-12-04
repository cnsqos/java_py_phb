package set;

import java.util.HashSet;
import java.util.Random;

public class HashSetExample {
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		
		hs.add("a");
		hs.add("f");
		hs.add("c");
		hs.add("e");
		hs.add("b");
		
		System.out.println(hs);
		
		//HashSet에 데이터가 저장되는 방법
		//동일한 값을 허용하지 않는다.
		//동일한 객체란, 꼭 같은 타입의 객체를 의미하는것은 아니다.
		//HashSet은 데이터를 객체의 hashCode()값을 호출하여 비교하고
		//같으면 equals()메서드를 호출하여 다시 비교해 두 객체가 같음을 증명한다.
		
		hs.add("a"); //문법적으로 에러가 나는것은 아니고 추가가 안된다.
		hs.add("b");
		
		System.out.println(hs);
		
		hs.remove("a");
		
		System.out.println(hs);
		
		hs.clear(); //void
		
		hs.removeAll(hs); //boolean
		
		System.out.println(hs);
		
		//배열할 때 로또번호 뽑기
		//중복되는거 넣지 마라,다시 뽑아라, 6개를뽑아라
		
		//Set이 중복되는 값이 들어가지 않는다는 점을 이용해서
		//난수를 생성해서 넣기가 좋다.
		
		//1 ~ 45 사이의 난수 6개를 뽑아서 넣기
		HashSet<Integer> lotto = new HashSet<Integer>();
		
		while(true) {
			int r = new Random().nextInt(45)+1;
			lotto.add(r);
			
			if(lotto.size() == 6) {
				break;
			}
		}
		
		System.out.println(lotto);
		
		
		
		
		
		
		
		
		
		
	}
}
