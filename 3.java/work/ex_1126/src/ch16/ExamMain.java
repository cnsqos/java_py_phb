package ch16;

public class ExamMain {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		//다른 클래스에 있는 메서드를 사용하려면 해당 클래스의 객체를
		//만들어야 한다.
		
		//자바에서 변수를 만들 때 넣으려는 데이터의 타입을 명시
		
		//객체 생성 방법
		//클래스명 변수명  = new 클래스명();
		
		//클래스명 변수명;
		//변수명 = new 클래스명();
		
		Exam1 exam = new Exam1();
		
		exam.maxFinder(arr);
		
		System.out.println("원의 넓이 : " + exam.circleArea(5));
		
		exam.circleRound(5);
		
		exam.fToc();
		
		System.out.println(exam.calc(5, 10, "+"));
		
		Timestable tt = new Timestable();
		
		tt.showTable(5);
		
		
		
		
		
		
	}
}
