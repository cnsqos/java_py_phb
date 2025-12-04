package overriding;

public class Student extends Person{

	@Override
	void introduce() {
		System.out.println("학생입니다.");
	}
}
