package getter_setter;

public class Score {
	private int kor;
	private int eng;
	private int math;
	
	 
	
//	Score 클래스
//	필드(모두 private)
//	int kor;
//	int eng;
//	int math;
//
	public int getKor() {
		return kor;
	}
	
	public void setKor(int kor) {
        if(kor < 0 || kor > 100) {
            System.out.println("점수는 0 ~ 100 사이여야 한다");
            return;
        }
        this.kor = kor;
    }

	
	public int getEng() {
		return eng;
	}

    public void setEng(int eng) {
        if(eng < 0 || eng > 100) {
            System.out.println("점수는 0 ~ 100 사이여야 한다");
            return;
        }
        this.eng = eng;
    }
    

	public int getMath() {
		return math;
	}

    public void setMath(int math) {
        if(math < 0 || math > 100) {
            System.out.println("점수는 0 ~ 100 사이여야 한다");
            return;
        }
        this.math = math;
    }
	
//	setter 메서드를 이용해서 점수를 세팅
//	0미만, 100초과면 "점수는 0 ~ 100사이여야 한다"출력하고
//	값 저장하지 않기
//	각 점수에 대한 getter메서드 만들기

	
	public double getTotal() {
		return kor+eng+math;
	}
    
//	메서드
//	총점을 구하는 getTotal()
//
	
	public double getAverage() {
		return getTotal()/3.0;
	}
	
//	평균을 구하는 getAverage()

	
	
//	Main클래스에서
//	국,영,수 점수를 출력하고, 총점과 평균도 출력하기
	
	
	
}
