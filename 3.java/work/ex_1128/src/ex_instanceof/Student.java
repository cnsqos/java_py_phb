package ex_instanceof;

public class Student extends Person{
	
	int studentNo;
	
	public Student(String name, int studentNo) {
		super(name);
		this.studentNo = studentNo;
	}
	
	public void study() {
		System.out.println("공부를 한다.");
	}
}
