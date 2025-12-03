package exam;

public class Point {

		   int x, y;

		   public Point() {
		       this.x = 0;
		       this.y = 0;
		   }

		   public Point(int x, int y) {
		       this.x = x;
		       this.y = y;
		   }

		   public void printPoint() {
		       System.out.println("(x=" + x +", y=" + y + ")");
		   }
		}
	
	
	
//
//3번. 생성자 오버로딩 (10점)
//2차원 좌표를 나타내는 Point 클래스를 작성하라
//
//요구사항
//
//Point 클래스는 다음의 필드를 가진다.
//- int x
//- int y
// 
//다음 두 생성자를 오버로딩한다
//- 매개변수 없는 기본 생성자 → x = 0, y = 0으로 초기화
//- Point(int x, int y) → 전달받은 값으로 초기화
//메서드
//현재 좌표를 (x=3, y=5) 형식으로 출력하는 printPoint() 메서드를 만든다

//main 메서드에서 기본 생성자로 만든 Point 객체 1개 매개변수 있는 생성자로 만든 Point 객체 1개 를 생성하고 각각 printPoint()를 호출하는 코드를 작성하라