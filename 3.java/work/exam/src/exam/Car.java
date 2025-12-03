package exam;

public class Car implements Movable {
	   int x;
	   int y;

	   public Car(int x, int y) {
	       this.x = x;
	       this.y = y;
	   }

	   public void move(int x, int y) {
	       this.x = x;
	       this.y = y;
	       System.out.println("자동차가 (" + x + "," + y + ") 위치로 이동했습니다");
	   }
	}



//Car 클래스
//Movable을 구현한다
//필드: int x, int y (현재 위치)
//생성자: 초기 위치를 설정하는 생성자

//move(int x, int y) 구현 → x, y 필드를 전달받은 값으로 변경하고 “자동차가 (10, 20) 위치로 이동했습니다”출력


//main 메서드에서
//Movable 타입 변수에 Car 객체를 참조시키고
//move를 한 번 호출하여 결과를 출력하는 코드를 작성하라