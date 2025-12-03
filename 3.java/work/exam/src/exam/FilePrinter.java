package exam;

public class FilePrinter implements Printable {
	   public void print(String message) {
	       System.out.println("파일에 출력: " + "["+message+"]");
   }
}


//FilePrinter 클래스
//Printable 구현
//실제 파일 입출력 대신 “파일에 출력: [메시지]” 형식으로만 콘솔에 출력한다
//