package exam;

public class Student {
	   String name;
	   int age;
	   String major;

	   public Student(String name, int age, String major) {
	       this.name = name;
	       this.age = age;
	       this.major = major;
	   }

	   public void printInfo() {
	       System.out.println("이름: " + name + ", 나이: " + age + ", 전공: " + major);
	   }
	}


//1번. 클래스와 객체 기본 구현 (10점)
//다음 요구사항을 만족하는 Student 클래스를 작성하고, main 메서드에서 객체를 생성해 사용하는 코드를 작성하라
//
//요구사항
//
//Student 클래스는 다음 필드를 가진다
//- String name
//- int age
//- String major
//모든 필드를 초기화하는 생성자를 만든다
//메서드
//
//학생 정보를 “이름: 홍길동, 나이: 20, 전공: 컴퓨터공학” 형식으로 출력하는 printInfo() 메서드를 만든다
//Main 클래스를 만들고 main 메서드에서 Student 객체를 1개 생성하고 printInfo()를 호출하는 코드를 작성하라
