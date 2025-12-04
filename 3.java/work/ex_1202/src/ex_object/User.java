package ex_object;

public record User(String name, int age) {
	//메서드를 추가하는것도 가능하다.
	public void print() {
		System.out.println("이름 : "+name + ", 나이 : " + age);
	}
}

//레코드로 만들게 되면 컴파일러가 자동으로 코드를 만들어준다.
//1. 매개변수에 있는 것들을 private final 필드로 만들어준다.
//2. 매개변수를 받는 생성자를 만들어준다.
//3. 필드의 값을 반환하는 메서드를 만들어준다.
//4. equals, hashCode, toString메서드를 오버라이딩 한다.

//레코드는 불변객체라서 setter도 필요 없고, 어차피 필드도 모두 final이라서
//변경이 불가능하다.








