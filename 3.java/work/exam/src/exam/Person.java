package exam;

public class Person {
	String name;
	int age;
	
	
	 public Person(String name, int age) {
	       this.name = name;
	       this.age = age;
	   }

	 public void introduce() {
	       System.out.println("안녕하세요, 저는 " + name + "이고 " + age + "살입니다");
	   }
	
}


//5번. 상속 기본 – Person / Student (10점)
//사람과 학생을 클래스로 표현하라
//
//요구사항
//
//Person 클래스
//필드: String name, int age
//생성자: 두 필드를 초기화하는 생성자
//메서드: void introduce() “안녕하세요, 저는 홍길동이고 20살입니다” 출력
// 


