package ex_object;

public class Main {
	public static void main(String[] args) {
		Student s1 = new Student(1,"홍길동");
		Student s2 = new Student(1,"홍길동");
		
		//s1과 s2는 각각 new 와 생성자를 이용해서 객체를 만들었기 때문에 해시코드(주소값)이 다른게 맞다.
		
		//해시코드(주소)가 같은지 검사
		if(s1.hashCode() == s2.hashCode()) {
			//데이터가 동일한지 검사
			if(s1.equals(s2)) {
				System.out.println("동등 객체 입니다.");
			} else {
				System.out.println("데이터가 다르므로 동등 객체가 아닙니다.");
			}
		} else {
			System.out.println("해시코드가 다르므로 동등 객체가 아닙니다.");
		}
		
		SmartPhone myPhone = new SmartPhone("삼성전자", "안드로이드");
		
		System.out.println(myPhone);
		
		System.out.println(s1);
		
		User u1 = new User("홍길동",30);
		User u2 = new User("홍길동",30);
		System.out.println(u1.age());
		System.out.println(u1.name());
		u1.print();
		System.out.println(u1.hashCode());
		System.out.println(u1.equals(u2));
		
		
		
		
		
		
		
		
		
		
	}
}
