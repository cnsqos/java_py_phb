package ex_object;

//자바의 최상위 클래스는 Object이다.
//모든 클래스는 Object를 상속받고 있다.
public class Member {

	public String id;
	
	public Member(String id) {
		this.id = id;
	}
	
	//equals()메서드를 오버라이드 할 수 있다.
	@Override
	public boolean equals(Object obj) {
		//obj가 Member타입인지 검사하고 타입변환 후 target변수에 대입
		if(obj instanceof Member target) {
			if(id.equals(target.id)) {//id문자열이 같은지 비교
				return true;
			}
		} return false;
	}
	
	
	
	
	
	
	
}
