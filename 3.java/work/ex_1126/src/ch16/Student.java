package ch16;

public class Student {
	

	
	
//	Student클래스를 만들고 다음의 내용을 작성하세요
//	필드
//	String name;
//	int kor
//	int eng
//	int math
//
//	생성자를 통해서 필드를 초기화 한다.
//
//	메서드
//	int getTotal() : 총점을 반환한다.
//	double getAverage() : 평균을 소수 둘째 자리까지 반환한다.
//	char getGrade() : 평균에 따라 성적 등급을 반환한다.
//
//	StudentMain클래스에서
//	"홍길동",95,85,90 데이터를 갖는 객체를 생성하고
//	이름, 총점,평균,등급을 출력하세요

	String name;
	int kor;
	int eng;
	int math;
	

	
	//값을 받아서 필드에 넣는 생성자
	public Student(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.math = math;
		this.eng = eng;
	}
	
	// 총점을 반환하는 메서드
	
	public int getTotal() {
        return kor + eng + math;
    }

    // 평균을 소수 둘째 자리까지 반환하는 메서드
    public double getAverage() {
        return getTotal() / 3.0;
    }
    
    

    // 평균에 따라 성적 등급 반환
    public char getGrade() {
        double avg = getAverage();

        if (avg >= 90) {return 'A';
        }else if (avg >= 80) {return 'B';
        }else if (avg >= 70) {return 'C';
        }else if (avg >= 60) {return 'D';
        }else {return 'F';}
        
    }
}
