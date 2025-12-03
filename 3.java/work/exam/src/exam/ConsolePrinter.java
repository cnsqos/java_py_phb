package exam;

public class ConsolePrinter implements Printable {
	   public void print(String message) {
	       System.out.println(message);
   }
}

//ConsolePrinter 클래스
//Printable 구현
//print 구현 → 매개변수로 전달된 message를 콘솔에 출력한다.
