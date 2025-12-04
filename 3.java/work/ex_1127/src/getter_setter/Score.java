package getter_setter;

public class Score {

	private int kor;
	private int eng;
	private int math;
	
	public int getKor() {
		return kor;
	}
	
	public void setKor(int kor) {
		if(kor < 0 || kor > 100) {
			System.out.println("점수는 0 ~ 100 사이여야 합니다.");
		}
		this.kor = kor;
	}
	
	public int getEng() {
		return eng;
	}
	
	public void setEng(int eng) {
		if(eng < 0 || eng > 100) {
			System.out.println("점수는 0 ~ 100 사이여야 합니다.");
		}
		this.eng = eng;
	}
	
	public int getMath() {
		return math;
	}
	
	public void setMath(int math) {
		if(math< 0 || math > 100) {
			System.out.println("점수는 0 ~ 100 사이여야 합니다.");
		}
		this.math = math;
	}
	
	//총점을 구하는 getTotal()
	public int getTotal() {
		return kor + eng + math;
	}
	
	//평균을 구하는 getAverage()
	public double getAverage() {
		return getTotal() / 3.0;
	}
}







