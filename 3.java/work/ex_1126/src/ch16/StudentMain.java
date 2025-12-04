package ch16;

public class StudentMain {
	public static void main(String[] args) {
		Student s = new Student("홍길동", 95, 85, 90);
		
		System.out.println("이름 : " + s.name);
		System.out.println("총점 : " + s.getTotal());
		System.out.println("평균 : " + s.getAverage());
		System.out.println("학점 : " + s.getGrade());
	}
}
