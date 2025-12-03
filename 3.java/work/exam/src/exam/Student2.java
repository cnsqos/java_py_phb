package exam;

public class Student2 extends Person {
	   String major;

	   public Student2(String name, int age, String major) {
	       super(name, age);
	       this.major = major;
	   }

	   @Override
	   public void introduce() {
	       System.out.println("안녕하세요, 저는 " + name + "이고 " + age + "살, 전공은 " + major + "입니다");
	   }
	}

//Student 클래스
//Person 클래스를 상속받는다
//추가 필드: String major
//생성자: 이름, 나이, 전공을 모두 초기화하는 생성자
//메서드: void introduce()를 오버라이딩하여 “안녕하세요, 저는 홍길동이고 20살, 전공은 컴퓨터공학입니다” 출력
//main 메서드에서 Student 객체를 생성하고 introduce()를 호출하는 코드를 작성하라