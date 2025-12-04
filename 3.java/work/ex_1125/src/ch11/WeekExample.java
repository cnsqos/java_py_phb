package ch11;

import java.time.DayOfWeek;
import java.util.Calendar;

public class WeekExample {
	public static void main(String[] args) {
		//열거 타입도 하나의 데이터 타입이기 때문에 변수를 선언하고 사용해야한다.
		Week today = null;
		
		//날짜 및 시간 정보를 가진 객체
		Calendar cal = Calendar.getInstance();
		
		//오늘의 요일 얻기
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		switch(week) {
		case 1:
			today = Week.SUNDAY;
			break;
		case 2:
			today = Week.MONDAY;
			break;
		case 3:
			today = Week.TUESDAY;
			break;
		case 4:
			today = Week.WENDSDAY;
			break;
		case 5:
			today = Week.THURSDAY;
			break;
		case 6:
			today = Week.FRIDAY;
			break;
		case 7:
			today = Week.SATURDAY;
			break;
		}
		
		if(today == Week.SUNDAY) {
			System.out.println("일요일에는 축구를 합니다.");
		} else {
			System.out.println("열심히 자바를 공부합니다.");
		}
		
		
		//열거형을 직접 만들어서 쓸 일은 크게 많지 않다.
		//자바에서 여러가지 값들을 열거형에 담아서 제공하는 것들이 좀 있다.
		//열거형을 어떻게 사용하는지 정도는 아는게 좋다.
		
		
		
		
		
		
		
	}
}
