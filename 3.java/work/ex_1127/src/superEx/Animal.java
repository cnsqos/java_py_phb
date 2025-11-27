package superEx;

public class Animal {

	String name;
	
	
	public Animal(String name) {
        this.name = name;
    }


    public void info() {
        System.out.println("이름 : " + name);
    }
	
	
//	부모클래스 : Animal 클래스
//	필드 
//	String name;
//
//	생성자를 통해 필드의 이름을 초기화 시킨다.
//
//	메서드
//	info() : "이름 : xx"라고 출력하기
//
//	자식클래스 : Dog 클래스
//	필드
//	int age
//
//	생성자를 통해 필드의 값을 초기화 한다.
//
//	Main에서 객체 만들고 출력하기

}
