package ex_object;

public class Student {
	private int no;
	private String name;
	
	public Student(int no, String name) {
		this.no = no;
		this.name = name;
	}
	
	public int getNo() {
		return no;
	}
	
	public String getName() {
		return name;
	}
	
	//object의 hashCode()메서드를 재정의해서 학생 번호와 이름
	//해시코드를 합한 새로운 해시코드를 반환한다.
	@Override
	public int hashCode() {
		int hashCode = no + name.hashCode();
		return hashCode;
	}
	
	@Override
	public boolean equals(Object obj) {
		//매개변수로 넘어온 객체가 Student객체인지 확인하고, 
		if(obj instanceof Student target) {
			//학생 번호가 같고, 이름이 같으면 true를 반환
			if(no == target.getNo() && name.equals(target.getName())) {
				return true;
			}
		}
		return false;
	}
	
	
	
}
