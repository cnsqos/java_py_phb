package ch16;

public class Student {
	String name;
	int kor;
	int eng;
	int math;
	
	public Student(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	//총점
	public int getTotal() {
		return kor+eng+math;
	}
	
	//평균
	public double getAverage() {
		return getTotal()/3.0;
	}
	
	public char getGrade() {
		double avg = getAverage();
		
		if(avg >= 90) {
			return 'A';
		} else if(avg >= 80) {
			return 'B';
		}else if(avg >= 70) {
			return 'C';
		}else if(avg >=60) {
			return 'D';
		} else {
			return 'F';
		}
	}
	
	
	
	
	
	
	
	
	
	
	
}
